package a;

import java.util.Scanner;

public class Palindrome {
	public static void checkpalindrome()
	{
		int r,no=0,n;
		Scanner s1=new Scanner(System.in);
		n=s1.nextInt();
		int a=n;
	    while( n!=0 )
	    {
	        r = n%10;
	        no = no*10 + r;
	        n /= 10;
	    }

	   
	    if (a== no)
	       System.out.println("No is palindrome:"+ a);
	    else
	    	System.out.println("No is not palindrome:"+ a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         checkpalindrome();
	}

}
