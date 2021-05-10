import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex8_AplusB_8 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());

		StringTokenizer st;
		int num1, num2;
		for (int i = 0; i < T; i++) {
			
			st = new StringTokenizer(br.readLine());
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			bw.write("Case #" + (i + 1) + ": " + num1 + " + " + num2 + " = " + (num1 + num2) + "\n");
			
		}
		
		bw.close();

	}

}
