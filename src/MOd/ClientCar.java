package MOd;

public class ClientCar {
    public static void main(String[] args) {
        CarFinal carFinal = new CarFinal();
        carFinal.carWheels(4);
        carFinal.carColor("Black");

        CarTemplate carTemplate = new CarFinal();
        carTemplate.getCar();
    }
}