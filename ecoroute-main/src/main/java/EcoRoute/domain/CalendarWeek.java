package EcoRoute.domain;

import EcoRoute.domain.Enums.Status;
import EcoRoute.domain.Enums.WeekDays;

import java.util.ArrayList;

public class CalendarWeek
{
    protected ArrayList<DayStatus> dayStatusList = new ArrayList<>();

    public CalendarWeek() {
        dayStatusList.add(new DayStatus(WeekDays.Monday.toString(), Status.unavailable.toString()));
        dayStatusList.add(new DayStatus(WeekDays.Tuesday.toString(), Status.unavailable.toString()));
        dayStatusList.add(new DayStatus(WeekDays.Wednesday.toString(), Status.unavailable.toString()));
        dayStatusList.add(new DayStatus(WeekDays.Thursday.toString(), Status.unavailable.toString()));
        dayStatusList.add(new DayStatus(WeekDays.Friday.toString(), Status.unavailable.toString()));
        dayStatusList.add(new DayStatus(WeekDays.Saturday.toString(), Status.unavailable.toString()));
        dayStatusList.add(new DayStatus(WeekDays.Sunday.toString(), Status.unavailable.toString()));
    }

    public ArrayList<DayStatus> getDayStatusList() {
        return dayStatusList;
    }

    public void setDayStatusList(String day, String status) {
        for (DayStatus dayStatus1 :dayStatusList) {
            if(dayStatus1.getDayOfWeek().equals(day))
                dayStatus1.setStatus(status);
        }
    }
}


