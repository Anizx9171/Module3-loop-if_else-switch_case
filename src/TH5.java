import java.text.DecimalFormat;
import java.util.Scanner;

public class TH5 {
    public static void main(String[] args) {
        double totalMoney;
        DecimalFormat formatter = new DecimalFormat("###,###,###");
        final double[] INTEREST_RATE ={4.1, 4.2, 6.8, 6.9, 7.1};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi");
       double deposits = scanner.nextDouble();
       System.out.println("Nhập số tháng gửi");
       int month = scanner.nextInt();
       if (deposits >0 && month > 0){
           if (month < 3){
               totalMoney = deposits * (INTEREST_RATE[0] / 12) * month;
           }else if (month < 6){
               totalMoney = deposits * (INTEREST_RATE[1] / 12) * month;
           }else if (month < 9){
               totalMoney = deposits * (INTEREST_RATE[2] / 12) * month;
           }else if (month < 12){
               totalMoney = deposits * (INTEREST_RATE[3] / 12) * month;
           }else{
               totalMoney = deposits * (INTEREST_RATE[4] / 12) * month;
           }
           System.err.println("Tổng số tiền bạn nhận được sau "+ month +" Tháng gửi là: " + formatter.format(totalMoney) + "vnd");
       }else{
           System.err.println("Nhập số tháng hoặc số tiền không hợp lệ");
       }
    }
}
