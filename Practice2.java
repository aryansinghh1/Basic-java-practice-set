import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String name = sc.nextLine().toLowerCase();

        String ch = "";

        for(int i = 0 ; i<name.length(); i++){

            if(ch.indexOf(name.charAt(i)) == -1){
                ch += name.charAt(i);
            }

        }
        System.out.println("output: "+ ch);
    }
}
