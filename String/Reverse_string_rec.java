package manish;

public class Reverse_string_rec {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("manish");
		StringBuilder sb2 = new StringBuilder();
		int end=sb1.length()-1;
		System.out.println(reverse(sb1,sb2,0,end));
	//	StringBuilder x=	reverse(s,str,0,end,0);
		
	}
		
		public static StringBuilder reverse(StringBuilder sb1,StringBuilder sb2,int start,int end)
		{
			

//System.out.println("i am in : reverse("+sb1+sb2+start+end+")");
			if(end<0)
				return sb2;
			
			
			char ch1='0';char ch2='0';
			// ch1 = sb1.charAt(start);
			 ch2 = sb1.charAt(end);
			
		
				sb2.insert(start, ch2);
	      	StringBuilder s= reverse(sb1,sb2,start+1,end-1);
	      	StringBuilder sm=new StringBuilder();
//				 System.out.println( reverse(sb1,sb2,start+1,end-1));
				 
			return sb2 ;
		 }
}
