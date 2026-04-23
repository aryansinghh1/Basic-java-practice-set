
import java.util.Scanner;

public class Find_letter_start_with_uppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sentence: \n");
        String str = sc.nextLine();
        String[] arr = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) >= 'A' && arr[i].charAt(0) <= 'Z') {
                System.out.print(arr[i] + " ");

            }

        }
        System.out.print("No word start with capital Letter");

    }
}
