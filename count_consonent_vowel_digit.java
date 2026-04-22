import java.util.Scanner;

public class count_consonent_vowel_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s.toLowerCase();

        int c = 0;
        int v = 0;
        int d = 0;

        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i))){
                if(s.charAt(i) == 'a' || s.charAt(i) =='o' ||s.charAt(i) == 'u' || s.charAt(i) == 'i' || s.charAt(i) == 'e'){
                    v++;
                }
                else{
                    c++;
                }

            }
            else if(Character.isDigit(s.charAt(i))){
                d++;
            }
            
            

        }

        System.out.println("Total consonent" + c);
        System.out.println("Total vowel" + v);
        System.out.println("Total digit" + d);
    }
}
