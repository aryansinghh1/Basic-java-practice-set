import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        //count number of string
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter long string: ");
        String str = sc.nextLine();
        System.out.println("enter string to count: ");
        String str1 = sc.nextLine();

        String[] astr = str.split(" ");

        int count = 0;

        for (int i = 0; i < astr.length; i++) {

            if (str1.equals(astr[i])) {
                count++;
            }
        }

        System.out.println(count);
    }

}