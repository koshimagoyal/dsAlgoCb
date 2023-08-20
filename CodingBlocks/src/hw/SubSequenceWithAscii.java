package hw;

public class SubSequenceWithAscii {
	
	public static void main(String[] args) {
		ssa("ab","");
	}
	
	public static void ssa(String str, String ans) {
		
		if(str.length()==0) {
			System.out.println(ans);
			return;
		}
		
		char ch = str.charAt(0);
		String rest = str.substring(1);
		
		//exclude
		ssa(rest, ans);
		
		//include
		ssa(rest, ans + ch);
		
		//include ascii
		ssa(rest, ans + (int)ch);
		
	}
}
