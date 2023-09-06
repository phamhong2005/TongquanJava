import java.util.Scanner;

public class Weight {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b = new Scanner(System.in);

        System.out.println("Nhập Weight");
        double Weight = a.nextDouble();
        System.out.println("Nhâp Height");
        double Height = b.nextDouble();

        double Bmi = Weight / Math.pow(Height, 2);

        if (Bmi < 18.5) {
            System.out.println("Underweight");
        } else if (Bmi >= 18.5 && Bmi <= 25.0) {
            System.out.println("Normal");
        } else if (Bmi >= 25.0 && Bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

    }
}
