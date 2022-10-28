class Solution {
           
    // Sliding Window Solution
    // Time Complexity: O(n)
    
    // Approach : 
    // 1) Use a HashSet because the operation 'contains()' runs in O(1) time for a HashSet
    // If we use a list to do it, it would take O(n) Lookup time, so we go for HashSet
    // 2) use two pointers (sliding window) and check if the current character is already present in the hashset
        // if not, then add it to the hashset and increase the counter
    
    public int lengthOfLongestSubstring(String s) {
        
        int i=0;
        int j=0;
        int ans = 0;
        
        HashSet<Character> hash_set = new HashSet<>();
        
        while(j < s.length()){
            if(!hash_set.contains(s.charAt(j))){
                hash_set.add(s.charAt(j));
                ans = Math.max(ans, j-i+1);
                j++;
            } else {
                hash_set.remove(s.charAt(i));
                i++;
            }
            
        }
        return ans;
    }
}