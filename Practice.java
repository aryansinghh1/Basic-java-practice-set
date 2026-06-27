import java.util.Scanner;

public class Practice {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for gcd: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        
        while(num2!=0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        while (num3 != 0){
            int temp = num3;
            num3 = num1%num3;
            num1 = temp;
        }
    
        System.out.println(num1);
        sc.close();
    }
}