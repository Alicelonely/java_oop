package Util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SortUtil {


    //封装的冒泡排序的方法,第二个参数是xd是从小到大排序,第二个参数是dx是从大到小排序
    public static int[] Bubble(int[] array, String a) {

        int len = array.length - 1;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i; j++) {

                if (a.equals("xd") && array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                } else if (a.equals("dx") && array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
        }

        return array;
    }

    //封装的选择排序的方法,第二个参数是xd是从小到大排序,第二个参数是dx是从大到小排序
    public static int[] Choice(int[] array, String s) {

        int len = array.length;

        int temp = 0;

        for (int i = 0; i < len - 1; i++) {

            int minIndex = i;

            for (int j = i + 1; j < len; j++) {

                if (s.equals("xd") && array[j] < array[minIndex]) {
                    minIndex = j;
                } else if (s.equals("dx") && array[j] > array[minIndex]) {
                    minIndex = j;
                }

            }


            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;


        }

        return array;

    }


    //封装的插入排序的方法,第二个参数是xd是从小到大排序,第二个参数是dx是从大到小排序
    public static int[] Insert(int[] array, String s) {

        int len = array.length;

        for (int i = 1; i < len; i++) {
            //i对应的值是即将要和已排序部分比较的值

            int j;
            int value = array[i];
            for (j = i - 1; j >= 0; j--) {
                //还要再往前
                if (s.equals("xd") && array[j] > value) {
                    array[j + 1] = array[j];
                } else if (s.equals("dx") && array[j] < value) {

                    array[j + 1] = array[j];
                } else {
                    break;
                }

            }

            array[j + 1] = value;

        }

        return array;
    }


    //封装的随机排序的方法,洗牌,相对比较公平
    public static int[] Random(int[] array) {

        int len = array.length;

        for (int i = 0; i < len * 3; i++) {
            int j = i % len;

            int r = Section(0, len - 1, j);

            int temp = array[j];
            array[j] = array[r];
            array[r] = temp;
        }

        return array;

    }


    //封装的随机排序的方法,洗牌,相对比较公平,难度加大
    public static int[] RandomA(int[] array) {

        int len = array.length;

        int len_1 = len - 1;

        for (int i = 0; i < len * 3; i++) {
            int j = i % len;

            int r = Section(0, len_1, j);

            int temp = array[j];
            array[j] = array[r];
            array[r] = temp;

            int right = len_1 - j;
            r = Section(0, len_1, right);
            temp = array[j];
            array[j] = array[r];
            array[r] = temp;
        }

        return array;

    }

    //为洗牌提供方法,取x-y之间的随机值,s代表不能取到自己
    public static int Section(int x, int y, int s) {
        int a = (int) Math.floor(Math.random() * (y - x + 1) + x);

        return s == a ? Section(x, y, s) : a;
    }





    //逆序排序
    public static int[] Revarsal(int[] a) {

        int[] b = a;

        for (int start = 0, end = b.length - 1; start < end; start++, end--) {
            int temp = b[start];
            b[start] = b[end];
            b[end] = temp;
        }

        return a;

    }

    //生成几到几之间的随机数
    public static int Section(int x, int y) {
        int a = (int) Math.floor(Math.random() * (y - x + 1) + x);

        return a;
    }



    //输入日期返回是全年当中的第几天
    public static int judgingDays(String a){


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date parse = null;
        try {
            parse = simpleDateFormat.parse(a);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int y = parse.getYear();
        int m = parse.getMonth();
        int d = parse.getDate();


        int [] arr = {31,28,31,30,31,30,31,31,30,31,30,31};

        int [] arr1 = {31,27,31,30,31,30,31,31,30,31,30,31};

        int count = 0;

        for (int i = 0; i < m; i++) {


            if (y%4 == 0){
                count += arr1[i];

            }else if(y%4 != 0){
                count += arr[i];
            }

        }
        count += d;

        return count;



    }

}



