import java.util.Scanner;

public class TH6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        int a = scn.nextInt();
        System.out.println("Nhập số thứ 2");
        int b = scn.nextInt();
        System.err.println("ước chung lớn nhất của "+a+ ", " +b +" là: "+ findNumber(a,b));
    }
    public static int findNumber(int a,int b) {
        int count;
        count = Math.min(a,b);
        do {
            if (a % count == 0 && b % count ==0){
                return count;
            }
            count--;
        }while (true);
    }
}
