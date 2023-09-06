import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner Number = new Scanner(System.in);
        System.out.println("Nhập số đi");
        int Prime = Number.nextInt();
        System.out.println(Prime);

        for (int i = 3; i < Prime; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("số nguyên tố là " + i);
            }
        }
    }
}
