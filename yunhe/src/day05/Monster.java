package day05;

public class Monster {

    private String name;

    private String Skill;

    public Monster(String name, String skill) {

        this.name = name;
        Skill = skill;

    }

    Monster(){

    }

    void showSkill(){
        System.out.println(name+",展示了打篮球");
    }

}
