class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> m;
        vector<int> ans;
        for(int i = 0; i < nums.size(); i++){
            if(m.find(target-nums[i]) != m.end()){
                cout<<m[target-nums[i]]<<"true"<<i<<"\n";
                ans.push_back(m[target-nums[i]]);
                ans.push_back(i);
                return ans;
            }
            else{
                m.insert({nums[i],i});
            }
        }
        return ans;
    }
        
};