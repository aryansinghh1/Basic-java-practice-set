import java.util.*;
public class Prime_number {
    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        else{
            for(int i = 2; i*i <= n; i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to check: ");
        int num = sc.nextInt();
        System.err.println(isPrime(num));
    }
}
