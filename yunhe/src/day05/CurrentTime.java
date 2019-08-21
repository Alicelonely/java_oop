package day05;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {

    Date date = new Date();

    public static void main(String[] args) throws ParseException {

        //Date date = new Date("2015年5月12日10点11分00秒");

        /*SimpleDateFormat sdf = new SimpleDateFormat("2015年5月12日10点11分00秒");



        System.out.println("当前时间是"+);*/


        String str1 = "2051-90-40";

        Date date = new Date();

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd");

        // 将字符串转化为日期类型

        //String str = "2015年5月12日10点11分00秒";

        Date date_1 = sdf3.parse(str1);

        //Date date_2 = sdf3.("2007-10-02");

        //System.out.println(date_1+","+date_2);
    }

}
