import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex11_compare {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] strs = br.readLine().split(" ");
		int N = Integer.parseInt(strs[0]);
		int X = Integer.parseInt(strs[1]);
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int num;
		for(int i = 0; i < N; i++) {
			
			num = Integer.parseInt(st.nextToken());
			if(num < X) {
				
				bw.write(num + " ");
			
			}
			
		}
		
		bw.close();
		
	}

}
