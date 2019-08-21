package day07;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) throws  Exception{

        long time = Time("2017-5-6", "2017-06-10");

        System.out.println(time);
    }

    public static long Time(String s,String b) throws Exception{


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        Date date1 = sdf.parse(s);
        Date date2 = sdf.parse(b);

        long count = (date2.getTime()-date1.getTime())/1000/60/60/24;

        return count;

    }
}
