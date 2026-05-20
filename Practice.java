
import java.util.Scanner;

public class Practice {
    public static void main(String [] args){
        System.out.print("Enter the string: \n");
        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();

        int[] arr = new int[26];

        for(int i = 0 ; i < string1.length(); i++){
            arr[string1.charAt(i) - 'a']++;
        }

        for(int j = 0 ; j < arr.length; j++){
            if(arr[j]>0){
                System.out.print((char)(j+'a') +""+ arr[j]);
            }
        }

        
    }
    
}
