package day17_20th_june;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException()
	{
		System.out.println("Low Balance");
	}
	
    public InsufficientBalanceException(String msg) {
    	System.out.println(msg);
    	
    }


}
