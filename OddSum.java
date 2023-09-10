import java.util.Scanner;

public class OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 1; i <= testcase; i++) {
            int firstNumber = sc.nextInt();
            int lastNumber = sc.nextInt();
            int oddSum = 0;
            for (int j = firstNumber; j <= lastNumber; j++) {
                if (j % 2 == 1) {
                    oddSum += j;
                }
            }
            System.out.println("Case " + i + ":" + " " + oddSum);
        }
        sc.close();
    }
}
