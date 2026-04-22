import java.util.Scanner;

public class Count_number_of_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check: ");
        String s = sc.nextLine();

        String[] arr = s.split(" ");

        int count = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] != "") {
                count++;
            }
        }

        System.out.print(count);

    }
}
