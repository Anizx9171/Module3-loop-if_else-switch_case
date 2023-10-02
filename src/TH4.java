import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cân nặng của bạn (kg)");
        double weight = scanner.nextDouble();
        System.out.println("Nhập chiều cao của bạn (m)");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        if (bmi < 18.5) System.err.println("Hơi gầy");
        else if (bmi < 25.0) System.err.println("Bình thường");
        else if (bmi < 23.0) System.err.println("Hơi béo");
        else System.err.println("quá béo");
    }

}
