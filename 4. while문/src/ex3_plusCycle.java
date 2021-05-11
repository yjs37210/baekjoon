import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex3_plusCycle {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String N = br.readLine();
		
		bw.write(String.valueOf(CycleLength(N)));
		bw.close();
		
	}

	private static int CycleLength(String N) {

		String num = N;
		
		int cnt = 0;
		do {

			if(N.length() == 1) {
				N = 0 + N;
			}
			
			N = newN(N);
			cnt++;
			
		} while(!N.equals(num));
		
		return cnt;
	}

	private static String newN(String N) {
		
			String[] strs = N.split("");
			int num1 = Integer.parseInt(strs[0]);
			int num2 = Integer.parseInt(strs[1]);
			String sum = String.valueOf(num1 + num2);
			
			String left_N = N.substring(1);
			String right_N = sum.substring(sum.length()-1);
			
			if(left_N.equals("0")) {
				return right_N;
			}
			
			return left_N + right_N;
			
	}
}
