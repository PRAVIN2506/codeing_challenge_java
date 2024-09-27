package Day_56;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

class Event {
    int start;
    int end;
    public Event(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class MyCalendarTwo {
    List<Event> overLapBookings;
    List<Event> bookings;

    public MyCalendarTwo() {
        overLapBookings = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for(Event e : overLapBookings) {
            if(isOverlap(e, start, end)) {
                return false;
            }
        }

        for(Event e : bookings) {
            if(isOverlap(e, start, end)) {
                overLapBookings.add(getOverlapEvent(e, start, end));
            }
        }
        bookings.add(new Event(start, end));
        return true;
    }

    public boolean isOverlap(Event e, int start, int end) {
        return Math.max(e.start, start) < Math.min(e.end, end);
    }

    public Event getOverlapEvent(Event e, int start, int end) {
        return new Event(Math.max(e.start, start), Math.min(e.end, end));
    }
}

public class Solution {
    public static void main(String[] args) {
        MyCalendarTwo myCalendar = new MyCalendarTwo();

        System.out.println(myCalendar.book(10, 20)); // returns true
        System.out.println(myCalendar.book(50, 60)); // returns true
        System.out.println(myCalendar.book(10, 40)); // returns true
        System.out.println(myCalendar.book(5, 15));  // returns false
        System.out.println(myCalendar.book(5, 10));  // returns true
        System.out.println(myCalendar.book(25, 55)); // returns true
    }
}

