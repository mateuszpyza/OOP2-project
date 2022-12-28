package models;

import Enums.DaysOfWeek;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DaysOfWeekTest {

    @Test
    void shouldGetMonday() {
        //given
        models.DaysOfWeek dayOfWeek = new models.DaysOfWeek();
        DaysOfWeek monday = DaysOfWeek.MONDAY;
        //when
        String result = dayOfWeek.getDayOfWeek(monday);
        //then
        Assertions.assertArrayEquals("Monday".toCharArray(), result.toCharArray());
    }

    @Test
    void shouldGetTuesday() {
        //given
        models.DaysOfWeek dayOfWeek = new models.DaysOfWeek();
        DaysOfWeek tuesday = DaysOfWeek.TUESDAY;
        //when
        String result = dayOfWeek.getDayOfWeek(tuesday);
        //then
        Assertions.assertArrayEquals("Tuesday".toCharArray(), result.toCharArray());
    }

    @Test
    void shouldGetWednesday() {
        //given
        models.DaysOfWeek dayOfWeek = new models.DaysOfWeek();
        DaysOfWeek wednesday = DaysOfWeek.WEDNESDAY;
        //when
        String result = dayOfWeek.getDayOfWeek(wednesday);
        //then
        Assertions.assertArrayEquals("Wednesday".toCharArray(), result.toCharArray());
    }

    @Test
    void shouldGetThursday() {
        //given
        models.DaysOfWeek dayOfWeek = new models.DaysOfWeek();
        DaysOfWeek thursday = DaysOfWeek.THURSDAY;
        //when
        String result = dayOfWeek.getDayOfWeek(thursday);
        //then
        Assertions.assertArrayEquals("Thursday".toCharArray(), result.toCharArray());
    }

    @Test
    void shouldGetFriday() {
        //given
        models.DaysOfWeek dayOfWeek = new models.DaysOfWeek();
        DaysOfWeek friday = DaysOfWeek.FRIDAY;
        //when
        String result = dayOfWeek.getDayOfWeek(friday);
        //then
        Assertions.assertArrayEquals("Friday".toCharArray(), result.toCharArray());
    }

    @Test
    void shouldGetSaturday() {
        //given
        models.DaysOfWeek dayOfWeek = new models.DaysOfWeek();
        DaysOfWeek saturday = DaysOfWeek.SATURDAY;
        //when
        String result = dayOfWeek.getDayOfWeek(saturday);
        //then
        Assertions.assertArrayEquals("Saturday".toCharArray(), result.toCharArray());
    }

    @Test
    void shouldGetSunday() {
        //given
        models.DaysOfWeek dayOfWeek = new models.DaysOfWeek();
        DaysOfWeek sunday = DaysOfWeek.SUNDAY;
        //when
        String result = dayOfWeek.getDayOfWeek(sunday);
        //then
        Assertions.assertArrayEquals("Sunday".toCharArray(), result.toCharArray());
    }

}