public class check_palindrome_number {
    public static void main(String[] args) {
        int n = 231213;
        int temp = n, rev = 0;
        while (n != 0) {
            rev = rev *10;
            rev += n /10;
            n = n/10;
        }
        System.out.print(temp == rev ? "Palindrome" : "Not Palindrome");
    }
}
