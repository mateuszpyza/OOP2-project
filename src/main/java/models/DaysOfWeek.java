package models;

public class DaysOfWeek {
    public String getDayOfWeek(Enums.DaysOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY -> {
                return "Monday";
            }
            case TUESDAY -> {
                return "Tuesday";
            }
            case WEDNESDAY -> {
                return "Wednesday";
            }
            case THURSDAY -> {
                return "Thursday";
            }
            case FRIDAY -> {
                return "Friday";
            }
            case SATURDAY -> {
                return "Saturday";
            }
            case SUNDAY -> {
                return "Sunday";
            }
            default -> {
                return "Złe dane wejściowe";
            }
        }


    }
}
