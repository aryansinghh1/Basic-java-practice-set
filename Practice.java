import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        System.out.println("Enter Your string: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int u = 0;
        int l = 0;
        int c = 0;
        int v = 0;
        int num = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))) {
                if (Character.isUpperCase(str.charAt(i))) {
                    u++;
                } else if (Character.isLowerCase(str.charAt(i))) {
                    l++;
                }

            }
            if (Character.isLetter(str.charAt(i))) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'i'
                        || str.charAt(i) == 'e' || str.charAt(i) == 'A' || str.charAt(i) == 'E'
                        || str.charAt(i) == 'I'
                        || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                    v++;

                } else {
                    c++;
                }
            }
            if (Character.isDigit(str.charAt(i))) {
                num++;
            }

        }

        System.out.println("count of Uppercase: " + u);
        System.out.println("count of Lowercase: " + l);
        System.out.println("count of vowel: " + v);
        System.out.println("count of consonent: " + c);
        System.out.println("count of number: " + num);

    }

}