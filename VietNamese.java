import java.util.Scanner;

public class VietNamese {
    public static void main(String[] args) {
        double vnd = 23.000;
        double usd ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Usd");
        usd = sc.nextDouble();
        double Vnd = usd * 23.000;
        System.out.println("Số tiền quy đổi là " + Vnd);

    }
}
