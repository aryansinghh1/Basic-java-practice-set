import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        //print first letter of each word in a string

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter long string: ");
        String str = sc.nextLine();
    

        String[] arr = str.split(" ");
        String ch = "";

        for(int i = 0 ;i<arr.length; i++){
            if(Character.isLetter(arr[i].charAt(0))){
                ch = ch + arr[i].charAt(0);
            }
        }
        
            
        

        System.out.println(ch);
    }

}