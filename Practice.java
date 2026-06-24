import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        // find the first longest non repeated character substring

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number: ");

        int num = sc.nextInt();
        
        int a = 0;
        int b = 1;
        while(num!=0){
            System.out.print(a+" ");
            int temp = a;
            a = a+b;
            b = temp;
            num--;
        }
        
        

        
    }

}