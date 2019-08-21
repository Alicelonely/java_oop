package GuesBoxGame;

import java.util.Scanner;

public class Player {
    String name; //玩家的名字
    int score;  //玩家获胜的次数
    int playerNum;  //玩家出拳的数字

    Scanner scanner = new Scanner(System.in);

    public void caiquan(){

        do {
            System.out.println("请出拳：1.剪刀  2.石头   3.布");
            playerNum = scanner.nextInt();

            switch (playerNum) {
                case 1:
                    System.out.println("你出拳：剪刀");
                    break;
                case 2:
                    System.out.println("你出拳：石头");
                    break;
                case 3:
                    System.out.println("你出拳：布");
                    break;
                default:
                    System.out.println("出错了");
            }

        }while(playerNum < 0  || playerNum >3);

    }
}
