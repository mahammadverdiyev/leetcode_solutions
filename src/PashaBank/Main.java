package PashaBank;

import java.util.*;

class EventData
{
    public String teamName;
    public String employee;
    public String secondEmployee;
    public String eventName;
    public String timeStr;
    public int time;
    public int sumTime;

    public EventData(String team, String employee, String time, String event, String secondEmployee)
    {
        teamName = team;
        this.employee = employee;
        eventName = event;

        time = time.trim();

        timeStr = time;

        String tempTime = time;

        if (time.contains("+"))
        {
            String[] splitted = time.split("\\+");
            tempTime = splitted[0];
            sumTime = Integer.parseInt(splitted[0]) + Integer.parseInt(splitted[1]);
        }

        this.time = Integer.parseInt(tempTime);

        this.secondEmployee = secondEmployee;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(teamName).append(" ").append(employee)
                .append(" ").append(timeStr).append(" ")
                .append(eventName).append(" ").append(secondEmployee);
        return sb.toString().trim();
    }
}

public class Main
{

    public static int[] nameIndexes(String data)
    {
        int[] indexes = new int[2];
        String eventNames = "GYRS";

        int lastIndex = 0;
        for (int i = 0; i < data.length(); i++)
        {
            if (Character.isDigit(data.charAt(i)) && indexes[0] == 0)
            {
                indexes[0] = i;
            }
            if (eventNames.contains(String.valueOf(data.charAt(i))))
            {
                if ((i + 1) != data.length())
                    indexes[1] = i + 1;
                else
                    indexes[1] = -1;
                break;
            }
        }

        return indexes;
    }

    public static void addGivenEvents(List<EventData> allEventData, List<String> events, String team)
    {
        for (int i = 0; i < events.size(); i++)
        {
            int[] indexes = nameIndexes(events.get(i));

            String employeeName = events.get(i).substring(0, indexes[0]).trim();
            String secondEmployee = "";

            if (indexes[1] != -1)
            {
                secondEmployee = events.get(i).substring(indexes[1]).trim();
            }
            String[] data;

            if (indexes[1] != -1)
                data = events.get(i).substring(indexes[0], indexes[1] + 1).split(" ");
            else
                data = events.get(i).substring(indexes[0]).split(" ");

            allEventData.add(new EventData(team, employeeName, data[0], data[1], secondEmployee));
        }
    }

    public static List<String> getEventsOrder(String team1, String team2,
                                              List<String> events1, List<String> events2)
    {
        HashMap<String, Integer> eventNameValues = new HashMap<>();
        eventNameValues.put("G", 1);
        eventNameValues.put("Y", 2);
        eventNameValues.put("R", 3);
        eventNameValues.put("S", 4);


        List<EventData> allEventData = new ArrayList<>(events1.size() + events2.size());

        addGivenEvents(allEventData, events1, team1);
        addGivenEvents(allEventData, events2, team2);

        allEventData.sort(Comparator.comparingInt((EventData data) -> data.time)
                .thenComparing((EventData data) -> data.sumTime)
                .thenComparing((EventData data) -> eventNameValues.get(data.eventName))
                .thenComparing((EventData data) -> data.teamName));


        List<String> orderedEventData = new ArrayList<>(allEventData.size());

        for (EventData eventData : allEventData)
        {
            orderedEventData.add(eventData.toString());
        }

        return orderedEventData;
    }

    public static void main(String[] args)
    {
        String team1 = "edc";
        List<String> events1 = new ArrayList<>();
        events1.add("alex 12 G");
        events1.add("sam 43 Y");

        String team2 = "cde";
        List<String> events2 = new ArrayList<>();
        events2.add("kris 45+1 S avery");
        events2.add("robin 46 G");

        System.out.println(
                getEventsOrder(team1, team2, events1, events2)
        );
    }
}
