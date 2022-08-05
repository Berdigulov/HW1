public class Father extends Grandfather{
    private int cash;
    private String likedFood;
    private String typeOfSport;

    public Father(int age, String likedFood, String name, Hair colorHair, int cash, String typeOfSport) {
        super(age, name, colorHair);
        this.likedFood = likedFood;
        this.cash = cash;
        this.typeOfSport = typeOfSport;
    }

    public int getCash() {
        return cash;
    }

    public String getTypeOfSport() {
        return typeOfSport;
    }
    public final void playWithSon(){
        System.out.println("Father with his son are playing baseball!!!");
    }
    public void playWithSon(String game){
        System.out.println("Father with his son are playing " + game);
    }
    public void playWithSon(String doingTogether,String doingSomething){
        System.out.println("Son is " + doingTogether + " with father's help");
        System.out.println("Son is " + doingSomething + " with his father");
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "Cash " + cash +
                "\nLiked food " + likedFood +
                "\nType of Sport " + typeOfSport;
    }
}
