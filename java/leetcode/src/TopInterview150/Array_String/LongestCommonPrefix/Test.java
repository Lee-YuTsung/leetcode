package TopInterview150.Array_String.LongestCommonPrefix;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/LongestCommonPrefix/input.txt");
		for(int i = 0; i < examples.size(); i++) {
			String[] strs = TextInput.oneLineArray(examples, i);
			String result = new Solution().longestCommonPrefix(strs);
			System.out.println(result);
		}
	}

}
