package day8_5th_June;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outer.Nested nestedObj = new Outer.Nested();
		nestedObj.display();

	}
}

class Outer{
	static class Nested{
		void display() {
			System.out.println("Static Nested class");
		}
	}
}
