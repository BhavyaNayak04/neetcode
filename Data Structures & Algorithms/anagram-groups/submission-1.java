class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> hashmap = new HashMap<>();

        for(int i = 0; i < strs.length; i++){
            int map[] = new int[26];
            String str = strs[i];
            StringBuilder key = new StringBuilder();

            for(int j = 0; j < str.length(); j++){
                char ch = str.charAt(j);
                map[ch - 'a']++;
            }

            for(int k = 0; k < map.length; k++){
                key.append(map[k]).append(",");
            }

            String k = key.toString();
            if(hashmap.containsKey(k)){
                hashmap.get(k).add(str);
            }

            else{
                List<String> list = new ArrayList<>();
                list.add(str);
                hashmap.put(k, list);
            }

        }

        List<List<String>> ans = new ArrayList<>(hashmap.values());
        return ans;

    }
}
