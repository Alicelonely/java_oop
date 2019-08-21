package day06;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {




    public static Date getCurrentDate() {

        Date date = new Date();

        System.out.println(date);

        return date;

    }

    public static String getCurrentShortDate() {

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        System.out.println(sdf.format(date));

        return sdf.format(date);
    }

    public static String getCurrentDateTime() {

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss ");

        System.out.println(sdf.format(date));


        return sdf.format(date);


    }

    public static String getCurrentChineseDate() {

        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        System.out.println(sdf.format(date));


        return sdf.format(date);



    }

    public static java.util.Date convertToDate(String currentDate) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        System.out.println(sdf.parse(currentDate));

        return sdf.parse(currentDate);


    }

    public static java.util.Date convertToLongDate(String currentDate) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        System.out.println(sdf.parse(currentDate));

        return sdf.parse(currentDate);

    }

    public static String convertToDateString(java.util.Date date) {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");

        System.out.println(sdf.format(date));

        return sdf.format(date);

    }

    public static String convertToDateTimeString(java.util.Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss ");

        System.out.println(sdf.format(date));

        return sdf.format(date);
    }
}
