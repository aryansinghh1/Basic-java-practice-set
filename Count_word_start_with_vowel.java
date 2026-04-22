import java.util.Scanner;

public class Count_word_start_with_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String to check: ");
        String s = sc.nextLine();
        s = s.toLowerCase();

        String[] arr = s.split(" ");

        int count = 0;

        String sb;

        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i].charAt(0);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'
                    || ch == 'u') {
                count++;
            }

        }
        if (count > 0) {
            System.out.print(count);
        } else {
            System.out.print("No such words");

        }

    }
}
