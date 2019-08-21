package Gobang;

public class Computer {

    Checkerboard checkerboard = new Checkerboard();


    public int[] playChess() {

        int[] arr = new int[2];

        int computerNumber;

        arr[0] = (int) (Math.random() * 20) + 1;

        arr[1] = (int) (Math.random() * 20) + 1;

        for (int i = 0; i < Checkerboard.map.length; i++) {

            computerNumber = (20 * (arr[0] - 1)) + arr[1] - 1;
            if (checkerboard.map[computerNumber] == checkerboard.map[i]) {
                arr[0] = (int) (Math.random() * 20) + 1;

                arr[1] = (int) (Math.random() * 20) + 1;

                return arr;
            } else {
                return arr;
            }

        }

        return arr;
    }

    public int[] playChess(int a, int b) {

        int[] arr = new int[2];


        a = a - 1;
        b = b - 1;

        for (int i = 0; i < 20; i++) {

            boolean bool = true;

            boolean boo = true;

            boolean bo = true;

            boolean bl = true;

            try {
                bool = "○".equals(checkerboard.map[20 * (a - 2) + (b - 2)]) && "○".equals(checkerboard.map[20 * (a - 1) + (b - 1)]) && "○".equals(checkerboard.map[20 * a + b]) ||
                        "○".equals(checkerboard.map[20 * (a + 2) + (b + 2)]) && "○".equals(checkerboard.map[20 * (a + 1) + (b + 1)]) && "○".equals(checkerboard.map[20 * a + b]);
            } catch (ArrayIndexOutOfBoundsException e) {
                bool = false;
            }

            try {
                boo = "○".equals(checkerboard.map[20 * (a + 2) + (b - 2)]) && "○".equals(checkerboard.map[20 * (a + 1) + (b - 1)]) && "○".equals(checkerboard.map[20 * a + b]) ||
                        "○".equals(checkerboard.map[20 * (a - 2) + (b + 2)]) && "○".equals(checkerboard.map[20 * (a - 1) + (b + 1)]) && "○".equals(checkerboard.map[20 * a + b]);
            } catch (ArrayIndexOutOfBoundsException e) {
                boo = false;
            }

            try {
                bo = "○".equals(checkerboard.map[i + a * 20]) && "○".equals(checkerboard.map[(i + 1) + a * 20]) && "○".equals(checkerboard.map[(i + 2) + a * 20]);

            } catch (ArrayIndexOutOfBoundsException e) {
                bo = false;
            }

            try {

                bl = "○".equals(checkerboard.map[i * 20 + b]) && "○".equals(checkerboard.map[(i + 1) * 20 + b]) && "○".equals(checkerboard.map[(i + 2) * 20 + b]);

            } catch (ArrayIndexOutOfBoundsException e) {
                bl = false;
            }

            if (bo) {

                if (!"○".equals(checkerboard.map[(i + 3) + a * 20]) && !"●".equals(checkerboard.map[(i + 3) + a * 20])) {
                    //checkerboard.map[(i + 3) + a * 20] = "●";
                    arr[0] = ((i + 3) + a * 20) / 20;
                    arr[1] = ((i + 3) + a * 20) % 20;
                    return arr;
                } else if (!"○".equals(checkerboard.map[(i - 1) + a * 20]) && !"●".equals(checkerboard.map[(i - 1) + a * 20])) {
                    //checkerboard.map[(i - 1) + a * 20] = "●";
                    arr[0] = ((i - 1) + a * 20) / 20;
                    arr[1] = ((i - 1) + a * 20) % 20;
                    return arr;
                }

            } else if (bl) {

                if (!"○".equals(checkerboard.map[(i + 3) * 20 + b]) && !"●".equals(checkerboard.map[(i + 3) * 20 + b])) {
                    //checkerboard.map[(i + 3) * 20 + b] = "●";
                    arr[0] = ((i + 3) * 20 + b) / 20;
                    arr[1] = ((i + 3) * 20 + b) % 20;
                    return arr;
                } else if (!"○".equals(checkerboard.map[(i - 1) * 20 + b]) && !"●".equals(checkerboard.map[(i - 1) * 20 + b])) {
                   // checkerboard.map[(i - 1) * 20 + b] = "●";
                    arr[0] = ((i - 1) * 20 + b) / 20;
                    arr[1] = ((i - 1) * 20 + b) % 20;
                    return arr;
                }

            } else if (bool) {

                if (!"○".equals(checkerboard.map[20 * (a + 3) + (b - 3)]) && !"●".equals(checkerboard.map[20 * (a + 3) + (b - 3)])) {
                    //checkerboard.map[20 * (a + 3) + (b - 3)] = "●";
                    arr[0] = (20 * (a + 3) + (b - 3)) / 20;
                    arr[1] = (20 * (a + 3) + (b - 3)) % 20;
                    return arr;
                } else if (!"○".equals(checkerboard.map[20 * (a + 1) + (b - 1)])) {
                    //checkerboard.map[20 * (a + 1) + (b - 1)] = "●";
                    arr[0] = (20 * (a + 1) + (b - 1)) / 20;
                    arr[1] = (20 * (a + 1) + (b - 1)) % 20;
                    return arr;
                }

            } else if (boo) {

                if (!"○".equals(checkerboard.map[20 * (a - 3) + (b - 3)]) && !"●".equals(checkerboard.map[20 * (a - 3) + (b - 3)])) {
                    //checkerboard.map[20 * (a - 3) + (b - 3)] = "●";
                    arr[0] = (20 * (a - 3) + (b - 3)) / 20;
                    arr[1] = (20 * (a - 3) + (b - 3)) % 20;
                    return arr;
                } else if (!"○".equals(checkerboard.map[20 * (a + 1) + (b + 1)])) {
                   // checkerboard.map[20 * (a + 1) + (b + 1)] = "●";
                    arr[0] = (20 * (a + 1) + (b + 1)) / 20;
                    arr[1] = (20 * (a + 1) + (b + 1)) % 20;
                    return arr;
                }

            }

        }

        return arr = playChess();
    }


    public int[] playChess(int i, int a, int b) {

        int[] arr = new int[2];


        arr[0] = 1;
        arr[1] = 2;

        return arr;
    }

    //判断难度
    public int[] difficulty(int i, int a, int b) {
        int[] arr = new int[2];

        switch (i) {
            case 1:
                return arr = playChess();

            case 2:
                return arr = playChess(a, b);

//            case 3:
//                return arr = playChess(i, a, b);
        }
        return arr;
    }


}
