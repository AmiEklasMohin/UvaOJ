import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class JollyJumpers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] isJolly = new int[n - 1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            if (n == 1) {
                System.out.println("Jolly");
                continue;
            }
            for (int i = 1; i < n; i++) {
                int k = Math.abs(arr[i] - arr[i - 1]);
                if (k > 0 && k < n) {
                    isJolly[i - 1] = k;
                }
            }
            Arrays.sort(isJolly);
            boolean flag = true;
            for (int i = 0; i < (n - 1); i++) {
                if (isJolly[i] != (i + 1)) {
                    System.out.println("Not jolly");
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("Jolly");
            }
        }
        sc.close();
    }
}