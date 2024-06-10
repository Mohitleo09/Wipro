import java.util.*;
public class posnegzero {
	public static void main(String[]args)
	{
    int num;
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    if(num<0)
	{
		System.out.println("negative");
	}
    else if(num>0)
	{
		System.out.println("positive");
	}
    else
	{
		System.out.println("zero");
	}
 }
}
