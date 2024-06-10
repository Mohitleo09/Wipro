import java.util.*;
class alphaorder {
    public static void main(String[] args) {
        char c1;
        char c2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the c1 and c2 values:");
        c1=sc.next().charAt(0);
        c2=sc.next().charAt(0);
        if (c1 < c2) {
            System.out.println(c1 + " " + c2);
        } else {
            System.out.println(c2 + " " + c1);
        }
    }
}
