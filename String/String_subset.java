package manish;

public class String_subset {
	public static void main(String[] args) {
		int i, j;
		String s = "abcd";
		for (i = 0; i < s.length(); i++) {
			for (j = i + 1; j <= s.length(); j++) {
				// System.out.println(s.charAt(j));
				System.out.println(s.substring(i, j));
				//System.out.println();
			}
		}

	}

}
