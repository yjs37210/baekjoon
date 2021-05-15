import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex3_hansu {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		bw.write(String.valueOf(print_hansu(N)));
		bw.close();

	}

	private static int print_hansu(int N) {

		int cnt = 0;
		for(int i = 1; i <= N; i++) {
			if(hansu(i)) {
				cnt++;
			}
		}
		
		return cnt;
	}

	private static boolean hansu(int i) {

		if(i < 100) {
			return true;
		}else if(i == 1000) {
			return false;
		}
		
		int num1 = (i / 100);
		int num2 = (i / 10) % 10;
		int num3 = i % 10;
		
		if(num2 - num1 == num3 - num2) {
			return true;
		}
		
		return false;
	}

}
