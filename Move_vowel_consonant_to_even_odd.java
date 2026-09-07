public class Move_vowel_consonant_to_even_odd {
    public static void main(String[] args) {

        String name = "aryana";
        String con = "";
        String vol = "";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vol += ch;
            } else {
                con += ch;
            }
        }

        int v = 0;
        int c = 0;

        for (int i = 0; i < name.length(); i++) {
            if (i % 2 == 0) {
                System.out.println(vol.charAt(v++));
            } else {
                System.out.println(con.charAt(c++));
            }
        }
    }
}