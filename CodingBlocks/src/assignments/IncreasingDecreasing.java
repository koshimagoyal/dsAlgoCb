package assignments;

import java.util.Scanner;

public class IncreasingDecreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int prev = sc.nextInt();
		int curr;
		int i=0;
		boolean isDecreasing = true; //ye btadega ki increase hora ya decrease
		boolean ans = true;
		//break will not work for second series
		while(i<n-1) {
			curr = sc.nextInt();
			
			if(prev == curr){
				//Ans galat
				ans = false;
				break; 
			} else if(prev>curr) {
				if(isDecreasing) {
					//kuch ni karna
				} else { //isDecreasing  == false
					ans = false;
					break;
				}
			} else { //prev < curr
				if(isDecreasing) {
					isDecreasing = false;
					//bottom most point
				} else { //isDecreasing  == false
					// sequence pehle se hi increasing
				}
			}
			prev = curr;
			i++;
		}
		System.out.println(ans);
		sc.close();
	}

}
