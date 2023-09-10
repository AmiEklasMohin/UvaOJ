import java.util.Arrays;
import java.util.Scanner;

public class CostCutting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcase = scanner.nextInt();
        int[] salaryList = new int[3];
        for (int i = 1; i <= testcase; i++) {
            for (int j = 0; j < 3; j++) {
                salaryList[j] = scanner.nextInt();
            }
            Arrays.sort(salaryList);
            System.out.println("Case " + i + ": " + salaryList[1]);
        }
        scanner.close();
    }
}
