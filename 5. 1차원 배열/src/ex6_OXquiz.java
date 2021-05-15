import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex6_OXquiz {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());
		
		int score, len;
		for(int i = 0; i < num; i++) {
			
			score = 0;
			String results[] = br.readLine().split("X");
			for(int j = 0; j < results.length; j++) {
				
				len = results[j].length();
				score += len * (len + 1) / 2;
				
			}
			bw.write(score + "\n");
			
		}
		
		bw.close();

	}

}
