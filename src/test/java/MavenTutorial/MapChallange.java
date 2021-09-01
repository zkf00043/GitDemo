package MavenTutorial;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

public class MapChallange {

	public static void main(String[] args) throws Exception {

		System.out.println(CountWords("I"));
		System.out.println(Reversed());
		System.out.println(Sum(new int[]{10,9,5,7,19}));

	}

	
	public static HashMap<String, Integer> CountWords(String textToCount) throws Exception {

		String sentence = "I am trying to make a program on word count which I have partially made and it is giving the correct "
				+ "result but the moment I enter space or more than one space in the string, the result of word count show wrong "
				+ "results because I am counting words on the basis of spaces used. I need help if there is a solution in a way "
				+ "that no matter how many spaces are I still get the correct result. I am mentioning the code below.";

		String[] words = sentence.split(" ");
		int count = 0;
		HashMap<String, Integer> object = new HashMap<String, Integer>();

		for (int i = 0; i < words.length; i++) {
			if (textToCount.equalsIgnoreCase(words[i])) {
				count++;
			}
			object.put(textToCount, count);

		}
		return object;
	}

	public static List<String> Reversed() throws Exception {
		List<String> message = Arrays.asList("You?", "Are", "How", "Hello");
		Collections.reverse(message);
		return message;
	}

	public static int Sum(int[] value) throws Exception {
		int total = 0;
		for (int i = 0; i < value.length; i++) {
			
			total += value[i];
		}
		return total;
	}

}
