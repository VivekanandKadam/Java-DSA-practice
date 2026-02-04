class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();

        for(int elements : nums){
            if(!hash.add(elements)){
                return true;
            }
        }
        return false;
    }
}