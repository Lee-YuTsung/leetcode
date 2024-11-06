package TopInterview150.Array_String.Candy;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/Candy/input.txt");
		for(int i = 0; i < examples.size(); i++) {
			int[] candy = TextInput.StringChangeInt(TextInput.oneLineArray(examples.get(i)));
			int result = new Solution().candy(candy);
			System.out.println(result);
		}
	}

}
