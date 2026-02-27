
import java.util.Scanner;

public class Sum_of_numbers{
    public static void main(String [] args){
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int Number = sc.nextInt();
        for(int i = 0; i<=Number; i++){
            sum+=i;
        }
        System.out.println(sum);

    }
}