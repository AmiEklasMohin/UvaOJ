import java.util.Scanner;

public class TheDecoder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String encodedLine = scanner.nextLine();
            String decodedLine = "";
            for (int i = 0; i < encodedLine.length(); i++) {
                int x = encodedLine.charAt(i) - 7;
                char ch = (char) (x);
                decodedLine = decodedLine + String.valueOf(ch);
            }
            System.out.println(decodedLine);
        }
        scanner.close();
    }
}
