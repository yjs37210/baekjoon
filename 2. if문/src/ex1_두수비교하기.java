import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1_두수비교하기 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strs = br.readLine().split(" ");
		
		int num1 = Integer.parseInt(strs[0]);
		int num2 = Integer.parseInt(strs[1]);
		
		System.out.println(compare(num1, num2));
		
	}
	
	public static String compare(int num1, int num2) {
		
		int num = num1 - num2;
		if(num > 0) {
			return ">";
		}else if(num == 0) {
			return "==";
		}else {
			return "<";
		}
		
	}
	
}
