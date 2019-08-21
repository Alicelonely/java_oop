package GuesBoxGame;

public class Computer {
    String name; //电脑的名字
    int score;  //电脑获胜的次数

    int comNum; //电脑出拳的数字


    public void caiquan(){

        comNum  = (int)(Math.random()*3+1); //电脑出拳的数字

        switch (comNum){
            case 1:
                System.out.println(name + "出拳：剪刀");
                break;
            case 2:
                System.out.println(name + "出拳：石头");
                break;
            case 3:
                System.out.println(name + "出拳：布");
                break;
        }
    }


}
