import java.util.Scanner;

public class HashmatTheBraveWarrior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long hashmatsArmySize = sc.nextLong();
            long opponentsArmysize = sc.nextLong();
            long diff = Math.abs(opponentsArmysize - hashmatsArmySize);
            System.out.println(diff);
        }
        sc.close();
    }
}