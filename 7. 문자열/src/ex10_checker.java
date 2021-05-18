import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedHashSet;
import java.util.Set;

public class ex10_checker {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		int result = 0;
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			if(groupChecker(str)) {
				result++;
			}
		}

		bw.write(String.valueOf(result));
		bw.close();

	}

	private static boolean groupChecker(String str) {

		String reStr = str.replaceAll("(.)\\1+", "$1");
		
		char[] chs = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		for(char c : chs) {
			set.add(c);
		}
		
		if(reStr.length() == set.size()) {
			return true;
		}
		
		return false;
	}

}
