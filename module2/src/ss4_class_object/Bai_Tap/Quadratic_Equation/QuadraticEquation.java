package ss4_class_object.Bai_Tap.Quadratic_Equation;

public class QuadraticEquation {
    private double a, b ,c;
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    public double getDiscrimiant(){
        return (this.b*b -(4*this.a*this.c));
    }
    public double getRoot1(){
        return (-this.b + Math.sqrt(this.b*this.b-4*this.a*this.c))/2;
    }
    public double getRoot2(){
        return (-this.b - Math.sqrt(this.b*this.b-4*this.a*this.c))/2;
    }
}
