import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        // find the first longest non repeated character substring

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string: ");
        String str = sc.nextLine();

        String ch = "";

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (ch.indexOf(current) != -1) {
                break;
            }

            ch = ch + current;
        }

        System.out.println(ch);
    }

}