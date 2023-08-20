package assignments;

import java.util.*;

public class CBNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        int count = 0;
        ArrayList<Long> cb = new ArrayList<>();
        boolean[] visited = new boolean[10];
        Arrays.fill(visited, false);
        for(int i=0;i<str.length();i++) {
            for(int j=i+1;j<=str.length();j++) {
                String res = str.substring(i,j);
                // System.out.println(res);
                if(isCBNumber(Long.parseLong(res))) {
                    // System.out.println(res);
                    cb.add(Long.parseLong(res));
                }
            }
        }
        Collections.sort(cb);
        ArrayList<String> cbList = new ArrayList<>();
        for(int i=0;i<cb.size();i++) {
            cbList.add(cb.get(i).toString());
        }
        for(int i=0;i<cbList.size();i++) {
            if(isValid(visited, cbList.get(i))) {
                count++;
                for(int j=0;j<cbList.get(i).length();j++)
                {
                    visited[cbList.get(i).charAt(j)-'0'] = true;
                }
            }
        }
        System.out.println(count);
    }

    public static boolean isValid(boolean visited[], String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(visited[str.charAt(i)-'0'])
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isCBNumber(long n) {
        if(n==0||n==1)
            return false;
        int prime[] = {2,3,5,7,11,13,17,19,23,29};
        for(int i=0;i<10;i++) {
            if(n==prime[i]) {
                return true;
            }
        }
        for(int i=0;i<10;i++) {
            if(n%prime[i]==0) {
                return false;
            }
        }
        return true;
    }
}