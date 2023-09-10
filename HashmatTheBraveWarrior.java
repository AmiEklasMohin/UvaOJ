import java.util.Scanner;
import java.lang.Math;

public class HashmatTheBraveWarrior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sizeOfHashmatsArmy, sizeOfOpponentsArmy, absoluteDifference;
        while (scanner.hasNextLong()) {
            sizeOfHashmatsArmy = scanner.nextLong();
            sizeOfOpponentsArmy = scanner.nextLong();
            absoluteDifference = Math.abs(sizeOfHashmatsArmy - sizeOfOpponentsArmy);
            System.out.println(absoluteDifference);
        }
        scanner.close();
    }
}
