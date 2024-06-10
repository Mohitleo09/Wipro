import java.util.*;

public class color {

    public static void main(String[] args) {
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the color:B Y O W G R");
        ch = sc.next().charAt(0);
        switch (ch) {
            case 'B': {
                System.out.println("Blue");
                break;
            }
            case 'Y': {
                System.out.println("yellow");
                break;
            }
            case 'O': {
                System.out.println("orange");
                break;
            }
            case 'W': {
                System.out.println("white");
                break;
            }
            case 'G': {
                System.out.println("green");
                break;
            }
            case 'R': {
                System.out.println("red");
                break;
            }
            default: {
                System.out.println("not found");
            }
        }
    }
}
