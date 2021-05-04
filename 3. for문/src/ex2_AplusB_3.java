import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2_AplusB_3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int case_num = Integer.parseInt(br.readLine());
		
		String[] strs;
		int[][] nums = new int[case_num][2]; 
 		for(int i = 0; i < case_num; i++) {
 			strs = br.readLine().split(" ");
 			nums[i][0] = Integer.parseInt(strs[0]);
 			nums[i][1] = Integer.parseInt(strs[1]);
		}
 		
 		sum(nums);
 		
	}

	private static void sum(int[][] nums) {

		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i][0] + nums[i][1]);
		}
		
	}

}
