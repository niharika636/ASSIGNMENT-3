import java.util.Scanner;

public class PrimeNo {
	public static void check_prime()
	{
		int n;
		Scanner s1=new Scanner(System.in);
		n=s1.nextInt();
		int i,c=0;
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==0)
			System.out.println("PRIME NO:"+n);
		else
			System.out.println(" NOT A PRIME NO:"+n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  check_prime();
	}

}
