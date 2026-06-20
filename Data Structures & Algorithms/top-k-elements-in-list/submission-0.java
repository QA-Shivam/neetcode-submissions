class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequencyMap= new HashMap<>();
        for(int n: nums){
            frequencyMap.put(n,frequencyMap.getOrDefault(n,0)+1);
        }

        List<Integer>[] bucket= new List[nums.length+1];
        for(int number:frequencyMap.keySet()){
            int freqno= frequencyMap.get(number);
            if(bucket[freqno]==null){
                bucket[freqno]= new ArrayList<>();
            }
            bucket[freqno].add(number);
        }
        
        List<Integer> topK= new ArrayList<>();
        for(int i= bucket.length-1;i>=0 && topK.size()<k; i--){
            if(bucket[i]!=null){
                topK.addAll(bucket[i]);
            }
        }
        return topK.stream().mapToInt(n->n).toArray();
     }
}
