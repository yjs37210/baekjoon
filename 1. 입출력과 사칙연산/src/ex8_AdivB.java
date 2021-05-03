import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex8_AdivB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		String[] strs = num.split(" ");
		
		System.out.println(Double.parseDouble(strs[0]) / Double.parseDouble(strs[1]));
		
	}
	
}
