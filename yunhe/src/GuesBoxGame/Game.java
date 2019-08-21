package GuesBoxGame;

import java.util.Scanner;

public class Game {
    Computer sc;    //声明电脑类
    Player ps;      //声明玩家类
    int count = 0;      //对战次数
    Scanner scanner = new Scanner(System.in);


    /*
     *游戏初始化
     */

    public void welcome() {
        System.out.println("*********************************");
        System.out.println("************游戏开始*************");
        System.out.println("*********************************");
    }

    public void into() {


        int coName;
        System.out.println("出拳规则:   1.剪刀    2.石头    3.布");
        if (sc.name == null) {

            System.out.println("请选择你对战的角色:1.蓝胖子\t2.黑胖子\t3.白胖子");
            coName = scanner.nextInt();
            System.out.println("请输入你的名字");
            ps.name = scanner.next();

            switch (coName) {
                case 1:
                    System.out.println(ps.name + "选择和蓝胖子对战");
                    sc.name = "蓝胖子";
                    break;
                case 2:
                    System.out.println(ps.name + "选择和黑胖子对战");
                    sc.name = "黑胖子";
                    break;
                case 3:
                    System.out.println(ps.name + "选择和白胖子对战");
                    sc.name = "白胖子";
                    break;
                default:
                    System.out.println("输入错误，请重新选择");
            }
        }
    }


    public void winLose() {
        if (ps.playerNum == 1 && sc.comNum == 2 || ps.playerNum == 2 && sc.comNum == 3 || ps.playerNum == 3 && sc.comNum == 1) {
            System.out.println("真菜，你输给了" + sc.name);
            sc.score++;
        } else if (ps.playerNum == ps.playerNum) {
            System.out.println("有两下子，你和" + sc.name + "平手");
        } else {
            System.out.println("厉害，你战胜了" + sc.name);
            ps.score++;
        }
        count++;
    }

    public void result() {
        System.out.println(sc.name + "\tVS\t" + ps.name);
        System.out.println("对阵次数：" + count + ",平手次数：" + (count - sc.score - ps.score));
        System.out.println("姓名\t得分");
        System.out.println(ps.name + "\t" + ps.score);
        System.out.println(sc.name + "\t" + sc.score);

        if (ps.score > sc.score) {
            System.out.println(ps.name + "以" + ps.score + "比" + sc.score + "的比分取得了最后的胜利");
        } else if (ps.score < sc.score) {
            System.out.println(sc.name + "以" + sc.score + "比" + ps.score + "的比分取得了最后的胜利");
        } else {
            System.out.println(ps.name + "以" + ps.score + "比" + sc.score + "互相战平");

        }
    }


    public static void main(String[] args) {
        Game game = new Game();
        game.sc = new Computer();
        game.ps = new Player();

        do {
            game.welcome();
            game.into();
            game.ps.caiquan();
            game.sc.caiquan();
            game.winLose();
            System.out.println("是否要继续(true/false)");
        } while (game.scanner.nextBoolean());

        game.result();


    }


}
