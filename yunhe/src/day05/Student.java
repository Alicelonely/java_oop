package day05;

public class Student {
    private int No;

    private String Name;

    private String Set;

    private int Age;

    private int Java;

    Student() {

    }

    Student(int no, String name, String set, int age, int java) {
        this.No = no;

        this.Name = name;

        this.Set = set;

        this.Age = age;

        this.Java = java;
    }

    public int getNo() {
        return No;
    }

    public String getName() {
        return Name;
    }

    public String getSet() {
        return Set;
    }

    public int getAge() {
        return Age;
    }

    public int getJava() {
        return Java;
    }
}
