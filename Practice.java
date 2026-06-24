import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        // find the first longest non repeated character substring

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number: ");

        int num = sc.nextInt();

        int fact = 1;

        if(num == 1){
            System.out.println("Factorial of 1 is 1");
        }
        else{
            for(int i = 1 ; i<=num; i++){
               fact = fact * i;
            }
        }
        System.out.print(fact);
        

        
    }

}