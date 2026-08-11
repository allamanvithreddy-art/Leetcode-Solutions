class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int a[]=new int[2];
        for(i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                   a[0]=i;
                   a[1]=j;
                   //return a;
                   // return i,j;
                    //System.out.println("["+i+"]"+j);
                }
            }
        }
        return a;
    }
}
        
    
