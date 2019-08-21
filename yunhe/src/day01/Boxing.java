package day01;

import java.util.Scanner;

public class Boxing {
    //    public static void main(String[] args) {
//        //提示游戏规则
//        System.out.println("出拳规则：1：剪刀；2：石头；3：布\n" +
//                "请选择对方的角色（1：刘备；2：孙权；3：曹操）\n");
//        //创建键盘输入对象
//        Scanner sc = new Scanner(System.in);
//        //计数,记录总局数
//        int count = 0;
//        //记录赢的次数
//        int win = 0;
//        //记录输的次数
//        int lose = 0;
//        //记录平局的次数
//        int draw = 0;
//        //使用while语句判断,判断键盘录入选择对手时是否正确
//        while (true) {
//            //把输入的键盘对象赋值给一个变量
//            int opponent = sc.nextInt();
//            //判断输入的值是否超出
//            if (opponent > 0 && opponent < 4) {
//
//                System.out.println("请输入你的姓名");
//                //录入你的名字
//                String name = sc.next();
//
//                System.out.println(name + "你选择" + keyboard(opponent) + "对战");
//
//                System.out.println("请出拳：1：剪刀；2：石头、3：布");
//                ////使用while语句判断,判断键盘输入值时是否正确
//                while (true) {
//                    //接受键盘输入的值
//                    int youGestrue = sc.nextInt();
//                    //判断键盘输入的值是否合理
//                    if (youGestrue < 4 && youGestrue > 0) {
//
//                        System.out.println("你出" + gestrue(youGestrue));
//                        //定义电脑出的数字
//                        int num = machinePunch();
//
//                        System.out.println(keyboard(opponent) + "出" + gestrue(num));
//                        //判断输赢
//                        if (youGestrue - num == 0) {
//
//                            System.out.println("你们是平局");
//                            //平局加一
//                            draw++;
//
//                            System.out.println("还要再玩一局么？true/false");
//                            //总局数加一
//                            count++;
//
//                            String judge = sc.next();
//
//                            record(judge,name,keyboard(opponent),count,draw,win);
//
//                            break;
//
//
//
//                        } else if (youGestrue == 1 && num == 2 || youGestrue == 2 && num == 3 || youGestrue == 3 && num == 1) {
//
//                            System.out.println("你真菜,你给了"+keyboard(opponent));
//
//                            lose++;
//
//                            count++;
//
//                            String judge1 = sc.next();
//
//                            record(judge1,name,keyboard(opponent),count,draw,win);
//
//                        } else {
//
//                            System.out.println("恭喜你,你赢了");
//
//                            win++;
//
//                            count++;
//
//                            String judge2 = sc.next();
//
//                            record(judge2,name,keyboard(opponent),count,draw,win);
//
//                        }
//
//                    } else {
//
//                        System.out.println("你的输入有误请重新输入");
//
//                    }
//                }
//
//            } else {
//                System.out.println("你的输入有误请重新输入");
//            }
//        }
//    }
//
//    //创建数组,显示人物姓名
//    public static String keyboard(int i) {
//        String[] arr = {"刘备", "孙权", "曹操"};
//        return arr[i - 1];
//    }
//
//    //创建数组,显示你出的是什么
//    public static String gestrue(int i) {
//        String[] arr = {"剪刀", "石头", "布"};
//        return arr[i - 1];
//    }
//
//    //定义对方出拳的手势
//    public static int machinePunch() {
//        int i = (int) (1 + Math.random() * (3 - 1 + 1));
//        return i - 1;
//    }
//
//    public static void record(String judge,String name,String computer,int count,int draw,int win){
//        if(judge == "false"){
//            System.out.println("...........");
//            System.out.println(name + "VS" +computer+
//                    "对阵次数：:"+count+"; 平手次数："+draw+";\n"+
//                    "姓名得分\n" +
//                    name+"\t2\n" +win+
//                    computer+(count - win) +
//                    "袁绍以3 比 2 取得最后的胜利！\n");
//        }
//    }
    public static void main(String[] args) {
        //创建键盘录入对象
        Scanner scanner = new Scanner(System.in);
        //计数,记录总局数
        int count = 0;
        //记录赢的次数
        int win = 0;
        //记录输的次数
        int lose = 0;
        //记录平局的次数
        int draw = 0;
        //声明变量接受是否继续
        String result;

        int computerNameNmuber;
        do {
            //声明游戏规则
            System.out.println("**************************\n" +
                    "**********猜拳游戏开始*********\n" +
                    "**************************\n" +
                    "出拳规则：1：剪刀；2：石头；3：布\n" +
                    "请选择对方的角色（1：刘备；2：孙权；3：曹操）\n");

            //存储录入的数字
            computerNameNmuber = scanner.nextInt();

            System.out.println("请输入名字");

            //存储玩家名字
            String personName = scanner.next();

            //电脑的名字
            String computerName = keyboard(computerNameNmuber);

            System.out.println(personName + "选择对战" + computerName);
            System.out.println("请出拳：1：剪刀；2：石头、3：布");

            //输入的手势
            int persomGestrueNumber = scanner.nextInt();

            System.out.println("你出:" + gestrue(persomGestrueNumber));

            //电脑随机出拳
            int computerGestrueNumber = (int) (1 + Math.random() * (3 - 1 + 1));
            System.out.println(computerName + "出拳" + gestrue(computerGestrueNumber));

            //判断输赢
            if (persomGestrueNumber == 1 && computerGestrueNumber == 2 || persomGestrueNumber == 2 && computerGestrueNumber == 3 || persomGestrueNumber == 3 && computerGestrueNumber == 1) {

                System.out.println("你真菜,你输给了" + computerName);
                count++;
                lose++;

            } else if (persomGestrueNumber == computerGestrueNumber) {
                System.out.println("平局");
                draw++;
                count++;
            } else {
                System.out.println("你赢了");
                win++;
                count++;
            }

            //是否需要继续
            System.out.println("还要再玩一局么？true/false");
            result = scanner.next();
        } while ("true".equals(result));

        System.out.println("对阵次数" + count + "; 平手次数：" + draw + "你赢了" + win + "你输了" + lose);

    }


    //显示人物姓名
    public static String keyboard(int i) {
        String[] arr = {"刘备", "孙权", "曹操"};
        return arr[i - 1];
    }

    public static String gestrue(int i) {
        String[] arr = {"剪刀", "石头", "布"};
        return arr[i - 1];
    }
}


