class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int search = 0;
       for(int i = 0;i < nums.length;i++){
        if(nums[i] == target){
            search = 1;
            return i;   
        }
       } 
       if(search == 0){
        for(int i = 0;i<nums.length;i++){
            if(nums[i] > target ){
                return i;
            }
         }
       }
    return nums.length; 
    }
}