package TopInterview150.Array_String.RomantoInteger;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/RomantoInteger/input.txt");
		for(int i = 0; i < examples.size(); i++) {
			int result = new Solution().romanToInt(examples.get(i));
			System.out.println(result);
		}
	}

}
