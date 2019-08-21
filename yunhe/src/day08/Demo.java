package day08;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        boolean b = Palindrome.palind(1234321);

        double a = Palindrome.calculation();

        int[] arr = {1, 1, 1, 2, 3, 1, 45};

        int[] arr1 = Palindrome.Extended(arr);


//        String s = scanner.nextLine();
//
//        System.out.println(Palindrome.trim(s));

        int [] arr3 = {1,1,3,4};
        int [] arr2 = {10,5,3,2};
        Palindrome.jia(arr2,arr3);

        int ap[][] ={{3,2,6},{6,8,2,10},{5},{12,3,23}};

        Palindrome.max(ap);
    }
}
