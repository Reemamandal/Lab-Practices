package day8_5th_June;
import java.util.*;
public class Simple {
	int a;
	void get()
	{
		System.out.println("Enter the value");
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
	}
	void inc()
	{
		a=a+5;
	}
	void dis()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {

      Simple s = new Simple();
      s.get();
      s.inc();
      s.dis();
	}
}
