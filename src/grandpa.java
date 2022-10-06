public class grandpa {
    private String name;
    private int age;
    private colorEnum colorEnum;
    private colorEnum Baby;

    public grandpa() {
        
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public colorEnum getColorEnum() {
        return colorEnum;
    }

    public colorEnum getBaby() {
        return Baby;
    }

    public grandpa(String name, int age, colorEnum colorEnum, colorEnum baby) {
        this.name = name;
        this.age = age;
        this.colorEnum = colorEnum;
        Baby = baby;
    }
}


