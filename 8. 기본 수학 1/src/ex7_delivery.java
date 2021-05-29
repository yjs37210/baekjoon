import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex7_delivery {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(min(N)));
		bw.close();
	}

	private static int min(int N) {
		
		for(int i = 0; i < N / 5; i++) {
			if(((N % 5) + 5 * i) % 3 == 0) {
				return N / 5 - i + ((N % 5) + 5 * i) / 3;
			}
		}
		
		if(N % 3 == 0) {
			return N / 3;
		}
		
		return -1;
	}

}