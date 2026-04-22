import java.util.*;

public class Test_level {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check: ");
        int num = sc.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            int num2 = num%10;
            if (num2 % i == 0) {
                count++;
            }
            num = num/10;
        }

        System.out.println(count);


    }
}
