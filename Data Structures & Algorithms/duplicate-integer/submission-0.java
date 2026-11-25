class Solution {
    public boolean hasDuplicate(int[] nums) {

        if(nums.length == 0){
            return false;
        }

        Set<Integer> seen = new HashSet<>();

        for(int i=0; i< nums.length; i++){
            int element = nums[i];
            if(!seen.add(element))   {
                return true;
            }
        }
        return false;
        
    }
}