package assignmentt3;

public class Greatest {
	public static int greatestofno()
	{
		int a=10,b=20,c=30;
		if(a>b&&a>c)
			return a;
		else if(a<b&&b>c)
			return b;
		else 
			return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int z=greatestofno();
     System.out.println(z);
	}

}
