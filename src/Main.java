public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());
        System.out.println("******************************");

        Player player1 = new Player("Fatih",100,Weapon.AK_47);
        Player player2 = new Player("Ahmet",50,Weapon.M4A4);
        System.out.println("Fatih'in kalan canı: " + player1.healthRemaining());
        System.out.println("Ahmet'in kalan canı: " + player2.healthRemaining());

        player1.loseHealth(50);
        System.out.println("Fatih'in kalan canı: " + player1.healthRemaining());

        player2.restoreHealth(25);
        System.out.println("Ahmet'in kalan canı: " + player2.healthRemaining());


    }
}