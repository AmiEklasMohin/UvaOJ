import java.util.Scanner;

public class TexQuotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 0;
        while(sc.hasNextLine()) {
            String inputLine = sc.nextLine();
            String outputLine = "";
            for (int i = 0; i < inputLine.length(); i++) {
                if (inputLine.charAt(i) == '"' && flag == 0) {
                    outputLine = outputLine + "``";
                    flag = 1;
                } else if ((inputLine.charAt(i)) == '"' && flag == 1) {
                    outputLine = outputLine + "''";
                    flag = 0;
                } else {
                    char add = inputLine.charAt(i);
                    outputLine = outputLine + add;
                }
            }
            System.out.println(outputLine);
        }
        sc.close();
    }
}