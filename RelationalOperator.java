import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for (int i = 1; i <= testCase; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a > b) {
                System.out.println('>');
            } else if (a < b) {
                System.out.println('<');
            } else {
                System.out.println('=');
            }
        }
        sc.close();
    }
}