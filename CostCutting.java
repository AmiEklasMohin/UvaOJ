import java.util.Scanner;
import java.util.Arrays;

public class CostCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int i = 1; i <= testcase; i++) {
            int[] arr = new int[3];
            for (int j = 0; j < 3; j++) {
                arr[j] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println("Case " + i + ":" + " " + arr[1]);
        }
        sc.close();
    }
}