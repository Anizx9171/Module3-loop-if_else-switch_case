import java.util.Scanner;

public class TH1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a (ax+b = c)");
        double  a = scanner.nextDouble();
        System.out.println("Nhap b (ax+b = c)");
        double b = scanner.nextDouble();
        System.out.println("Nhap c (ax+b = c)");
        double c = scanner.nextDouble();
        solvePT(a,b,c);
    }

    public static void solvePT(double a,double b,double c) {
       if (a == 0 && c == b){
           System.err.println("Pt có vô số nghiệm");
       }else if(a == 0 && c != b){
           System.err.println("Pt vô nghiệm");
       }else{
           System.err.println("Pt có 1 nghiệm là: " + (c-b)/a);
       }
    }
}