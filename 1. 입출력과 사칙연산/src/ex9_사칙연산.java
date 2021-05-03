import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex9_사칙연산 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		String[] strs = num.split(" ");
		
		int num1 = Integer.parseInt(strs[0]);
		int num2 = Integer.parseInt(strs[1]);
		
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		
		
	}
	
}
