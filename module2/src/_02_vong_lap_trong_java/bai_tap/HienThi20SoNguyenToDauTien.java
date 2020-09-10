package _02_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.println("Nhập số lượng số nguyên tố cần hiển thị");
        number = input.nextInt();

        int count = 0;
        int n = 2;

        String daySoNguyenTo = "";
        while (count < number) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                daySoNguyenTo += n + ", ";
                count++;
            }
            n++;
        }
        System.out.println(daySoNguyenTo);
    }
}
