import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        // count the word in a sentence that starts with vowel

        System.out.println("Enter Your string: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] arr = str.split(" ");

        int c = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) == 'a' || arr[i].charAt(0) == 'e' || arr[i].charAt(0) == 'i' || arr[i].charAt(0) == 'o'
                    || arr[i].charAt(0) == 'u' || arr[i].charAt(0) == 'A' || arr[i].charAt(0) == 'E'
                    || arr[i].charAt(0) == 'I' || arr[i].charAt(0) == 'O' || arr[i].charAt(0) == 'U') {
                c++;
            }

        }

        if (c > 0) {

            System.out.println("count of word: " + c);
        } else {

            System.out.println("No such words");
        }

    }

}