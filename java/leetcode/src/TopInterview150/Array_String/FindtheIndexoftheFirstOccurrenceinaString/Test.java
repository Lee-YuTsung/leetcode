package TopInterview150.Array_String.FindtheIndexoftheFirstOccurrenceinaString;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/FindtheIndexoftheFirstOccurrenceinaString/input.txt");
		for(int i = 0; i < examples.size(); i += 2) {
			String haystack = examples.get(i);
			String needle = examples.get(i + 1);
			int result = new Solution().strStr(haystack, needle);
			System.out.println(result);
		}
	}

}
