package Gobang;

public class Checkerboard {
    //棋盘初始化
    static String[] map = new String[400];

    public void setMap() {
        for (int i = 0; i < 400; i++) {

            map[i] = "+";

        }
    }

    //展示棋盘
    public void showMap() {
        for (int i = 0; i < 400; i++) {

            if (i % 20 == 0) {
                System.out.println();
            }
            System.out.print(map[i]);
        }
    }

    //人物坐标位置
    public int PersonmodifyMap(int a, int b) {

        int number = 0;

        if (b > 0) {
            number = (20 * (a - 1)) + b - 1;
            map[number] = "○";
        } else {
            System.out.println("输入错误");
        }

        return number;

    }


    //电脑坐标位置
    public boolean ComputermodifyMap(int a, int b) {

        int number = (20 * (a - 1)) + b - 1;


        if ("+".equals(this.map[number])) {
            map[number] = "●";
        }

        return testing(a, b);


    }


    //检测输赢
    public boolean testing(int a, int b) {
        a = a - 1;
        b = b - 1;

        for (int i = 0; i < 20; i++) {

            boolean bool = true;

            boolean boo = true;

            boolean bo = true;

            boolean bl = true;

            try {
                bool =  "○".equals(map[20 * (a - 4) + (b - 4)]) && "○".equals(map[20 * (a - 3) + (b - 3)]) && "○".equals(map[20 * (a - 2) + (b - 2)]) && "○".equals(map[20 * (a - 1) + (b - 1)]) && "○".equals(map[20 * a + b]) ||
                        "○".equals(map[20 * (a + 4) + (b + 4)]) && "○".equals(map[20 * (a + 3) + (b + 3)]) && "○".equals(map[20 * (a + 2) + (b + 2)]) && "○".equals(map[20 * (a + 1) + (b + 1)]) && "○".equals(map[20 * a + b]);
            } catch (ArrayIndexOutOfBoundsException e) {
                bool = false;
            }

            try {
                boo =  "○".equals(map[20 * (a + 4) + (b - 4)]) && "○".equals(map[20 * (a + 3) + (b - 3)]) && "○".equals(map[20 * (a + 2) + (b - 2)]) && "○".equals(map[20 * (a + 1) + (b - 1)]) && "○".equals(map[20 * a + b]) ||
                        "○".equals(map[20 * (a - 4) + (b + 4)]) && "○".equals(map[20 * (a - 3) + (b + 3)]) && "○".equals(map[20 * (a - 2) + (b + 2)]) && "○".equals(map[20 * (a - 1) + (b + 1)]) && "○".equals(map[20 * a + b]);
            } catch (ArrayIndexOutOfBoundsException e) {
                boo = false;
            }

            try {
                bo = "○".equals(map[i + a * 20]) && "○".equals(map[(i + 1) + a * 20]) && "○".equals(map[(i + 2) + a * 20]) && "○".equals(map[(i + 3) + a * 20]) && "○".equals(map[(i + 4) + a * 20]);

            } catch (ArrayIndexOutOfBoundsException e) {
                bo = false;
            }

            try {

                bl = "○".equals(map[i * 20 + b]) && "○".equals(map[(i + 1) * 20 + b]) && "○".equals(map[(i + 2) * 20 + b]) && "○".equals(map[(i + 3) * 20 + b]) && "○".equals(map[(i + 4) * 20 + b]);

            } catch (ArrayIndexOutOfBoundsException e) {
                bl = false;
            }

            if (bo) {
                return true;
            } else if (bl) {
                return true;
            } else if (bool) {
                return true;
            } else if (boo) {
                return true;
            }

        }

        return false;
    }


    //检测棋盘该位置有没有下
    public boolean repeat(int a,int b) {

        int number = (20 * (a - 1)) + b - 1;

        if ("+".equals(map[number])) {
            return true;
        } else {
            return false;
        }
    }

}
