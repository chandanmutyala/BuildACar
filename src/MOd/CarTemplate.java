package MOd;

public abstract  class CarTemplate {
    abstract void carWheels(int numberOfWheels);
    abstract void carColor(String color);

    Engine getEngine() {
        return new Engine(200, 20);
    }
    Controls getControls() {
        return new Controls("Manual Gear", "Automatic gear");
    }
    Ac getAc() {
        return new Ac(25, 5);
    }

    void getCar() {
        Engine engine = getEngine();
        Ac ac = getAc();
        Controls controls = getControls();
        carWheels(4);
        carColor("Blue");

        System.out.println("Car details:");
        System.out.println("Engine details - Horsepower: " + engine.getHorsePower() + ", Weight: " + engine.getWeight());
        System.out.println("Ac Frequency: " + ac.getFrequency() + ", No of Ac's: " + ac.getCount() );
        System.out.println("Car Movement: " + controls.getAutomatic());
    }



}
