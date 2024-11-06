package TopInterview150.Array_String.ZigzagConversion;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/ZigzagConversion/input.txt");
		for(int i = 0; i < examples.size(); i += 2) {
			String s = examples.get(i);
			int numRows = Integer.valueOf(examples.get(i + 1));
			String result = new Solution().convert(s, numRows);
			System.out.println(result);
		}
	}

}
