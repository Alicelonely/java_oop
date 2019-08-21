package day06;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

    String Time = "2015.05.12-10:11:00";


    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd-HH:mm:ss");


    void show() {


        try {
            System.out.println(simpleDateFormat.parse(Time));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    void changeTime() {
        Time = "2015.05.12-10:11:30";


    }


    public static void main(String[] args) throws Exception {

        String str = "1997-05-16";

        Date date = new Date();

        DateDemo.getCurrentDate();

        DateDemo.getCurrentShortDate();

        DateDemo.getCurrentDateTime();

        DateDemo.getCurrentChineseDate();

        DateDemo.convertToDate(str);

        DateDemo.convertToLongDate(str);

        DateDemo.convertToDateString(date);

        DateDemo.convertToDateTimeString(date);


    }


}
