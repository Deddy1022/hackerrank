//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        staircase(6);
    }

    private static void staircase(int n) {
        String pattern = "";
        for(int i  = 0; i < n; i++) {
            pattern += "#";
            System.out.println(padPattern(pattern, n));
        }
    }

    private static String padPattern(String pattern, int nbr) {
        String str = pattern;
        while(str.length() < nbr) {
            str = " " + str;
        }
        return str;
    }
}