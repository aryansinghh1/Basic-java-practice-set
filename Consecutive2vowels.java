import java.util.*;

public class Consecutive2vowels {
    public static void main(String[] args) {
        System.out.println("Enter the sentance: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        String[] str = s.split(" ");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            for (int j = 1; j < str[i].length(); j++) {
                if (isVowel(str[i].charAt(j - 1)) && isVowel(str[i].charAt(j))) {
                    count++;
                    System.out.println(str[i]);
                    break;
                }
            }
        }
        System.out.print(count);

    }

    public static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }

}