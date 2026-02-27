public class fibbonacci_series {
    public static void main(String[] args) {
        int i = 10;
        int a = 0;
        int b = 1;
        for (int d = 0; d <=  i ; d++){
            System.out.print(a+" ");
            int c = a + b;
            a=b;
            b=c;
        }
    }
}
