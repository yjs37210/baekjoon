import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex9_FlyMeToTheAlphaCentauri {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		String[] strs;
		int x, y;
		for(int i = 0; i < T; i++) {
			
			strs = br.readLine().split(" ");
			x = Integer.parseInt(strs[0]);
			y = Integer.parseInt(strs[1]);
			
			bw.write(min(x, y) + "\n");
		}
		
		bw.close();
	}

	private static int min(int x, int y) {

		int distance = y - x;
		int go = 1;
		int oper = 0;
		while(distance > 0) {
			
			distance -= go * 2;
			oper += 2;
			
			if(distance <= -go) {
				oper -= 1;
			}
			
			go++;
			
		}
		
		return oper;
	}

}