class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int ans=0;
        List<Integer>list=new ArrayList<Integer>();

     for(int i=0;i<nums.length;i++){
         int index=Math.abs(nums[i])-1;
     
     if(nums[index]<0)// if num is negative (that means already visited)
       list.add(Math.abs(nums[i]));
     else
       nums[index]=-nums[index];//we make each number seen once as negative
        
    }
    for(int i=0;i<nums.length;i++){
        nums[i]=Math.abs(nums[i]);
    }
    return list; 
    }
}
