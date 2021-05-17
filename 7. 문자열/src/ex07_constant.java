import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex07_constant {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		
		int num1 = reverse(str.substring(0, 3));
		int num2 = reverse(str.substring(4, 7));
		
		bw.write(String.valueOf(answer(num1, num2)));
		bw.close();

	}

	private static int answer(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}

	private static int reverse(String s) {
		String s_num = new StringBuffer(s).reverse().toString();
		return Integer.parseInt(s_num);
	}

}
