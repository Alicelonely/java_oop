package Util;

public class StringFunctuin {


    /**
     * 求英文句子当中的单词
     *
     * @param s
     * @return
     */
    public static int getWordNumber(String s) {

        int count = 0;

        char a = ' ';

        char b = ',';

        if (s == null || "".equals(s)) {

            System.out.println("字符串为空");

        }
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == a || s.charAt(i) == b) {
                count++;
            }

        }

        return count + 1;

    }

    /**
     * 字符串s1在s2中是否有
     *
     * @param s1
     * @param s2
     * @return
     */
    public static boolean contain(String s1, String s2) {


        return s2.indexOf(s1) < 0 ? false : true;
    }


    /**
     * 字符串sub在s中出现的次数
     *
     * @param sub
     * @param s
     * @return
     */
    public static int getWordNumber(String sub, String s) {
        int old_length = s.length();

        String replace = "";

        if (s.contains(sub)) {

            replace = s.replace(sub, "");//将需要查找的字符串替换为空

        }

        int new_length = replace.length();//用原来字符串的长度去减替换过的字符串就是该字符串中字符出现的次数

        int count = (old_length - new_length) / (sub.length());//因为是字符串中字符出现的次数,所以要除以字符串你的长度最后就是字符串在另一个字符串中出现的次数

        return count;
    }


    /**
     * s字符串当中beginNum到endNum之间的值
     *
     * @param s
     * @param beginNum
     * @param endNum
     * @return
     */
    public static String getSubString(String s, int beginNum, int endNum) {
        return s.substring(beginNum + 1, endNum);
    }

    /**
     * S1 中第一次出现 S2 和最后一次出现 S2 之间的字符串。
     *
     * @param s1
     * @param s2
     * @return
     */
    public static String getSubString(String s1, String s2) {

        if (s1.indexOf(s2) < 0 || s1.indexOf(s2) == s1.lastIndexOf(s2)) {
            System.out.println("不匹配");
        }
        return s1.substring(s1.indexOf(s2) + s2.length(), s1.lastIndexOf(s2));

    }


    /**
     * 字符串翻转
     *
     * @param str
     * @return
     */
    public static String reverse(String str) {

        char[] chars = str.toCharArray();

        String reverse = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reverse += chars[i];
        }

        return reverse;
    }

}
