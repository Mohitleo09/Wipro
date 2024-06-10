import java.util.*;
public class proornot 
{
    public static void main(String[] args) 
  {
        if (args.length == 0) 
        {
            System.out.println("no values");
        } else {
            System.out.println("values provided");
            for (String args1 : args) 
            {
                System.out.println(args1 + ",");
            }
        }
    }
}
