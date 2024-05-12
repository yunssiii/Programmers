import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalPrice = sc.nextInt();
        int totalNum = sc.nextInt();
        int price = 0;
        int num = 0;
        int hap = 0;

        for (int i = 0; i < totalNum; i++) {
            price = sc.nextInt();
            num = sc.nextInt();
            hap += (price * num);
        }

        if (hap == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
