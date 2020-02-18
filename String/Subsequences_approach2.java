package manish;

import java.util.ArrayList;

public class Subsequences_approach2 {
	static String[] codes1 = {".","abc","def","ghi","jkl","mno","pqr","st","uvwx","yz"};

	public static void main(String[] args) {
		int i=0;
		getSS2("abc", "");
	//	getSS3("bc", "");
	  //  getSS4("179","",i);

	}

	public static void getSS2(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);// bc
		getSS2(roq, asf + "");
		getSS2(roq, asf + ch);
	}

	public static void getSS3(String ques, String asf) {
		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}

		char ch = ques.charAt(0);
		String roq = ques.substring(1);// bc

		getSS3(roq, asf + "");
		getSS3(roq, asf + ch);
		getSS3(roq, asf + (int) ch);
	}

	public static void getSS4(String ques, String asf,int i) {

		if (ques.length() == 0) {
			System.out.println(asf);
			return;
		}
		char ch = ques.charAt(0);
		String roq = ques.substring(1);
		String chs = codes1[ch - '0'];
	char ch2=	chs.charAt(i);
//		for (int i = 0; i < chs.length(); i++) {
//
//			char options = chs.charAt(i);
//			getSS4(roq, asf + options);
//
//		}
		getSS4(roq,asf+ch2,i++);
		getSS4(roq,asf+ch2,i++);


	}
}
//	public static void per(String ques,String asf)
//	{
//		if(ques.length()==0)
//		{ 
//			
//		}
//		  char ch=ques.charAt(0);
//		 asf= ques.substring(1);
//		String chcodes=codes1[ch-'0'];
//		
//		
//
//		 
//		 
//		  
//		
//		
//		}
//		
//		
		
//		
//	}
//}
