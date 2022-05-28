package ss5_access_modifier.Bai_Tap.access_modifier;

import java.util.Scanner;

public class TestCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập R: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Area: "+circle.getArea());
    }
}
