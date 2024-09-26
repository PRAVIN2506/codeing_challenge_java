package Day_55;

import java.util.TreeMap;
import java.util.*;

class MyCalendar {
    TreeMap<Integer, Integer> calcy;
    public MyCalendar() {
        calcy = new TreeMap();

    }

    public boolean book(int start, int end) {
        Integer prevBook = calcy.floorKey(start);
        Integer nextBook = calcy.ceilingKey(start);
        if((prevBook==null || calcy.get(prevBook)<=start) && (nextBook==null || end<=nextBook))
        {
            calcy.put(start, end);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MyCalendar myCal = new MyCalendar();

        System.out.println(myCal.book(10, 20));
        System.out.println(myCal.book(15, 25));
        System.out.println(myCal.book(20, 30));
    }

}

