import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex4_사분면고르기 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		System.out.println(quadrant(x, y));
		
	}

	private static int quadrant(int x, int y) {

		if(x > 0) {
			return y > 0 ? 1 : 4;
		}else {
			return y > 0 ? 2 : 3;
		}
		
	}

}
