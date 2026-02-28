public class check_palindrome_number {
    public static void main(String[] args) {
        int n = 12321;
        int temp = n;
        int rev = 0;
        while (n != 0) {
            rev = rev*10;
            rev += n%10;
            n = n/10;
        }

        // System.out.print(rev);
        System.out.print(temp == rev ? "Palindrome" : "Not Palindrome");
    }
}
