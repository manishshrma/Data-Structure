package manish;

import java.util.Scanner;

public class String_bw_parenthesis {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String ques = scr.next();
		StringBuilder ans = new StringBuilder();
		print(ques, ans, false);

	}

	public static String print(String ques, StringBuilder ans, boolean x) {
		//boolean x = false;
		
		if (ques.length() == 0) {
			System.out.println(ans);
			return ans.toString();

		}
		char ch = ques.charAt(0);

		if (ques.charAt(0) == '(') {
			x = true;
			String roq = ques.substring(1);
			ans.append("(");
			return print(roq, ans,x);
		}
		if (ques.charAt(0) == ')') {
			x = false;
			ans.append(")");
			String roq = ques.substring(1);
			return print(roq, ans,x);

		}
		if (x == true) {
			String roq = ques.substring(1);
			ans.append(ch);
			return print(roq, ans,x);
		}

		else {
			String roq = ques.substring(1);
			return print(roq, ans,x);

		}

	}

}
