package ss4_class_object.Bai_Tap.Quadratic_Equation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = scanner.nextDouble();
        System.out.println("Nhap b:");
        double b = scanner.nextDouble();
        System.out.println("Nhap c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b , c);

        double delta = quadraticEquation.getDiscrimiant();

        System.out.println("delta="+delta);

        if (delta>=0){
            System.out.println("phuong trinh co hai nghiem:");
            System.out.println("r1 = "+quadraticEquation.getRoot1());
            System.out.println("r2 = "+quadraticEquation.getRoot2());
        }
        else System.out.println("phuong trinh vo nghiem");
    }
}
