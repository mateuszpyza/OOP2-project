package apps;

import models.DaysOfWeek;

public class Main {
    public static void main(String[] args){
        DaysOfWeek dayOfWeek = new DaysOfWeek();
        System.out.println(dayOfWeek.getDayOfWeek(Enums.DaysOfWeek.MONDAY));
    }
}
