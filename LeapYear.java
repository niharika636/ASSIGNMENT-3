import java.util.Scanner;

public class LeapYear {
	public static void findleapyear()
	{
		int year=2018;
		if(year%4==0)
			System.out.println("Leap year");
		else
			System.out.println(" Not a Leap year");
	}
	public static void main(String[] args) {
		findleapyear();
	}
}
