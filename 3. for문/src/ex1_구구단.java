import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1_±¸±¸´Ü {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		ggd(num);
		
	}

	private static void ggd(int num) {

		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d * %d = %d\n", num, i, num*i);
		}
		
	}

}
