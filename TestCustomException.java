package day17_20th_june;

public class TestCustomException {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Bank b =new Bank("12345",1000);
     try
     {
     b.withdraw(1500);
     }
     catch(InsufficientBalanceException e)
     {
    	 System.out.println(e.getMessage());
     }
		/*MobileRecharge mb=new MobileRecharge(50);
		try {
		mb.call();
		}
		catch (InsufficientBalanceException e) {
			System.out.println(e.getLocalizedMessage());
			// TODO: handle exception
		}*/
	}



}
