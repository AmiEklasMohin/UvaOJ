import java.util.Scanner;

public class TheDecoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) {
                int x = str.charAt(i) - 7;
                System.out.print((char)(x));
            }
            System.out.println();
        }
        sc.close();
    }
}