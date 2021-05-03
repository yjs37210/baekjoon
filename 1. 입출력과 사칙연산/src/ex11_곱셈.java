import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11_°ö¼À {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();
		String[] strs = str.split("");
		
		int num1 = Integer.parseInt(strs[0]);
		int num2 = Integer.parseInt(strs[1]);
		int num3 = Integer.parseInt(strs[2]);
		int num4 = Integer.parseInt(str);
		
		System.out.println(num * num3);
		System.out.println(num * num2);
		System.out.println(num * num1);
		System.out.println(num * num4);
		
	}
	
}
