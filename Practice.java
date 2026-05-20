import  java.util.*;

public class Practice {

    public static void main(String[] args) {

        System.out.print("Enter your number: \n");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit = String.valueOf(num).length();

        int count = 0;

        for(int i = 0 ; i<digit ; i++){
            int temp = num%10;
            if(isPrime(temp)){
                count++;
            }
            num = num/10;
        }

        System.out.print(count);
        
    }

    public static boolean isPrime(int c){
        if(c<=1){
            return false;
        }
        else{
            for ( int i = 2 ; i*i <= c ; i++){
                if(c%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}