package TopInterview150.Array_String.InsertDeleteGetRandomO1;

import java.util.ArrayList;
import java.util.List;

import input.TextInput;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> examples = TextInput.inputString("src/TopInterview150/Array_String/InsertDeleteGetRandomO1/input.txt");
		for(int i = 0; i < examples.size(); i += 2) {
			String[] command = TextInput.oneLineArray(examples, i);
			String[] contain = TextInput.oneLineArray(examples, i + 1);
			List<String> result = new ArrayList<>();
			RandomizedSet r = new RandomizedSet();
			for(int j = 0; j < command.length; j++) {
				switch(command[j]) {
					case "RandomizedSet":
						r = new RandomizedSet();
						result.add(null);
						System.out.println(result.toString() + " RandomizedSet");
						break;
					case "insert":
						result.add(String.valueOf(r.insert(Integer.valueOf(contain[j]))));
						System.out.println(result.toString() + " insert");
						break;
					case "remove":
						result.add(String.valueOf(r.remove(Integer.valueOf(contain[j]))));
						System.out.println(result.toString() + " remove");
						break;
					case "getRandom":
						result.add(String.valueOf(r.getRandom()));
						System.out.println(result.toString() + " getRandom");
						break;
				}
			}
			System.out.println(result.toString());
		}
	}

}
