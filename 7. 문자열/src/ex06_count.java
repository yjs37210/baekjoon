import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex06_count {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine().trim();

		if (str.equals("")) {
			bw.write(String.valueOf(0));
		} else {
			String[] strs = str.split(" ");
			bw.write(String.valueOf(strs.length));
		}

		bw.close();

	}

}