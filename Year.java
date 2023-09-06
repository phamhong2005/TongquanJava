import com.sun.javafx.iio.gif.GIFImageLoaderFactory;

import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner hihi = new Scanner(System.in);

        System.out.println("Nhập năm vào đây");

        int year = hihi.nextInt();

        if (year % 4 == 0 && year % 100 != 0){
            System.out.println(year + " là năm nhuận");
        } else if (year % 100 == 0 && year % 400 == 0 ) {
            System.out.println(year + " là năm nhuận");
        }else if (year % 400 == 0 && year % 100 != 0){
            System.out.println(year + " là năm nhuận");
        }
        else {
            System.out.println(year + " không phải năm nhuận");
        }

    }
}
