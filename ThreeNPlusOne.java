import java.util.Scanner;
import java.lang.Math;

public class ThreeNPlusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int a = i, b = j;
            int maxCycleLength = 0;
            if (i > j) {
                int temp = i;
                i = j;
                j = temp;
            }
            for (int x = i; x <= j; x++) {
                int temp = x, count = 1;
                while (temp != 1) {
                    if (temp % 2 == 0) {
                        temp = temp  / 2;
                    } else {
                        temp = (temp * 3) + 1;
                    }
                    count += 1;
                }
                maxCycleLength = Math.max(maxCycleLength, count);
            }
            System.out.println(a + " " + b + " " +maxCycleLength);
        }
        sc.close();
    }
}
