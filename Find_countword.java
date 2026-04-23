import java.util.*;

public class Find_countword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        System.out.println("Enter the word to find: ");
        String s = sc.nextLine();

        String ch = "";

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.isLetter(arr[i].charAt(j))) {
                    ch = ch + arr[i].charAt(j);
                }
            }
            if (ch.equals(s)) {
                count++;
            }
            ch = "";
        }

        System.out.println("count is: " + count);

    }
}
