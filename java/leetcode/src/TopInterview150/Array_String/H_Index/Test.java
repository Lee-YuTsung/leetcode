package TopInterview150.Array_String.H_Index;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/H_Index/input.txt");
		for(int i = 0; i < examples.size(); i++) {
			int[] citations = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i));
			int result = new Solution().hIndex(citations);
			System.out.println(result);
		}
	}

}
