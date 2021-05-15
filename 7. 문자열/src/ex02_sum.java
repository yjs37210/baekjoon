import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex02_sum {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		String[] num_strs = br.readLine().split("");
		
		int sum = 0;
		for(int i = 0; i < N; i++) {
			sum += Integer.parseInt(num_strs[i]);
		}
		
		bw.write(String.valueOf(sum));
		bw.close();

	}

}
