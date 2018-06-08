import java.util.Scanner;

public class Sum {
	public static int addno()
	{
		int a,b;
		Scanner s1=new Scanner(System.in);
		a=s1.nextInt();
		b=s1.nextInt();
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int z=addno();
		System.out.println(z);
	}

}
