class Solution {
    public int findPeakElement(int[] nums) {
        
        int start = 0;
        int end = nums.length -1;
        
        while(end > start){
            int mid = start + (end - start)/2; // (start + end)/2
            if(nums[mid+1] > nums[mid]){
                //current index is in the increasing part of the array
                start = mid + 1;
            } else {
                //current index is in the decreasing part of the array
                end = mid;
            } 
        }

        //start and end would point to the same element (peak)
        return start; 
    }
}