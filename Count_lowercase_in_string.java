
import java.util.Scanner;

public class Count_lowercase_in_string {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        // for(int i = 0 ; i < s.length(); i++){
        //     if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
        //         System.out.print(s.charAt(i));
                
        //     }
        // }
        
        for(int i = 0 ; i < s.length(); i++){
            if(Character.isLowerCase(s.charAt(i))){
                System.out.print(s.charAt(i));

            }
        }
    }
}
