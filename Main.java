import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Ocean ocean1 = new Ocean();
        ocean1.createOcean( 10, 10);
        ocean1.addShip(4, 6, 2, true);
        ocean1.printOcean();
    }
}