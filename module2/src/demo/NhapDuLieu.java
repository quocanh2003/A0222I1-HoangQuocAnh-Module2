package demo;

import java.util.Scanner;

//nhap du lieu tu ban phim
public class NhapDuLieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ho va ten");
        String hoVaTen = scanner.nextLine();
        System.out.println("so bao danh");
        long soBaoDanh = scanner.nextLong();
        System.out.println("diem thi");
        float diemThi = scanner.nextFloat();
        System.out.println("so");
        int so = scanner.nextInt();
        System.out.println("ho va ten: "+ hoVaTen);
        System.out.println("so bao danh: "+ soBaoDanh);
        System.out.println("diem thi: "+ diemThi);
        System.out.println("so: "+ so);
    }
}
