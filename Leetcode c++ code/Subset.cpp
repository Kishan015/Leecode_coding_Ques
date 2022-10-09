class Solution {
public:

void solve(vector<vector<int>> &ans, vector<int> &a, int n, int index, vector<int> nums){
    if(index == n){
        return;
    }
    
    for(int i = index;i<n;i++){
        a.push_back(nums[i]);
        ans.push_back(a);
        solve(ans, a, n, i+1, nums);
        a.pop_back();
    }
}