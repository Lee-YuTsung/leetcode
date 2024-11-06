package TopInterview150.Array_String.ReverseWordsinaString;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/ReverseWordsinaString/input.txt");
		examples.stream().map(e -> new Solution().reverseWords(e)).forEach(System.out::println);
	}

}
