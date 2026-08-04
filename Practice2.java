import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = sc.nextLine().toLowerCase();

        int[] arr = new int[26];

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a']++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print((char) (i + 'a') + "" + arr[i]);
            }
        }
    }
}
