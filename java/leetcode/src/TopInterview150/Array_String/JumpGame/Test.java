package TopInterview150.Array_String.JumpGame;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/JumpGame/input.txt");
		for(int i = 0; i < examples.size(); i++) {
			int[] nums = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i));
			boolean result = new Solution().canJump(nums);
			System.out.println(result);
		}
	}

}
