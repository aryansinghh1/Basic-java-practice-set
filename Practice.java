import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        System.out.println("Enter Your string: ");
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = 0;
        

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                count++;
            }
                
        }

        System.out.println("count of Uppercase: " + count);
        
    }

}