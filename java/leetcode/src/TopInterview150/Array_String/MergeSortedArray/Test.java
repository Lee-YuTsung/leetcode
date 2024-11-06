package TopInterview150.Array_String.MergeSortedArray;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/MergeSortedArray/input.txt");
		for(int i = 0; i < examples.size(); i += 4) {
			int[] nums1 = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i));
			int m = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i + 1))[0];
			int[] nums2 = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i + 2));
			int n = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i + 3))[0];
			new Solution().merge(nums1, m, nums2, n);
			for(int o : nums1) {
				System.out.print(o + ",");
			}
			System.out.println();
		}
	}

}
