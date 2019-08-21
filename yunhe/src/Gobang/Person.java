package Gobang;

import java.util.Scanner;

public class Person {


    Scanner scanner = new Scanner(System.in);

    public int[] playChess(){
        //接收字符串数组
        String b = scanner.next();

        int [] arr = new int[2];

        String[] sourceStrArray = b.split(",");

         arr[0] = Integer.parseInt(sourceStrArray[0]);

         arr[1] = Integer.parseInt(sourceStrArray[1]);

        return arr;

    }

}
