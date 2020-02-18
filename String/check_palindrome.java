package manish;

import java.util.Scanner;

public class check_palindrome {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String str = scr.nextLine();
		String s = checking(str);
		System.out.println(s);

	}

	public static String checking(String s) {
		StringBuilder sb = new StringBuilder();
		int i = 0;
		int j = i + 1;

		while (i!=s.length()) {
			if ((j == s.length() - 2) && (s.charAt(i) == s.charAt(j))) {
				sb.append(s.charAt(i));
				
				return sb.toString();
			}
//			if(s.charAt(i)==s.charAt(j)&&j==s.length()-1)
//			{
//				return sb.toString();
//			}
			if(s.length()==2&&s.charAt(i)==s.charAt(j))
			{
				System.out.println("empty String");

			}
			if (j == s.length() - 1&&s.charAt(i)!=s.charAt(j)) {
				sb.append(s.charAt(i));
				return sb.toString();
			}
		
		if (s.charAt(i) != s.charAt(j)) {
			sb.append(s.charAt(i));
			i++;
			j++;

		}
		if (s.charAt(i) == s.charAt(j)) {
			i += 2;
			j += 2;
		}
		
		}
		return sb.toString();

	}

}
