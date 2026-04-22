class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashmap = new HashMap<>();

        for(String s : strs){
            int[] count = new int[26];
            for(char ch : s.toCharArray()){
                count[ch - 'a']++;
            }

            String key = Arrays.toString(count);
            hashmap.putIfAbsent(key, new ArrayList<>());
            hashmap.get(key).add(s);
        }

        return new ArrayList<>(hashmap.values());
    }
}
