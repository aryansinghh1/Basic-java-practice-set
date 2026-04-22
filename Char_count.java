import java.util.*;
public class Char_count {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String s = sc.nextLine();
        int[] arr = new int[26];

        for(int i = 0 ; i < s.length();i++){
            arr[s.charAt(i) - 'a']++;
            
        }
        
        for(int i = 0 ; i < 26;i++){
           if(arr[i]>0){
            System.out.print((char)(i + 'a') + "" + arr[i]);
           }

        }

    }
}
