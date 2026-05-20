
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.print("Enter your string: \n");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        for (int i = 1; i < s.length(); i++) {
            if (i % 2 == 0) {
                if (isConsonent(s.charAt(i))) {
                    System.out.print(s.charAt(i));
                }

            }
        }

    }

    public static boolean isConsonent(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c==' ') {
            return false;
        }
        return true;
    }

}
