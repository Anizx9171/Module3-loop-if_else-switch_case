import java.util.Scanner;

public class BT5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean outWhite = true;
        while (outWhite){
            System.out.println("Ban muon lam gi (a/b/x)");
            System.out.println("a. Kiểm tra tính chẵn lẻ");
            System.out.println("b. Kiểm tra số nguyên tố");
            System.out.println("x. Thoát chương trình");
            String text = scanner.nextLine();
            switch (text){
                case "a":
                    System.out.println("Nhap so ban muon kiem tra tinh chan le");
                    int numCheck = Integer.parseInt(scanner.nextLine());
                    if (numCheck >0){
                        if (numCheck %2 == 0){
                            System.out.println("So "+ numCheck +" la so chan");
                        }else {
                            System.out.println("So "+ numCheck +" la so le");
                        }
                    }else{
                        System.out.println("So "+ numCheck +" khong chan cung khong le");
                    }
                    break;
                case "b":
                    System.out.println("Nhap so ban muon kiem tra snt");
                    int num = Integer.parseInt(scanner.nextLine());
                    if (num < 2){
                        System.out.println(num + " khong phai so nguyen to");
                    }else {
                        boolean check = true;
                        for (int i = 2; i < num; i++){
                            if (num % i == 0){
                                check = false;
                            }
                        }
                        if (check){
                            System.out.println(num + " la so nguyen to");
                        }else{
                            System.out.println(num + " khong phai so nguyen to");
                        }
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
}
