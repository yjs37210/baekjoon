import java.util.Arrays;

public class ex1_sum {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		System.out.println(sum(a));
	}
	
	public static long sum(int[] a) {
		
		long result = 0;
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		
		return result;
	}

}
