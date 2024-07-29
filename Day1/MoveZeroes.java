class Solution {
    public void moveZeroes(int[] nums) {
        int lastFoundZero = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[lastFoundZero];
                nums[lastFoundZero] = nums[i];
                nums[i] = temp;
                lastFoundZero++;
            }
        }
    }
}
