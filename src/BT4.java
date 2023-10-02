public class BT4 {
    public static void main(String[] args) {
        int count = 5;
        while (true){
            if ( count % 5==0 && count % 7==0 && count % 11==0){
                System.out.println("count: " + count);
                break;
            }
            count++;
        }
    }
}