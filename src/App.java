import transports.*;

public class App {
    public static void main(String[] args) throws Exception {
        Transport f90 = new Transport("bmw", "airplan");
        car camry = new car("sidan", "car", "tayota");
        ship ggg = new ship("ship", "jip", 2020);
        airplan gt100 = new airplan("gt100", "nissan", "airplan");

        f90.feelTank();
        camry.crushTheCar();
        ggg.move();
        gt100.blastOff();
    }
}
