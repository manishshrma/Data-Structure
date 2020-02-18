package manish;

public class String_rec_conc {
	public static void main(String[] args) {
		// Scanner scr=new Scanner(System.in);
		String s = "abc";
		 StringBuilder ques=new StringBuilder("abc");
		 StringBuilder ans=new StringBuilder("");

//		perm(s, "");
	 perm2(ques,ans);

	}

	public static void perm(String ques, String ans) 
{
		if (ques.length() == 0) {
			System.out.println(ans);
		    return;
		}

		char ch = ques.charAt(0);
		String ros = ques.substring(1);
		// StringBuilder sb=new StringBuilder();
		for (int i = 0; i <= ans.length(); i++) {
			String left = ans.substring(0, i);
			String right = ans.substring(i);
			perm(ros, left + ch + right);
		}

	}

	 public static void perm2(StringBuilder ques,StringBuilder ans)
	 {
	 if(ques.length()==0)
	 {
	 System.out.println(ans);
	 return;
	 }
	 
	 char ch=ques.charAt(0);
	 ques.deleteCharAt(0);
	 for(int i=0;i<=ans.length();i++)
	 {
	 ans.insert(i,ch);
	 perm2(ques,ans);
	 ans.deleteCharAt(i);
	 }
	 ques.insert(0, ch);
	
	 }
	
	 }


