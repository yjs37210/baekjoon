import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex08_dial {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		bw.write(String.valueOf(time(str)));
		bw.close();

	}

	private static int time(String str) {

		int result = 0;
		
		char c;
		for(int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			result += ((c + 1) / 3 - 22) + 3;
			if(c == 'S' || c == 'V' || c == 'Y' || c == 'Z') {
				result--;
			}
		}
		
		return result;
	}

}
