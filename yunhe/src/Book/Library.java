package Book;


import java.util.Scanner;

public class Library {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // 初始化数据 图书 时间 状态
        String[] name = new String[6];
        // 标记已借出,可借
        int[] lend = new int[6];
        // 标记每个借出的次数
        int[] ranking = new int[6];

        boolean flag = true;
        // 借出时间
        int[] time = new int[6];
        // 借出次数
        int[] num = new int[6];
        //借出日期
        String [] datas = new String [6];

        // 初始化数据
        name[0] = "西游记";
        lend[0] = 0;
        ranking[0] = 6;

        name[1] = "红楼梦";
        lend[1] = 0;
        ranking[1] = 6;

        name[2] = "三国演义";
        lend[2] = 0;
        ranking[2] = 62;

        name[3] = "水浒传";
        lend[3] = 0;
        ranking[3] = 42;

        int ren = 0;
        stop1: do {
            System.out.print("欢 迎 使 用 迷 你 图 书 管 理 器\n" +
                    "-------------------------------------\n" +
                    "1. 查 看 图 书\n" +
                    "2. 添 加 图 书\n" +
                    "3. 借 阅 图 书\n" +
                    "4. 归 还 图 书\n" +
                    "5. 借出排行榜\n" +
                    "6. 删 除 图 书\n" +
                    "7. 退 出\n" +
                    "--------------------------------------\n" +
                    "请选择：");
            // 选择的数据
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("书籍序号\t\t" + "书籍名称\t\t" + "书籍状态\t\t"+"借出日期");

                    String state = null;
                    for (int i = 0; i < name.length; i++) {
                        if (name[i] != null) {
                            if (lend[i] == 0 || datas[i] == null) {
                                state = "未借";
                                datas[i] = "";
                            } else if (lend[i] == 1) {
                                state = "已借";
                            }

                            System.out.println((i + 1) + "\t\t\t" + name[i] + "\t\t\t" + state+"\t\t" + datas[i]);
                        }
                    }

                    System.out.println("按0返回");
                    ren = scanner.nextInt();

                    break;
                case 2:
                    System.out.println("请输入你要添加的书籍");
                    String add = scanner.next();

                    for (int i = 0; i < name.length; i++) {

                        if (add.equals(name[i])){
                            System.out.println("该书已有");
                            break;
                        }
                        if (name[i] == null) {

                            name[i] = add;
                            lend[i] = 0;
                            break;

                        }
                    }
                    System.out.println("按0返回");
                    ren = scanner.nextInt();

                    break;
                case 3:

                    System.out.println("请输入要借阅的书籍");
                    String borrow = scanner.next();
                    System.out.println("请输入借出时间");
                    String data = scanner.next();

                    for (int i = 0; i < name.length; i++) {
                        if (borrow.equals(name[i]) && lend[i] == 0) {
                            lend[i] = 1;
                            ranking[i]++;
                            System.out.println("你借阅了<<" + borrow + ">>");
                            datas[i] = data;
                            break;
                        } else if (borrow.equals(name[i]) && lend[i] == 1) {
                            System.out.println("该书已被借出");
                            break;
                        }

                    }

                    System.out.println("按0返回");
                    ren = scanner.nextInt();

                    break;
                case 4:

                    System.out.println("请输入要归还的书籍");
                    String return1 = scanner.next();

                    for (int i = 0; i < name.length; i++) {
                        if (return1.equals(name[i]) && lend[i] == 1) {
                            lend[i] = 0;
                            datas[i] = "";
                            System.out.println("你已成功归还" + return1);
                        } else if (return1.equals(name[i]) && lend[i] != 1 && lend[i] != 0) {
                            System.out.println("该书不存在");
                            break;
                        }
                    }


                    System.out.println("按0返回");
                    ren = scanner.nextInt();

                    break;
                case 5:

                    for (int i = 0; i < name.length; i++) {
                        for (int j = i+1; j < name.length; j++) {
                            if (name[i] != null && ranking[i] < ranking[j]) {
                                String temp = null;
                                int num1 = 0;
                                num1 = ranking[i];
                                temp = name[i];
                                ranking[i] = ranking[j];
                                name[i] = name[j];
                                ranking[j] = num1;
                                name[j] = temp;
                            }

                        }

                        if (name[i] != null){
                            System.out.println(ranking[i]+"\t\t"+name[i]);
                        }
                    }


                    System.out.println("按0返回");
                    ren = scanner.nextInt();

                    break;
                case 6:

                    System.out.println("请输入你要删除的书籍");
                    String book = scanner.next();


                    String[] tempArr = new String[name.length];
                    int [] intArr = new int[ranking.length];
                    int i = 0;
                    int sam = 0;
                    for(String s:name){
                        if(!book.equals(s)){
                            tempArr[i] = s;
                            i++;
                        }else if (book.equals(s)){
                            sam = i;
                        }
                    }
                    int w = 0;
                    for (int k = 0; k < intArr.length;k++) {
                        if (sam != k){
                            intArr[w] = ranking[k];
                            w++;
                        }
                    }

                    if (datas[sam] != ""){
                        System.out.println("该书籍没有归还,不能删除");
                        break  ;
                    }else if(datas[sam] == "") {
                        System.out.println("删除成功");
                        name = tempArr;
                        ranking = intArr;
                    }







                    System.out.println("按0返回");
                    ren = scanner.nextInt();

                    break;
                case 7:
                    System.out.println("谢谢使用");
                    break stop1;

            }

        } while (ren == 0);

    }

}
