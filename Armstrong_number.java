public class Armstrong_number {
    public static void main(String[] args) {

        int n = 1634;
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int digit = n % 10;
            sum += digit * digit * digit;
            n = n / 10;
        }
        System.out.println(temp == sum ? "Armstrong" : "Not Armstrong");

    }
}


// int n = 232129;
// int digit = String.valueOf(n).length();
// System.out.println(digit);