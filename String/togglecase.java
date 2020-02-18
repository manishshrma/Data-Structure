package manish;

import java.util.Scanner;

public class togglecase {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		StringBuilder sb=new StringBuilder(s1);
		
		char x;

		for (int i = 0; i < sb.length(); i++) {

			if (sb.charAt(i) >= 'A' && sb.charAt(i) <= 'Z') {

			//	x = (char) (sb.charAt(i) - 'A' + 'a');
				x = (char) (sb.charAt(i)+ 32);


			} else {
				//x = (char) (sb.charAt(i) + 'A' - 'a');
				x = (char) (sb.charAt(i) -32);

			}
			System.out.print(x);
		}

	}

}
