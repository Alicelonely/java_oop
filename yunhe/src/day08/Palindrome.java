package day08;

public class Palindrome {


    /*
     * 判断回文
     * */
    public static Boolean palind(int n) {
        boolean flag = true;
        int len = (n + "").length();
        String[] arr = (n + "").split("");


        for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
            if (!arr[i].equals(arr[j])) {
                flag = false;
            }
        }
        return flag;
    }


    /**
     * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
     *
     * @return
     */
    public static double calculation() {

        double result = 0;
        double count = 2;
        for (int i = 1; i <= 3; i++) {

            result += count / i;
            count = count + i;
        }

        return result;

    }

    public static int[] Extended(int[] arr) {
        int a = arr.length * 2;
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            if (i < arr.length) {
                b[i] = arr[i];
            } else {
                b[i] = 0;
            }
        }
        return arr;
    }

    public static String trim(String a) {
        String[] b = a.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < b.length; i++) {
            if (!" ".equals(b[i])) {
                sb.append(b[i]);
            }
        }
        String s = sb.toString();
        return s;


    }

    public static int[] jia(int[] a, int[] b) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = a[i] * b[i];
        }

        return arr;
    }

    public static void max(int [][] a){
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length - i; j++) {

                    if ( a[i][j] > a[i][j + 1]) {
                        int temp = a[i][j];
                        a[i][j] = a[i][j + 1];
                        a[i][j + 1] = temp;
                    }

            }
            System.out.println(a[i][0]);
        }

    }
}
