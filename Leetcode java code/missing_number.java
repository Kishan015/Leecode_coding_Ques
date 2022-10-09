class Solution {
    
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    
    public int missingNumber(int[] nums) {
        for(int i=0; i<nums.length; i++){
            while(nums[i] != i){
                if(nums[i] != nums.length){
                    swap(nums, i, nums[i]);
                } else {
                    break;
                }
            }
        }
                
        //check for the index that does not have the element equal to it's index
        for(int i=0; i<nums.length; i++){
            if(nums[i] != i){
                return i;
            }
        }
        
        //case 2 - only N is not present in the array
        return nums.length;
    }
}