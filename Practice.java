import java.util.Scanner;

public class Practice {

    public static void main(String[] args) {

        // fibonacci
        System.out.println("Enter your number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {

            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;

            if(a>num){
                break;
            }


        }

    }

}