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
        String ch = "";

        int count = 0;

        for (int i = 0; i < astr.length; i++) {
            for(int j = 0 ; j < astr[i].length(); j++){
                if(Character.isLetter(astr[i].charAt(j))){
                    ch = ch + astr[i].charAt(j);
                }
            }
            if(ch.equals(str1)){
                count++;
            }
            ch = "";
        }

        System.out.println(count);
    }

}