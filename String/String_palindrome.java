package manish;

import java.util.Scanner;

public class String_palindrome {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String s=scr.next();
	//	String s = "NitiN";
//		s=s.toLowerCase();
//		//System.out.println(s);
		int start = 0;
		int end = s.length() - 1;
		boolean result = checkpalind(s, start, end);
		if (result == true)
			System.out.println(result);
		else
			System.out.println(result);

	}

	public static boolean checkpalind(String s, int start, int end) {
		while (start-end<0) {
			
				char ch=s.charAt(start);
				char ch2=s.charAt(end);
				if(ch>='A'&&ch<='Z')
				  ch=(char) (ch-'A'+'a');
				if(ch2>='A'&&ch2<='Z')
					  ch2=(char) (ch-'A'+'a');	
			

			if (ch == ch2) {
				start++;
				end--;
			}
			else
				break;
		}
	System.out.println(s);
		
		System.out.println();
		if (start - end>=0)
			return true;
		else
			return false;

	}
}
