package TopInterview150.Array_String.IntegertoRoman;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/IntegertoRoman/input.txt");
		for(int i = 0; i < examples.size(); i++) {
			String result = new Solution().intToRoman(TextInput.StringChangeInt(TextInput.oneLineArray(examples, i))[0]);
			System.out.println(result);
		}
	}

}
