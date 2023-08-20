package quest;

import java.util.ArrayList;

public class Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printPermutations("abc");
	}
	
	public static ArrayList<String> printPermutations(String str) {
		ArrayList<String> res = new ArrayList<>();
		if(str.length()==0) {
			res.add("");
			return res;
		}
		char c = str.charAt(0);
		String sub = str.substring(1);
		
		ArrayList<String> rr = printPermutations(sub);
		for(String s:rr) {
			for(int i=0;i<=s.length();i++) {
				String ans = s.substring(0,i)+c+s.substring(i);
				res.add(ans);
			}
		}
		return res;
	}
	

}
