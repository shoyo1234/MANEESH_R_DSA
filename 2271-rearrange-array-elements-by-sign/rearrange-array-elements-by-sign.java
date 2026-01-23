class Solution {
    public int[] rearrangeArray(int[] nums) {
        int size = nums.length;
        // New Array to store rearranged elements
        int rearranged_array[] = new int[size];
        // pointer for positive elements 
        int pos_index = 0; 
        // pointer for negative elements
        int neg_index = 1;

        for(int i = 0; i < size; i++){
            //check element > 0 -> Positive
            if(nums[i] > 0){
                rearranged_array[pos_index] = nums[i];
                pos_index += 2;
            }else{
                rearranged_array[neg_index] = nums[i];
                neg_index += 2;
            }
        }
        return rearranged_array;
        
    }
}