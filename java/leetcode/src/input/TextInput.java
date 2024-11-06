package input;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public interface TextInput {
//	public static void main(String[] args) {
//		String[] array = oneLineArray(inputString("../../java_outside_source/input.txt"), 0);
//		for(int s : StringChangeInt(array)) {
//			System.out.println(s);
//		}
//	}
	
	public static List<String> inputString(String url) {
		Path source = Paths.get(url).toAbsolutePath();
		List<String> text = null;
		try {
			text = Files.readAllLines(source, Charset.defaultCharset());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return text;
	}
	
	public static String[] oneLineArray(List<String> text, int index) {
		return text.get(index).equals("") ? new String[0] : text.get(index).split(",");
	}
	
	public static String[] oneLineArray(String text) {
		return text.equals("") ? new String[0] : text.split(",");
	}
	
	public static int[] StringChangeInt(String[] input) {
		return input.length == 0 || input[0].equals("") ? new int[0] : Arrays.stream(input).mapToInt(e -> Integer.parseInt(e)).toArray();
		
	}
}
