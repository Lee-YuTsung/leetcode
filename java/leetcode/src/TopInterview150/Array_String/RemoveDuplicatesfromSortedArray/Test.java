package TopInterview150.Array_String.RemoveDuplicatesfromSortedArray;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/RemoveDuplicatesfromSortedArray/input.txt");
		for(int i = 0; i < examples.size(); i++) {
			int[] nums = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i));
			int result = new Solution().removeDuplicates(nums);
			for(int j = 0; j < result; j++) {
				System.out.print(nums[j] + ",");
			}
			System.out.println(" " + result);
		}
	}

}
