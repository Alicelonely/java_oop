package day03;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {


        //猜数游戏

//        int num;
//
//        int num1;
//
//        System.out.println("猜猜我是几(提示:我是1-100之间的整数)");
//
//        Scanner scanner = new Scanner(System.in);
//
//
//        num1 = (int) (1 + (Math.random() * 100));
//
//        int count = 0;
//
//
//        //num1 = 2;
//        do {
//
//            num = scanner.nextInt();
//
//            if (count == 5) {
//
//                System.out.println("你输了");
//
//            } else if (num > num1) {
//
//                count++;
//
//                System.out.println("大了,请返回输入一个较小的值,你还有" + (6 - count) + "次机会");
//
//            } else if (num < num1) {
//
//                count++;
//
//                System.out.println("小了,请返回输入一个较大的值,你还有" + (6 - count) + "次机会");
//
//            }
//
//
//        } while (num != num1);
//
//        System.out.println("恭喜你输入正确" + num1);


        //计算平均分

//        Scanner scanner = new Scanner(System.in);
//
//        int result = 0;
//
//        int achievement = 0;
//
//        for (int i = 0; i < 5; i++) {
//
//            achievement = scanner.nextInt();
//
//            if(achievement <= 0 || achievement > 100){
//                System.out.println("输入错误");
//                break;
//            }
//
//           result += achievement;
//
//        }
//
//        int Average = (result/5);
//        System.out.println(Average);








//        int score;                               //每门课的成绩
//        int sum = 0;                             //平均之和
//        int avg;                                 //平均分
//        boolean wrong = true;                    //录入输入时候正确的标识符
//        Scanner input = new Scanner(System.in);
//        System.out.print("输入学生姓名：");
//        String name = input.next();              //输入姓名
//        for (int i = 0; i < 5; i++) {            //循环5次录入5门课成绩
//            System.out.print("请输入5门课中的第"+(i+1)+"门课的及成绩:  ");
//            score = input.nextInt();
//            if(score < 0){
//                wrong = false;
//                break;
//            }
//            sum = sum + score;                   //累加求和
//        }
//        if(wrong){
//            avg = sum / 5;                      //计算平均分
//            System.out.println(name+"的平均分是："+avg);
//        }else{
//            System.out.println("抱歉，分数录入错误，请重新录入！");
//        }



//        double buy = 0;
//
//
//
//        for (int i = 0; i < 5; i++) {
////            if(result == 0){
////                System.out.println(result);
////            }
////
////            result -= 1;
////            buy += result;
//            buy = (buy+1)/2;
//        }
//
//        System.out.println(buy);

//
//        for (int i = 1; i < 101 ; i++) {
//            if (i%3 == 0){
//                System.out.println("flop");
//            }else if (i%5 == 0){
//                System.out.println("flop1");
//            }else if (i%3 == 0 || i%5 == 0){
//                System.out.println("flop1");
//            }else{
//                System.out.println(i);
//            }
//        }

    }
}
