package ss5_access_modifier.Thuc_Hanh.static_property;

public class Car {
    private String name;

    private String engine;



    public static int numberOfCars;



    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }
}
