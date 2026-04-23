import java.util.*;

public class Test_level {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number to check: ");
        int num = sc.nextInt();

        int a = 0;
        
        int b = 1;

        

        while(num>0){
            System.out.print(a + " ");
            int temp = a +b;
            a = b;
            b = temp;
            num--;
        }
        
    }
}
