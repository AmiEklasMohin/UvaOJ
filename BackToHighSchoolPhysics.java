import java.util.Scanner;

public class BackToHighSchoolPhysics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int givenVelocity, givenTime, displacementInDoubleTime;
        while (scanner.hasNextInt()) {
            givenVelocity = scanner.nextInt();
            givenTime = scanner.nextInt();
            displacementInDoubleTime = 2 * givenVelocity * givenTime;
            System.out.println(displacementInDoubleTime);
        }
        scanner.close();
    }
}
