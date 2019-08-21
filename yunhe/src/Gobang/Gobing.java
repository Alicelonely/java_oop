package Gobang;

import java.util.Scanner;

public class Gobing {
    public static void main(String[] args) {

        Checkerboard checkerboard = new Checkerboard();

        Scanner scanner = new Scanner(System.in);

        Person person = new Person();

        Computer computer = new Computer();

        //定义玩家的坐标
        int[] arr = new int[2];
        //定义电脑的坐标
        int[] arr1 = new int[2];
        //检测输赢标记
        boolean flag = false;
        //记录赢的次数
        int num = 0;

        //创建棋盘
        checkerboard.setMap();

        System.out.print("欢迎来到迷你五子棋");

        //显示棋盘
        checkerboard.showMap();

        System.out.println("\n请输入您下棋的坐标，应以x, y格式输入:");

       do {
            //玩家返回数组坐标
            arr = person.playChess();

            //判断map[attr]是否被占用
            boolean map_occupy = checkerboard.repeat(arr[0], arr[1]);

            //根据数组坐标得到第几个map
            checkerboard.PersonmodifyMap(arr[0], arr[1]);

            //检测是否输入有误
            if (map_occupy){
                //检测输赢
                flag = checkerboard.testing(arr[0], arr[1]);
                if (flag){

                    System.out.println("你赢了");

                    System.out.println("你是否要继续true/false");
                    //输入是否要继续
                    String  continues = scanner.next();

                    num++;

                    if ("true".equals(continues)){
                        flag = false;
                        checkerboard.setMap();
                    }else{
                        System.out.println("你赢了"+num+"次");
                        break;
                    }

                }

            }else{
                System.out.println("你不能下在这里,请重新输入");
                continue;
            }


            //获取电脑的随机坐标
            arr1 = computer.playChess();
            //判断电脑是否胜利
            flag = checkerboard.ComputermodifyMap(arr1[0], arr1[1]);

           if (flag){

               System.out.println("你输了");

               System.out.println("你是否要继续true/false");

               String  continues = scanner.next();

               if ("true".equals(continues)){
                   flag = false;
                   checkerboard.setMap();
               }else{
                   System.out.println("你赢了"+num+"次");
                   break;
               }

           }

            checkerboard.showMap();
           System.out.println();
        }while(!flag);



    }
}
