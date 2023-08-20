package assignments;
import java.util.*;

public class MaximumNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0) {
            int n = sc.nextInt();
            String res = "";
            for(int i=0;i<n;i++) {
                int no = sc.nextInt();
                String res1 = res + no;
                String res2 = no + res;
                long resNo = Math.max(Long.parseLong(res1),Long.parseLong(res2));
                res = ""+resNo;
            }
            System.out.println(res);
            t--;
        }
	}

}
