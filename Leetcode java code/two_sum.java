// Brute Force Approach
// Time Complexity: O(n^2)

class Solution {
    public:
        vector<int> twoSum(vector<int>& nums, int target) {
            vector<int> ans;
            
            for(int i=0; i<nums.size(); i++){
                for(int j=i+1; j<nums.size(); j++){
                    if(nums[j] == target - nums[i]){
                        ans.push_back(i);
                        ans.push_back(j);
                        break;
                    }
                }
            }
            return ans;
        }
    };

// Hash Map Approach
// Time Complexity: O(n)

class Solution {
    public:
        vector<int> twoSum(vector<int>& nums, int target) {
            vector<int> ans;
            unordered_map<int, int> hashmap;
            for(int i=0; i<nums.size(); i++){
                if(hashmap.find(target - nums[i]) != hashmap.end()){
                    ans.push_back(i);
                    ans.push_back(hashmap[target - nums[i]]);
                } else {
                    hashmap[nums[i]] = i;
                }
            }
            return ans;
        }
    };