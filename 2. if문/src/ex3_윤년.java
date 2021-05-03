import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex3_À±³â {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int year = Integer.parseInt(br.readLine());
		System.out.println(LeapYear(year));
		
	}

	private static int LeapYear(int year) {

		if(year % 4 == 0 && year % 100 != 0) {
			return 1;
		}else if(year % 400 == 0) {
			return 1;
		}else {
			return 0;
		}
		
	}

}
