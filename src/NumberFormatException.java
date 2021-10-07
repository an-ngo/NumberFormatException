import java.util.Scanner;

public class NumberFormatException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input x: ");
        int x =scanner.nextInt();
        System.out.println("Input y: ");
        int y = scanner.nextInt();
        calculate(x,y);
        scanner.close();
    }
    public static void calculate(int x, int y) {
        try{
            int d = x / y;
            System.out.println("sub: " + d);
        }catch(Exception e){
            System.err.println("Exception: " + e.getMessage());
        }
    }
    
}
