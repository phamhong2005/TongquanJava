import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//Kiểm tra số nguyên tố
public class Main {
    public static void main(String[] args) {

        for (int i = 3; i < 100; i++) {
            int count = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(i + " là số nguyên tố");
            }
        }
    }
}

