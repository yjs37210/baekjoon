import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex4_snail {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] strs = br.readLine().split(" ");

		int A = Integer.parseInt(strs[0]);
		int B = Integer.parseInt(strs[1]);
		int V = Integer.parseInt(strs[2]);

		bw.write(String.valueOf(goal(A, B, V)));
		bw.close();
	}

	private static int goal(int A, int B, int V) {

		if((V - A) % (A - B) == 0) {
			return (V - A) / (A - B) + 1;
		}else {
			return (V - A) / (A - B) + 2;
		}
		
	}

}
