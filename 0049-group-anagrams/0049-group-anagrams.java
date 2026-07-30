class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<>();
        String[] temp = new String[strs.length];

        for(int i = 0 ; i < strs.length ; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            temp[i] = sorted;
        }

        Set<Integer> ind = new HashSet<>();
        for(int i = 0 ; i < temp.length ; i++){
            List<String> arr1 = new ArrayList<>();
            for(int j = i ; j < temp.length ; j++){
                if(!ind.contains(j) && temp[i].equals(temp[j])){
                    arr1.add(strs[j]);
                    ind.add(j);
                }
            }
            if(arr1.size() != 0){
                arr.add(arr1);
            }
        }
        return arr;
    }
}