package TopInterview150.Array_String.LengthofLastWord;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/LengthofLastWord/input.txt");
		examples.stream().mapToInt(e -> new Solution().lengthOfLastWord(e)).forEach(System.out::println);
	}

}
