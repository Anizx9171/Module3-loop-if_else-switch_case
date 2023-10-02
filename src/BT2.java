public class BT2 {
    public static void main(String[] args) {
        //hinh chu nhat
        for (int i = 0; i < 3; i++) {
            System.out.println("* * * * * * * *");
        }

        System.out.println(" ");

        // tam giac dinh tren
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println(" ");

        //tam giac dinh duoi
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println(" ");

        //tam giac can
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 2; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
