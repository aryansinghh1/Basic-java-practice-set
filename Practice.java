
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String[] str = s.split(" ");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 1; j < str[i].length(); j++) {
                if (isVowel(str[i].charAt(j - 1)) == true && isVowel(str[i].charAt(j)) == true) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

}
