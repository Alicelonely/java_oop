package day05;

public class Arms {
    private String name;

    private String attribute;

    Arms(){

    }

    public Arms(String name, String attribute) {

        this.name = name;
        this.attribute = attribute;

    }

    void showAttribute() {
        System.out.println(name+","+attribute);
    }
}
