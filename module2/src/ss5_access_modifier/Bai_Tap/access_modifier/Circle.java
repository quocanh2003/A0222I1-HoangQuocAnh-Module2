package ss5_access_modifier.Bai_Tap.access_modifier;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    Circle(){

    }

    Circle(double radius){
        this.radius = radius;
    }

    double getRadius(){
        return this.radius;
    }

    double getArea(){
        return this.radius*3.14;
    }
}
