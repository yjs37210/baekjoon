import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class ex2_selfNumber {

	public static void main(String[] args) throws IOException {

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write(selfNum());
		bw.close();

	}

	private static String selfNum() {

		StringBuilder sb = new StringBuilder();
		
		int[] arr = new int[10000];
		for(int i = 1; i <= 10000; i++) {
			arr[d(i)-1] = 1;
		}
		
		for(int i = 0; i < 10000; i++) {
			if(arr[i] == 0) {
				sb.append((i + 1) + "\n");
			}
		}
		
		return sb.toString();
	}

	private static int d(int i) {

		int result = i + i % 10;

		if(i >= 10) {
			result += (i / 10) % 10;
		}
		
		if(i >= 100) {
			result += (i / 100) % 10;
		}
		
		if(i >= 1000) {
			result += (i / 1000) % 10;
		}
		
		if(result > 10000) {
			return 2;
		}

		return result;
	}
	
}
