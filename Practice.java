
import java.util.Scanner;

public class Practice {
    public static void main(String [] args){
        System.out.print("Enter the string: \n");
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();

        for(int i = 0 ; i< string1.length(); i++){
            if(i%2 != 0){
                System.out.print(string1.charAt(i));
            }
        }

        
    }
    
}
