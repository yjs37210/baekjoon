import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2_시험성적 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());
		System.out.println(grade(score));
	}

	private static char grade(int score) {

		switch(score / 10){
			case 10:
				return 'A';
			case 9:
				return 'A';
			case 8:
				return 'B';
			case 7:
				return 'C';
			case 6:
				return 'D';
			default:
				return 'F';
		}
		
	}

}
