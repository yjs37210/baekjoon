import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex04_repeat {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {

			String[] num_S = br.readLine().split(" ");
			bw.write(repeat(num_S) + "\n");

		}

		bw.close();

	}

	private static String repeat(String[] num_S) {

		int R = Integer.parseInt(num_S[0]);
		char[] S_arr = num_S[1].toCharArray();
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < S_arr.length; i++) {
			for(int j = 0; j < R; j++) {
				sb.append(S_arr[i]);
			}
		}

		return sb.toString();
	}

}
