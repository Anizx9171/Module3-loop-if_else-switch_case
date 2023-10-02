import java.util.Scanner;

public class TH3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap nam ban muon kiem tra: ");
        int year = scanner.nextInt();
       if (checkLeapYear(year)){
           System.err.println("Năm nhuận!");
       }else{
           System.err.println("Không phải năm nhuận!");
       }
    }
    public static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
