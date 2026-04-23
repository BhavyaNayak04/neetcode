class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for(int num : nums) set.add(num);
        int length = 0;
        int ans = 0;

        for(int num : nums){
            if(!set.contains(num - 1)){
                while(set.contains(++num)) length++;
                ans = Math.max(ans, length);
                length = 0;
            }
        }

        return ans + 1;
    }
}
