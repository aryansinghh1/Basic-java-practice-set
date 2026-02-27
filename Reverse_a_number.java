public class Reverse_a_number {
    public static void main(String[] args) {
        int n = 24323;
        int rev = 0;
        while(n!=0){
            rev = rev * 10;
            rev += n % 10;
            n = n/10;
        }
        System.out.println("Reversed Number is: "+rev);
    }
}
