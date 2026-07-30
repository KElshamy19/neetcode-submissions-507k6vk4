class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numsSet = new HashSet();
        int max = 0;
        for(int i = 0;i< nums.length;i++)
            numsSet.add(nums[i]);
        for(int i=0;i<nums.length;i++){
            if(!numsSet.contains(nums[i]-1)){ //it is the beginning
                int count = 1;
                int current = nums[i];
                while(true){
                    if(!numsSet.contains(current+1))
                        break;
                    current+=1;
                    count+=1;
                }
                if(max<count) max=count;
            }
        }
        return max;
    }
}
