package constructs;

public class ForEachEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {1,2,3};
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println("\n-----");
		for(int i:a) {
			System.out.println(i+" ");
		}
	}

}
