import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex6_AminusB {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		String[] strs = num.split(" ");
		
		System.out.println(Integer.parseInt(strs[0]) - Integer.parseInt(strs[1]));
		
	}
	
}
