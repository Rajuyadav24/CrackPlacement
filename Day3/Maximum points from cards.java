class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int lsum = 0,rsum = 0,maxScore = 0;
        for(int i = 0; i < k; i++){
            lsum += cardPoints[i];
        }
        maxScore = lsum;
        int rindex = n - 1;
        for(int i = k-1; i >= 0; i--){
            lsum -= cardPoints[i];
            rsum += cardPoints[rindex];
            rindex--;
            maxScore = Math.max(maxScore, lsum + rsum);
        }
        return maxScore;
    }
}
