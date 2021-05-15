import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ex5_avg {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		double N = Double.parseDouble(br.readLine());
		String scores_str[] = br.readLine().split(" ");
		int scores[] = Arrays.stream(scores_str).mapToInt(Integer::parseInt).toArray();
		
		int M = Arrays.stream(scores).max().getAsInt();
		int sum = Arrays.stream(scores).sum();
		
		bw.write(String.valueOf((sum / (M * N)) * 100));
		bw.close();

	}

}
