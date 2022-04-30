
//Implement a method to perform basic string compression using the counts of repeated characters. For example, the string aabcccccaaa would become a2blc5a3. If the "compressed" string would not become smaller than the original string, your method should return the original string. You can assume the string has only uppercase and lowercase letters (a - z)

public class StringCompressor {

	static String compress(String str) {

		int count = 0;
		String newStr = "";
		for (int i = 0; i < str.length() - 1; i++) {
			count++;
			if (str.charAt(i) != str.charAt(i + 1)) {
				newStr = newStr.concat(Character.toString(str.charAt(i)));
				newStr = newStr.concat(Integer.toString(count));
				count = 0;
			}
		}

		newStr = newStr.concat(Character.toString(str.charAt(str.length() - 1)));
		newStr = newStr.concat(Integer.toString(count + 1));

		if (str.length() <= newStr.length()) {
			return str;
		}
		return newStr;
	}

	public static void main(String[] args) {
		String str = "aabcccccaaa";

		System.out.println(compress(str));
	}
}
