import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap thang ban muon kiem tra: ");
        byte month = Byte.parseByte(scanner.nextLine());
        System.out.println("Nhap nam ban muon kiem tra: ");
        int year = Integer.parseInt(scanner.nextLine());
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 12:
                System.err.println("Tháng có 31 ngày");
                break;

            case 4:
            case 6:
            case 9:
            case 10:
            case 11:
                System.err.println("Tháng có 30 ngày");
                break;
            case 2:
                if (checkLeapYear(year)) {
                    System.err.println("Tháng có 29 ngày");
                } else {
                    System.err.println("Tháng có 28 ngày");
                }
                break;
            default:
                System.err.println("Thang khong ton tai");
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
