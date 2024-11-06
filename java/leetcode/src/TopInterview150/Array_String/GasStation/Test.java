package TopInterview150.Array_String.GasStation;

import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/GasStation/input.txt");
		for(int i = 0; i < examples.size(); i += 2) {
			int[] gas = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i));
			int[] cost = TextInput.StringChangeInt(TextInput.oneLineArray(examples, i + 1));
			int result = new Solution().canCompleteCircuit(gas, cost);
			System.out.println(result);
		}
	}

}
