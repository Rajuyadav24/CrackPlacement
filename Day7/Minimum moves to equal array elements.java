class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int moves = 0;
        int midElement = nums[nums.length / 2]; // median
        for(int i = 0; i < nums.length; i++){
            moves += Math.abs(nums[i] - midElement);
        }
        return moves;

    }
}
