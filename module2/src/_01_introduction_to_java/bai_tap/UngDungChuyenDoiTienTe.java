package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float rate = 23000;
        float usd;
        float vnd;

        System.out.println("Enter USD : ");
        usd = scanner.nextFloat();

        vnd = usd * rate;

        System.out.println( usd + " USD = " + vnd + " VND");
    }
}
