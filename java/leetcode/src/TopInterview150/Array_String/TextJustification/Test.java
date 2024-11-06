package TopInterview150.Array_String.TextJustification;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/TextJustification/input.txt");
		for(int i = 0; i < examples.size(); i += 2) {
			String[] words = TextInput.oneLineArray(examples, i);
			int maxWidth = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i + 1))[0];
			List<String> result = new Solution().fullJustify(words, maxWidth);
			result.stream().forEach(System.out::println);
			System.out.println();
		}
	}

}
