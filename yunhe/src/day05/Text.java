package day05;

public class Text {

    int x, y;
    Text(int x, int y) {//一个带参构造器
        this.x = x;
        this.y = y;
    }

        static int count = 0;
    public int getWordNumber(String s) throws Exception {

         int count = 0;

        if (s == null) {
            System.out.println("字符串为空");
        } else {

            for (int i = 0; i < s.length(); i++) {
                if (s.matches(".*[a-zA-z].*")) {
                    count++;
                }
            }

        }
        return count;
    }


    public int getWordNumber(String s1, String s2) throws Exception {
        int count = 0;

        for (int i = 0; i < s2.length(); i++) {
            String s3 = s2.charAt(i) + "";
            if(s1.equals(s3)){
                    count++;
            }
        }

        return count;

    }

}
