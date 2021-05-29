import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;

public class ex8_AplusB_big {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] strs = br.readLine().split(" ");
		BigInteger big1 = new BigInteger(strs[0]);
		BigInteger big2 = new BigInteger(strs[1]);

		bw.write(String.valueOf(big1.add(big2)));
		bw.close();
	}

}