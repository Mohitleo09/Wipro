import java.util.*;
public class findchar {
    public static void main(String[] args) {
        char val;
        Scanner sc = new Scanner(System.in);
        val = sc.next().charAt(0);
        if ((val >= 'A' && val <= 'Z') || (val >= 'a' && val <= 'z')) {
            System.out.println("alphabet");
        } else if (val >= 0 && val <= 9) {
            System.out.println("digit");
        } else {
            System.out.println("special");
        }
    }
}
