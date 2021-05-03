import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex5_알람시계 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] times = br.readLine().split(" ");
		
		int hour = Integer.parseInt(times[0]);
		int min = Integer.parseInt(times[1]);
		
		System.out.println(alarm(hour, min));
		
	}

	private static String alarm(int hour, int min) {

		int alarm_min = min >= 45 ? min - 45 : min + 15;
		int alarm_hour = min >= 45 ? hour : hour - 1;
		if(alarm_hour < 0) {
			return "23 " + alarm_min;
		}
		
		return alarm_hour + " " + alarm_min;
	}

}
