package day05;

public class Hero {
    private String name;

    private String attribute;

    private String Skill;

    Hero(){

    }

    public Hero(String name, String attribute,String Skill) {

        this.Skill = Skill;
        this.name = name;
        this.attribute = attribute;

    }

    void showHero(){
        System.out.println(name+","+attribute+","+Skill);
    }

    void makeFool(){
        System.out.println("你打死了踩虚鲲");
    }

}
