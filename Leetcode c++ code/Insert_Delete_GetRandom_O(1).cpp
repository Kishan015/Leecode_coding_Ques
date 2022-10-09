class Solution {
public:
    int trap(vector<int>& height) {
        
        vector<int> inc(height.size(), 0);
        int cur(INT_MIN), water(0), start(0), width(0);
        
        for(int i=height.size()-1; i>=0; i--)
        {
            cur = max(cur, height[i]);
            inc[i] = cur;
        }
        
        for(int i=0; i<height.size()-1; i++)
        {
            if(height[i] >= start)
            {
                if(i+2 < height.size()) start = min(height[i], inc[i+2]);
            }
            else
            {
                water += (start-height[i]);
            }
        }
        
        return water;
    }
};