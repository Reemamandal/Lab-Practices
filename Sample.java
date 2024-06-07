package day8_5th_June;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a[]= {"f","g","h"};
		Two ob=new Two();
		Two.main(a);

	}
}

class Two
{
 // treated as a user defined fun
	public static void main(String[] args) {
		for(String x:args) {
			System.out.println(x);
		}	
	}
}
