import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        // find the first longest non repeated character substring

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number: ");

        int num = sc.nextInt();
        int num2 = sc.nextInt();

        
        while(num2!=0){
            int temp = num2;
            num2 = num%num2;
            num = temp;

        }
        System.out.print(num);
        

        
    }

}