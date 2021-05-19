import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex2_honeycomb {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());

		bw.write(String.valueOf(room(N)));
		bw.close();
	}

	private static int room(int N) {

		if (N == 1) {
			return 1;
		}

		int i = 0;
		while (!(3 * i * i + 3 * i + 2 <= N && N <= 3 * i * i + 9 * i + 7)) {
			i++;
		}

		return i + 2;
	}

}
