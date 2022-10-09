class Solution {
public:
    int coinChange(vector<int>& arr, int x) {
        //tabulation
        vector<int> dp(x+1,INT_MAX);
        dp[0] = 0;
        for(int i=1;i<=x;i++){
            for(int j=0;j<arr.size();j++){
                if(i - arr[j] >= 0 && dp[i - arr[j]] != INT_MAX){
                    dp[i] = min(dp[i],1+dp[i-arr[j]]);
                }
            }
        }
        if(dp[x] == INT_MAX){
            return -1;
        }
        return dp[x];
    }
};