public class Grandfather {
    private int age;
    private String name;
    private Hair colorHair;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Hair getColorHair() {
        return colorHair;
    }

    public Grandfather(int age, String name, Hair colorHair) {
        this.age = age;
        this.name = name;
        this.colorHair = colorHair;
    }
    public String getInfo(){
        return "Name " + name +
                "\nAge " + age +
                "\nColor of hair " + colorHair;
    }
}
