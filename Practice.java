import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        System.out.println("Enter Your string: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int c = 0;
        int v = 0;
        int d = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isLetter(str.charAt(i))) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                        || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'O'
                        || str.charAt(i) == 'I' || str.charAt(i) == 'U') {
                    v++;
                } else {
                    c++;
                }
            }
            else if(Character.isDigit(str.charAt(i))){
                d++;
            }
        }

        System.out.println("count of vowel: "+v);
        System.out.println("count of consonent: "+c);
        System.out.println("count of number: "+d);
    }

}