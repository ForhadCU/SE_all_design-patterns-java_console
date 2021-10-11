public class Client {
    public static void main(String[] args) {
        AbstractVehicle forCar = new Car();
        AbstractVehicle forJeep = new Jeep();

        forJeep.view();
        forCar.view();
    }
}
