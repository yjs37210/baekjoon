import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10_³ª¸ÓÁö {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		String[] strs = num.split(" ");
		
		int num1 = Integer.parseInt(strs[0]);
		int num2 = Integer.parseInt(strs[1]);
		int num3 = Integer.parseInt(strs[2]);
		
		System.out.println((num1 + num2) % num3);
		System.out.println((num1 % num3 + num2 % num3) % num3);
		System.out.println((num1 * num2) % num3);
		System.out.println(((num1 % num3) * (num2 % num3)) % num3);
		
	}
	
}
