import java.util.*;
class Letters {
    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println(System.in);
        ch = sc.next().charAt(0);
        if (Character.isLowerCase(ch)) {
            System.out.print(Character.toUpperCase(ch));
        }
        if (Character.isUpperCase(ch)) {
            System.out.print(Character.toLowerCase(ch));
        }
    }
}
