import java.util.Scanner;

public class BT6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean outWhite = true;
        while (outWhite) {
            System.out.println("Ban muon lam gi (a/b/c/x)");

            String text = scanner.nextLine();
            switch (text) {
                case "a":
                    System.out.println("Nhap chieu dai HCN");
                    int dai = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap chieu rong HCN");
                    int rong = Integer.parseInt(scanner.nextLine());
                    if (dai>0 && rong>0){
                        System.out.println("Dien tich hcn la: " + dai * rong);
                        System.out.println("Dien chu vi hcn la: " + (dai + rong) * 2);
                    }else{
                        System.out.println("Khong hop le");
                    }
                    break;
                case "b":
                    System.out.println("Nhap chieu dai canh 1 cua tam giac");
                    int a = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap chieu dai canh 2 cua tam giac");
                    int b = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nhap chieu dai canh 3 cua tam giac");
                    int c = Integer.parseInt(scanner.nextLine());
                    if (checkTamGiac(a,b,c)){
                        double s = (a + b + c) / 2;
                        final double S = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                        System.out.println("CHu vi cua tam giac la " + (a + b + c));
                        System.out.println("DIen tich cua tam giac la " + S);
                    }else{
                        System.out.println("Khong phai 1 tam giac");
                    }
                    break;
                case "c":
                    System.out.println("Nhập bán kính của hình tròn: ");
                    double radius = Double.parseDouble(scanner.nextLine());
                    if (radius>0){
                        System.out.println("C của hình tròn: " + radius * 2 * Math.PI);
                        System.out.println("S của hình tròn: " + radius * radius * Math.PI);
                    }else{
                        System.out.println("khong hop le");
                    }
                    break;
                case "x":
                    System.out.println("may chac khong? (y/n)");
                    String agree = scanner.nextLine();
                    switch (agree) {
                        case "y":
                            outWhite = false;
                            break;
                        default:
                            break;
                    }
                default:
                    break;
            }
        }
    }
    public static boolean checkTamGiac(int a, int b, int c) {
        if (a >0 && b >0 && c>0){
            if (a + b > c && a +c>b && c+b>a){
                return true;
            }
            return false;
        }
        return false;
    }
}
