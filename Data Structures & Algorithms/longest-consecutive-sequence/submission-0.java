class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]-1)){
                int currNum=nums[i];
                int currLen=1;
            while(set.contains(currNum+1)){
                currNum++;
                currLen++;
            }
            maxLen=Math.max(maxLen,currLen);
            }
        }
        return maxLen;
    }
}
