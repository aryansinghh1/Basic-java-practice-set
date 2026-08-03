import java.util.Scanner;

public class Practice2 {

    static boolean  isPrime(int num) {

        if(num<=1){
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                 return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number: ");

        int primeTill = sc.nextInt();

        int count = 0 ;

        for(int i = 1; i<primeTill ; i++){
            if(isPrime(i) == true){
                count++;
            }
        }

        System.out.println("Prime in between" + primeTill + " " + count);

        

    }
}
