package MOd;

public class CarFinal extends CarTemplate {


    @Override
    void carWheels(int numberOfWheels) {
        System.out.println("Your car has " + numberOfWheels + " wheels.");
    }

    @Override
    void carColor(String color) {
        System.out.println("Your car is " + color + ".");
    }





}
