
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer outerObj = new Outer();
		Outer.Inner innerObj= outerObj.new Inner();
		innerObj.display();

	}
}
class Outer {
	class Inner {
		void display() {
			System.out.println("Inner class");
		}
	}
}
