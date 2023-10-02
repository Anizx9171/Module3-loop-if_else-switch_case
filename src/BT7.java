import java.util.Scanner;

public class BT7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh a");
        double a = scanner.nextDouble();
        System.out.println("Nhap canh b");
        double b = scanner.nextDouble();
        System.out.println("Nhap canh c");
        double c = scanner.nextDouble();
        if (check(a,b,c)){
            double s = (a + b + c) / 2;
            System.err.println("Ba cạnh " + a +", " + b + ", "+c + " là 3 cạnh của 1 tam giác");
            System.err.println("Chu vi tam giác là: " + a+b+c);
            System.err.println("Diện tích tam giác là: " + Math.sqrt(s * (s - a) * (s - b) * (s - c)));
        }else{
            System.err.println("Ba cạnh " + a +", " + b + ", "+c + " không phải 3 cạnh của 1 tam giác");
        }
    }

    public static boolean check(double a, double b, double c) {
        if (a >0 && b >0 && c>0){
            if (a + b > c && a +c>b && c+b>a){
                return true;
            }
            return false;
        }
        return false;
    }
}
