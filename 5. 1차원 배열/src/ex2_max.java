import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class ex2_max {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int[] arr = new int[9];
		for(int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = Arrays.stream(arr).max().getAsInt();
		bw.write(max + "\n");
		
		for(int i = 0; i < 9; i++) {
			if(max == arr[i]) {
				bw.write(String.valueOf(i + 1));
				break;
			}
		}
		
		bw.close();

	}

}
