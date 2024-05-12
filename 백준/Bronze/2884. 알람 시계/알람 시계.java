import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int m = sc.nextInt();

        //45분 일찍 알람을 맞춘다.
        // -45분
        // 0보다 작을 때, +15, h-1
        // 0보다 클 때, -45
        // 0과 같을 때 h-1

        if (m - 45 > 0) {
            m = m - 45;
        } else if (m - 45 < 0) {
            m = m + 15;
            if (h == 0) {
                h = 23;
            } else {
                h = h - 1;
            }
        } else if (m - 45 == 0) {
            m = m - 45;
        }

        System.out.println(h + " " + m);
    }
}