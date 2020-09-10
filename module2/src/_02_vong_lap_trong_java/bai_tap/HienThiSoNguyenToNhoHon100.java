package _02_vong_lap_trong_java.bai_tap;

public class HienThiSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int number = 100;
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
