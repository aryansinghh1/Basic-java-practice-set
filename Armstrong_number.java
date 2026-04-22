import java.util.*;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check: ");
        int num = sc.nextInt();

        int digit = String.valueOf(num).length();
        int temp = num;
        int sum = 0;

        for (int i = 0; i < digit; i++) {
            int num2 = num % 10;
            sum += Math.pow(num2, digit);
            num = num / 10;

        }

        if (temp == sum) {
            System.out.print("its armstrong number");
        } else {
            System.out.print("it is not armstrong number");

        }

    }

}