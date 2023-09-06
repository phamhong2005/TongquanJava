import java.util.Date;
import java.util.Scanner;

public class Mouth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap thang vao");
        int Month = sc.nextInt();
        String Day ;
        switch (Month){
            case 2:
                Day = "28 or 29 ";
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                Day = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                Day = "30";
                break;
            default:
                Day = "Không có tháng này";
        }
        System.out.println("Tháng "+ Month + " Có "  + Day);
    }
}
