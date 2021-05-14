import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex3_count {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int multi = 1;
		for (int i = 0; i < 3; i++) {
			multi *= Integer.parseInt(br.readLine());
		}

		String[] arr = String.valueOf(multi).split("");
		for (int i = 0; i < 10; i++) {

			String i_str = String.valueOf(i);
			int cnt = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[j].equals(i_str)) {
					cnt++;
				}
			}
			bw.write(cnt + "\n");

		}

		bw.close();

	}

}
