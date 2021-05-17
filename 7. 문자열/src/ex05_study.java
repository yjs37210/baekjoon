import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex05_study {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String word = br.readLine();

		bw.write(most(word));
		bw.close();

	}

	private static char most(String word) {

		int[] cnt = new int[26];
		for(int i = 0; i < word.length(); i++) {
			if (word.charAt(i) <= 90) {
				cnt[word.charAt(i) - 65]++;
			} else {
				cnt[word.charAt(i) - 97]++;
			}
		}

		int cnt_max = max(cnt);
		return find(cnt_max, cnt);
	}

	private static int max(int[] cnt) {

		int maximum = 0;
		for (int i = 0; i < cnt.length; i++) {
			if (maximum < cnt[i]) {
				maximum = cnt[i];
			}
		}

		return maximum;

	}

	private static char find(int cnt_max, int[] cnt) {

		int max_i = 0;
		int check = 0;
		for (int i = 0; i < cnt.length; i++) {
			
			if (cnt[i] == cnt_max) {
				max_i = i;
				check++;
			}
			
			if (check > 1) {
				return '?';
			}
			
		}

		return (char) (max_i + 65);

	}

}
