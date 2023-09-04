import java.util.Scanner;

public class BackToHighSchoolPhysics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int velocity = sc.nextInt();
            int time = sc.nextInt();
            int displacement = 2 * velocity * time;
            System.out.println(displacement);
        }
        sc.close();
    }
}