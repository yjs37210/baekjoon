import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex6_apartment {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int T = Integer.parseInt(br.readLine());
		
		String[] strs;
		for(int i = 0; i < T; i++) {
			
			strs = br.readLine().split(" ");
			int H = Integer.parseInt(strs[0]);
			int N = Integer.parseInt(strs[2]);
			
			bw.write(room(H, N) + "\n");
			
		}

		bw.close();
	}

	private static String room(int H, int N) {

		int Y = 0;
		int X = 0;
		
		if(N % H == 0) {
			Y = H;
			X = N / H;
		}else {
			Y = N % H;
			X = N / H + 1;
		}
		
		if(X < 10) {
			return Y + "0" + X;
		}
		
		return Y + "" + X;
	}

}