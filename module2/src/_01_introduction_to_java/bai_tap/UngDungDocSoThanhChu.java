package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number;

        System.out.print("Nhập số cần đọc: ");
        number = scanner.nextLine();

            switch (number) {
                case "0":
                    System.out.println("Zero");
                    break;
                case "1":
                    System.out.println("One");
                    break;
                case "2":
                    System.out.println("Two");
                    break;
                case "3":
                    System.out.println("Three");
                    break;
                case "4":
                    System.out.println("Four");
                    break;
                case "5":
                    System.out.println("Five");
                    break;
                case "6":
                    System.out.println("Six");
                    break;
                case "7":
                    System.out.println("Seven");
                    break;
                case "8":
                    System.out.println("Eight");
                    break;
                case "9":
                    System.out.println("Nine");
                    break;
                case "10":
                    System.out.println("Ten");
                    break;
                case "11":
                    System.out.println("Eleven");
                    break;
                case "12":
                    System.out.println("Twelve");
                    break;
                case "13":
                    System.out.println("Thirdteen");
                    break;
                case "14":
                    System.out.println("");
                default:
                    System.out.println("Out of ability");
            }
    }
}
