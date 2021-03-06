import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex5_ACMhotel {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		int k, n;
		for (int i = 0; i < T; i++) {

			k = Integer.parseInt(br.readLine());
			n = Integer.parseInt(br.readLine());
			bw.write(liveIn(k, n) + "\n");

		}

		bw.close();
	}

	private static int liveIn(int k, int n) {

		if (n == 1) {
			return 1;
		}else if(k == 0) {
			return n;
		}else {
			
			int result = 0;
			for(int i = 1; i <= n; i++) {
				result += liveIn(k-1, i);
			}
			
			return result;
		}
		
	}

}