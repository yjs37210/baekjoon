import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex09_croatia {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();

		bw.write(String.valueOf(croCount(str)));
		bw.close();

	}

	private static int croCount(String str) {

		if (str.contains("dz=")) {
			str = str.replace("dz=", "a");
		}
		
		if (str.contains("=")) {
			str = str.replace("=", "");
		}
		
		if (str.contains("-")) {
			str = str.replace("-", "");
		}
		
		if (str.contains("lj")) {
			str = str.replace("lj", "a");
		}
		
		if (str.contains("nj")) {
			str = str.replace("nj", "a");
		}

		return str.length();
	}

}
