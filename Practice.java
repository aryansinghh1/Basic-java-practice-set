import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter the numbers:");

        int gcd = sc.nextInt(); // First number

        for (int i = 1; i < n; i++) {
            int num = sc.nextInt();

            while (num != 0) {
                int temp = num;
                num = gcd % num;
                gcd = temp;
            }
        }

        System.out.println("GCD = " + gcd);

        sc.close();
    }
}