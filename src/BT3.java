import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       while (true){
            System.out.println("Nhập vào số cuối cùng của dãy số nguyên tố");
            byte number = scanner.nextByte();
           for (byte i = 2; i < number; i++) {
               if (showSNT(i)){
                   System.out.println(i+" là số nguyên tố");
               }
           }
        }
    }

    public static boolean showSNT(byte number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
