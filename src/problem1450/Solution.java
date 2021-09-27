package problem1450;

public class Solution
{
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int studentCounter = 0;

        for (int i =0; i < startTime.length; i++){
            if(queryTime  >= startTime[i] && queryTime < endTime[i]
             || queryTime <= endTime[i] && queryTime > startTime[i]
            || queryTime > startTime[i] && queryTime < endTime[i]
            || queryTime == startTime[i] && queryTime == endTime[i]) {
                studentCounter++;
            }
        }
        return studentCounter;
    }
}
