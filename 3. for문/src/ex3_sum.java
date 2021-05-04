import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3_sum {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		printSum(n);
		
	}

	private static void printSum(int n) {

		System.out.println((n * (n+1)) / 2);
		
	}

}
