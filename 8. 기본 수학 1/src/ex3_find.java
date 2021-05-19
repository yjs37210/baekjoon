import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex3_find {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int X = Integer.parseInt(br.readLine());

		bw.write(ja(X) + "/" + mo(X));
		bw.close();
	}

	private static int ja(int X) {

		if (X <= 2) {
			return 1;
		}else if(X == 3) {
			return 2;
		}
		
		int i = 1;
		while (!(func1(i) <= X && X < func1(i + 1))) {
			i++;
		}
		
		if (X - func1(i) <= i * 2) {
			return i * 2 + 1 - (X - func1(i));
		} else {
			return (X - func1(i)) - 2 * i;
		}
		
	}

	private static int mo(int X) {

		if (X == 1) {
			return 1;
		}
		
		int j = 0;
		while (!(func2(j) <= X && X < func2(j + 1))) {
			j++;
		}
		
		if (X - func2(j) <= j * 2 + 1) {
			return (j + 1) * 2 - (X - func2(j));
		}else {
			return (X - func2(j)) - ((j + 1) * 2 - 1);
		}
		
	}

	private static int func1(int i) {
		return 2 * i * i + i + 1;
	}

	private static int func2(int i) {
		return 2 * i * i + 3 * i + 2;
	}

}
