import java.util.*;

public class threesum {
	 public static List<List<Integer>> threeSum(int[] nums) {
	        List<List<Integer>> results = new ArrayList<>();
	        List<Integer> result = new ArrayList<>();
	        Arrays.sort(nums);
	        int temp;
	        for(int i=0;i<nums.length;i++)
	        	for(int j =i+1;j<nums.length;j++) {
	        		/*while(i>0&&nums[i]==nums[i-1])
	        		{
	        			i++;j++;
	        		}*/
	        		temp=nums[i]+nums[j];
	        		for(int k =j+1;k<nums.length;k++)
	        		{
	        			if(0-temp==nums[k])
	        			{
	        				result.add(nums[i]);
	        				result.add(nums[j]);
	        				result.add(nums[k]);
	        				boolean a = false;
	        				for(int l =0;l<results.size();l++)
	        					if(results.get(l).equals(result))
	        						a=true;
	        				if(a==false)
	        				results.add(result);
	        				result= new ArrayList<>();
	        			}
	        		}
	        	
	        	}
	        
	    return results;  	
	    }
	 public static void main(String[] args)  {
		 int[] S = new int[6];
		 S[0]=-1;S[1]=0;S[2]=1;S[3]=2;S[4]=-1;S[5]=-4;
		 System.out.println(threeSum(S).toString());
	 }
}
