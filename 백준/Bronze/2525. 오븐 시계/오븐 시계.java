import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int h =sc.nextInt();
        int m = sc.nextInt();
        int cookingM = sc.nextInt();
        int time = m + cookingM;

        //m + cookingM / 60 == 결과 => h + 결과
        //m _ cookingM % 60 == 결과 => m = 결과

        if (time < 60) {
            m = time;
        } else if (time >= 60) {
            h = h + (time / 60);
            if (h >= 24) {
                h = h - 24;
            }
            m = time % 60;
        }
        System.out.println(h + " " + m);
    }
}