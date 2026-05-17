class Solution {

    public static String getFrequencyString(String str){
     str= str.toLowerCase();
     int [] freq= new int [26];
     for(char c: str.toCharArray()){
        freq[c-'a']++;
     }
     StringBuilder sb= new StringBuilder();
     char c= 'a';
     for(int i : freq){
        sb.append(c);
        sb.append(i);
        c++;
     }
     return sb.toString();
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }

        Map<String, List<String>> fsm= new HashMap<>();
        for(String s: strs){
            String freqString= getFrequencyString(s);
            if(fsm.containsKey(freqString)){
                fsm.get(freqString).add(s);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(s);
                fsm.put(freqString,list);
            }
        }

        return new ArrayList<>(fsm.values());
    }
}
