import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ex7_moreThanAvg {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int C = Integer.parseInt(br.readLine());
		
		int scores[];
		double N;
		String str_scores[];
		for(int i = 0; i < C; i++) {
			
			String N_score[] = br.readLine().split(" ");
			N = Double.parseDouble(N_score[0]);
			
			str_scores = Arrays.copyOfRange(N_score, 1, N_score.length);
			scores = Arrays.stream(str_scores).mapToInt(Integer::parseInt).toArray();
			
			bw.write(ratio(N, scores) + "%\n");
			
		}
		
		bw.close();
	}

	private static String ratio(double N, int[] scores) {

		double avg = Arrays.stream(scores).average().getAsDouble();
		
		int cnt = 0;
		for(int j = 0; j < N; j++) {
			if(scores[j] > avg) {
				cnt++;
			}
		}
		
		return String.format("%.3f", (cnt / N) * 100);
		
	}
	
}
	
