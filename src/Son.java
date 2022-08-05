public class Son extends Father{
    private int toys;
    private String friend;
    private Hair colorHair;

    public Son(int age, String likedFood, String name, Hair colorHair, int cash, String typeOfSport, String friend,int toys) {
        super(age, likedFood, name, colorHair, cash, typeOfSport);
        this.friend  = friend;
        this.toys = toys;
    }


    public int getToys() {
        return toys;
    }

    public String getFriend() {
        return friend;
    }

    @Override
    public Hair getColorHair() {
        return colorHair;
    }

    @Override
    public void playWithSon(String game) {
        super.playWithSon(game);
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ "Toys " + toys +
                "\nFriend " + friend;
    }
}
