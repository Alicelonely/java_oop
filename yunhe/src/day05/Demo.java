package day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*public class Demo {
    public static void main(String[] args) throws Exception {

        HashMap s = new HashMap<>();
       *//* String s = new String("123");
        System.out.println(s.length());

        D
        *//*


 *//*String s = new String(    "123");
        AD*//*


 *//* String s1 ="ab";
        String s2 ="cd";
        String ss1 ="abcd";
        String ss2 ="ab"+"cd";
        String ss3 = s1 +"cd";
        String ss4 ="ab"+s2;
        String ss5 = s1 + s2;

        System.out.println(ss5 == ss4);

        AE*//*


 *//*int  a = s.hashCode();
        C*//*

//        D

        // D

//        double d = 0;
//        long  m = Math.round(d);
//
//        D


       *//* int i=0;
        float f=2.3f;
        double d=2.7;
        i=(int)Math.ceil(f)向上取整     *(int)Math.round(d)四舍五入 ;
        System.out.println(i);

        E*//*


//       BC

    *//*  Byte b=new Byte("123");
        Byte b=new Byte(123);
        Byte b=new Byte();
        Byte b=new Byte((int)123.4);
        Byte b=new Byte(0x123);

        A*//*


 *//*  Text t = new Text();

        String s1 = "11111abcde";

        int abc = t.getWordNumber(s1);

        System.out.println(abc);*//*

//        Text t = new Text();
//
//        int b = t.getWordNumber("av","avdadgfa");
//
//        System.out.println(b);
//
//        int h = t.count;



                Text pt1, pt2;
                pt1 = new Text(3, 3);
                pt2 = new Text(4, 4);
                System.out.print( pt1.x+pt2.x);

        }

    }


      *//*  for (int i = 0; i < 20; i++) {
            System.out.println(RandomGenerator(10));
        }





    public static int RandomGenerator(int bitnum){

        int a = (int)((Math.random()*Math.pow(10,bitnum))+(1*(int)Math.pow(10,bitnum-1)));

        return a ;
    }*/

//public class Demo {
//    int count=9;
//    public void count1(){
//        int count=10;
//        System.out.println("count1="+count);
//    }
//    public void count2(){
//        System.out.println("count2="+count);
//    }
//    public static void main(String[ ] args) {
//        Demo t=new Demo();
//        t.count1();
//        t.count2();
//    }
//}


/*public class Demo {
    int count;

    Demo(){
        this(1,2);
    }

    Demo(int a,int b){

    }


    public  void count1() {
        this.count2();
        int count = 10;
        //count2();
        System.out.println("count1=" + count);
    }

    public void count2() {
        count1();
        System.out.println("count2=" + count);
    }

    public static void main(String[] args) {
        Demo t = new Demo();
        t.count1();
        t.count2();
    }
}*/


//仅在类初始化的时候执行一次，且加载顺序是严格按照类中静态资源的定义顺序来
// 加载的；静态代码块对于定义在它之后的静态变量，可以赋值，但是不能访问
/*
package day05;

public class Test {
    {
        System.out.println("代码块");
    }

    static {
        System.out.println(a);
        System.out.println("静态代码块");
    }

    static int a = 1;
}
*/

class Demo {

    /* public static void main(String[] args) {
         Vehicle vehicle = new Vehicle(20);

         vehicle.setSpeed(40);

         vehicle.move();

         vehicle.speedUp();

         vehicle.speedDown();
     }*/
    public static void main(String[] args) {
//       Person person = new Person("东升",22);
//       person.display();

       /* Person person = new Person(5);
        person.getArea();
        person.getPerimeter();*/

      /* Person person = new Person();

       person.drawPra();

       person.drawRec();

       person.drawTrian();*/


   /*     Student p1 = new Student(1, "萧炎", "男", 22, 99);
        Student p2 = new Student(2, "林动", "男", 22, 101);
        Student p3 = new Student(3, "牧尘", "男", 22, 120);
        Student p4 = new Student(4, "唐三", "男", 22, 123);
        Student p5 = new Student(5, "霍雨浩", "男", 22, 60);

        List<Student> list = new ArrayList<Student>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);


        int result = 0;
        int count = 0;
        int [] arr = new int [5];
        int i = 0;

        for (Student s: list) {
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getSet());
            System.out.println(s.getJava());

            result += s.getJava();
            count++;

            arr[i] = s.getJava();
            i++;

        }

        float a = result / count;
        System.out.println(result);
        System.out.println(a);

        Arrays.sort(arr);

        System.out.println(arr[arr.length-1]+","+arr[0]);*/




       /* Student p1 = new Student(1, "萧炎", "男", 22, 99);
        Student p2 = new Student(2, "林动", "男", 22, 101);
        Student p3 = new Student(3, "牧尘", "男", 22, 120);
        Student p4 = new Student(4, "唐三", "男", 22, 123);
        Student p5 = new Student(5, "霍雨浩", "男", 22, 60);

        List<Student> list = new ArrayList<Student>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);


        int result = 0;
        int count = 0;
        int [] arr = new int [5];
        int i = 0;

        for (Student s: list) {
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getSet());
            System.out.println(s.getJava());

            result += s.getJava();
            count++;

            arr[i] = s.getJava();
            i++;

        }

        float a = result / count;
        System.out.println(result);
        System.out.println(a);

        Arrays.sort(arr);

        System.out.println(arr[arr.length-1]+","+arr[0]);*/


        /*Hero ez = new Hero("伊泽瑞尔","远距离攻击","杀死踩虚鲲");

        Arms wj = new Arms("无尽之刃","增加暴击伤害");

        Monster monster = new Monster("踩虚鲲","篮球");

        ez.showHero();

        ez.makeFool();

        wj.showAttribute();

        monster.showSkill();*/







    }


}




