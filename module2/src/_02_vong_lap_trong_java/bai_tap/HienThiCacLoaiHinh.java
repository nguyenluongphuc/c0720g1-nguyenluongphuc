package _02_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice : ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    for (int i = 0; i < 3 ; i++) {
                        for (int j = 0; j < 7; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 5; i++) {
                        for(int j = 0; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    System.out.println();
                    for (int i = 5; i > 0; i--){
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:

                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice");
            }
        }
    }
}
