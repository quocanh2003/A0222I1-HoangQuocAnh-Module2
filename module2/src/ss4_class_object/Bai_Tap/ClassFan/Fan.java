package ss4_class_object.Bai_Tap.ClassFan;

public class Fan {
    public final int slow = 1;
    public final int medium = 2;
    public final int fast = 3;
    public boolean on = false;
    private int speed = slow;
    private double radius = 5;
    private String color = "blue";

    public Fan(){
    }

    public Fan(int speed, double radius, String color, boolean on){
        this.speed = speed;
        this.radius = radius;
        this.color = color;
        this.on = on;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void toSring(){
        System.out.print("Speed: "+getSpeed()+" ,Color: "+getColor()+" ,Radius: "+getRadius());
        if(this.on){
            System.out.println(" ,Fan is on");
        } else
            System.out.println(" ,Fan is off");
    }
}

