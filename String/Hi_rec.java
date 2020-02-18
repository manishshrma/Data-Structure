package manish;

import java.util.Scanner;

public class Hi_rec {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		String s = scr.next();
		StringBuilder sb = new StringBuilder();
		int i = s.length() - 1;
		int index=scr.nextInt();
		int  count=0;

		String str = remove(s,count);
		System.out.println(str.charAt(index));
		System.out.println(str);

	}

	public static String remove(String s,int count) {

		if (s.length() < 2) {
			System.out.println(count);
			//return s.substring(0);
			return s;

		}
		String str = s.substring(0, 2);

		if (str.equals("hi")) {
			count++;
			  
			String ros=s.substring(2);
			return remove(ros,count);
		} else{
			String ros=s.substring(1);

			char ch = s.charAt(0);
			return ch + remove(ros,count);

		}
	}
}
