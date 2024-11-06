package TopInterview150.Array_String.RotateArray;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/RotateArray/input.txt");
		for(int i = 0; i < examples.size(); i += 2) {
			int[] nums = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i));
			int k = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i + 1))[0];
			new Solution().rotate(nums, k);
			for(int j = 0; j < nums.length; j++) {
				System.out.print(nums[j] + " ");
			}
			System.out.println();
		}
	}

}
