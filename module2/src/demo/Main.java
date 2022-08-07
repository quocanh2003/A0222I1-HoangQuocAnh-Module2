package demo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float width;
        float heigh;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter heigh: ");
        heigh = scanner.nextFloat();
        float area = width * heigh;
        System.out.println("area is: "+ area);
    }
}
