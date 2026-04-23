class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;

        for(int num : nums){
            if(!map.containsKey(num)){
                int left = map.getOrDefault(num - 1, 0);
                int right = map.getOrDefault(num + 1, 0);

                int total = 1 + left + right;

                map.put(num, total);
                map.put(num - left, total);
                map.put(num + right, total);

                res = Math.max(res, total);
            }
        }

        return res;
    }
}
