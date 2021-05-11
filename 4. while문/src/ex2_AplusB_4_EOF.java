import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class ex2_AplusB_4_EOF {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st;
		int num1, num2;
		String str;
		while(true) {
			
			str = br.readLine();
			if(str == null) {
				break;
			}
			
			st = new StringTokenizer(str);
			num1 = Integer.parseInt(st.nextToken());
			num2 = Integer.parseInt(st.nextToken());
			bw.write((num1 + num2) + "\n");
			bw.flush();

		}
		
	}

}
