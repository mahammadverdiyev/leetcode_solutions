package problem1828;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Point
{
    private final int x;
    private final int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public static double distanceBetween(Point p1, Point p2)
    {
        int x1 = p1.getX();
        int y1 = p1.getY();
        int x2 = p2.getX();
        int y2 = p2.getY();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }
}


class Circle
{
    private final int radius;
    private final Point centerPoint;

    public Circle(Point centerPoint, int radius)
    {
        this.centerPoint = centerPoint;
        this.radius = radius;
    }

    public boolean isInside(Point point)
    {
        double distance = Point.distanceBetween(point,centerPoint);

        return distance <= radius;
    }
}

public class Solution
{
    public int[] countPoints(int[][] points, int[][] queries)
    {
            List<Point> pointList = Arrays.stream(points).map(arr -> new Point(arr[0],arr[1])).collect(Collectors.toList());

            int[] result = Arrays.stream(queries).mapToInt(arr -> {
                Circle circle = new Circle(new Point(arr[0],arr[1]),arr[2]);
                AtomicInteger insidePointCounter = new AtomicInteger();
                pointList.forEach(point -> {
                    if(circle.isInside(point)){
                        insidePointCounter.incrementAndGet();
                    }
                });

                return insidePointCounter.get();
            }).toArray();


        return result;
    }
}
