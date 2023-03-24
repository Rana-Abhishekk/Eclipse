import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm = new HashMap<>();
		for(int i =0 ;i<5;i++)
		{
			hm.put(i, "Student"+i);
			
		}
		
		Iterator i = hm.entrySet().iterator();
		
		while(i.hasNext()) {
			Map.Entry mapElem = (Map.Entry)i.next();
			System.out.println(mapElem.getKey());
			System.out.println(mapElem.getValue());
		}
		
		System.out.println("Next one by for each loop");
		
		for(Map.Entry<Integer, String > mapElement : hm.entrySet()) {
			System.out.println(mapElement.getKey());
			System.out.println(mapElement.getValue());
		}

	}

}



////////
public class Solution {
    public static int solve(int n,int x,int y,int z){
        if(n<0) return Integer.MIN_VALUE;
        if(n==0) return 0;
        
        int cutx = 1 + solve(n-x,x,y,z);
        int cuty = 1 + solve(n-y,x,y,z);
        int cutz = 1 + solve(n-z,x,y,z);
        return Math.max(Math.max(cutx,cuty),cutz);
    }
    public static int cutSegments(int n, int x, int y, int z) {
        // Write your code here.
      // int ans = solve(n,x,y,z);
//         if(ans<0){
//             return 0;
//         }else{
//             return ans;
//         }
        
        // Tabulation 
        int[] dp = new int[n+1];
        for(int i=0;i<=n;i++) dp[i] = Integer.MIN_VALUE;
        dp[0]=0;
        for(int i=1;i<=n;i++){
            if(n-x>0){
                dp[i] = Math.max(dp[i] , dp[i-x]) +1;
            }
              if(n-y>0){
                dp[i] = Math.max(dp[i] , dp[i-y]) +1;
              }
              if(n-x>0){
                dp[i] = Math.max(dp[i] , dp[i-z]) +1;
              }
           
        }
        return dp[n+1];
    }
}
