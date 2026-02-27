
import java.util.Scanner;

public class Factorial_01 {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int num = sc.nextInt();
        if(num <= 0){
            System.out.println("Cannot be determind");

        }
        else if(num == 1){
            System.out.println("Factorial of 1 is 1");
        }
        else{

            for (int i = 1;i<=num;i++){
                fact *= i;
            }
        }
        System.out.println("factorial of "+num+" is "+fact);
    }
}
