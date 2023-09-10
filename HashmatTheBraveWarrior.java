import java.util.Scanner;
import java.lang.Math;

public class HashmatTheBraveWarrior {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long sizeOfHashmatsArmy, opponentsArmySize, absoluteDifference;
        while (scanner.hasNextLong()) {
            sizeOfHashmatsArmy = scanner.nextLong();
            opponentsArmySize = scanner.nextLong();
            absoluteDifference = Math.abs(sizeOfHashmatsArmy - opponentsArmySize);
            System.out.println(absoluteDifference);
        }
        scanner.close();
    }
}
