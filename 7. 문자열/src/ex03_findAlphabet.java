import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex03_findAlphabet {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String S = br.readLine();

		bw.write(print(findAbc(S)));
		bw.close();

	}

	private static String print(int[] findAbc) {
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < findAbc.length; i++) {
			sb.append(findAbc[i] + " ");
		}
		
		return sb.toString();
	}

	private static int[] findAbc(String S) {
		
		int[] arr = new int[26];
		for(int i = 0; i < 26; i ++) {
			arr[i] = -1;
		}
		
		int cnt = 0;
		char[] strs = S.toCharArray();
		for(char c : strs) {
			if(arr[c - 97] == -1) {
				arr[c - 97] = cnt;
			}
			cnt++;
		}
		
		return arr;
	}

}
