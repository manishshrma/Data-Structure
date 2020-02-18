package manish;

public class Check_pal {
	public static boolean palindrome(String str) {
		int i, j;
		int left = 0;
		int right = str.length() - 1;
		while (left < right) {

			if (str.charAt(left) != str.charAt(right))
			{
	        	return false;
			}
			left++;
			right--;
		}
		
		return true;
	}

	public static void main(String[] args) {
	//	palindrome();
		String S="abaaba";
		int i,j;
		for(i=0;i<S.length();i++)
		{
			for(j=i+1;j<=S.length();j++)
			{
				String str =S.substring(i,j);
			
				boolean res=palindrome(str);
				if(res==true)
					System.out.println(str);
			}
		}
	}

}
