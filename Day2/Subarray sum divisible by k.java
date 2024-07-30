class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> remFreq = new HashMap<>();
        remFreq.put(0,1);

        int sum = 0, rem = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            rem = sum % k;

            if(rem < 0){
                rem += k;
            }
            if(remFreq.containsKey(rem)){
                ans += remFreq.get(rem);
                remFreq.put(rem, remFreq.get(rem) + 1);
            }
            else{
                remFreq.put(rem,1);
            }
        }
        return ans;
    }
}
