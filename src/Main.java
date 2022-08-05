public class Main {
    public static void main(String[] args) {
        Father father= new Father(37,"Pizza","John",Hair.BROWN,100,"Running");
        Son son1 = new Son(10,"Pasta","Billy",Hair.BLACK,10,"Baseball",
                "Simon",20);
        Son son2 = new Son(12,"Hamburger","Dave",Hair.BLACK,14,"Basketball",
                "Jessie",10);
        System.out.println(father.getInfo());
        System.out.println(son1.getInfo());
        System.out.println(son2.getInfo());
        father.playWithSon();
        son1.playWithSon("Baseball");
        son2.playWithSon("homework","going to the cinema");
    }
}
