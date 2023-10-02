import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập giá trị bắt đầu");
        int startNumber = scanner.nextInt();
        System.out.println("Nhập giá trị kết thúc");
        int endNumber = scanner.nextInt();
        numberCheck(startNumber, endNumber);
    }

    public static void numberCheck(int start,int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if ( i%2 == 0){
                sum += i;
            }
        }
        System.out.println("Tổng các số chẵn là: " + sum);
    }

}
