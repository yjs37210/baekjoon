import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ex1_breakEvenPoint {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String[] strs = br.readLine().split(" ");
		int[] nums = toInt(strs);

		bw.write(String.valueOf(SalesRate(nums[0], nums[1], nums[2])));
		bw.close();

	}

	private static int[] toInt(String[] strs) {

		int[] nums = new int[strs.length];
		for (int i = 0; i < strs.length; i++) {
			nums[i] = Integer.parseInt(strs[i]);
		}

		return nums;
	}

	private static int SalesRate(int fixedCost, int varCost, int revenue) {

		if(varCost > revenue) {
			return -1;
		}else if(varCost == revenue) {
			if(fixedCost == 0) {
				return 1;
			}
			return -1;
		}
		
		return fixedCost / (revenue - varCost) + 1;

	}

}
