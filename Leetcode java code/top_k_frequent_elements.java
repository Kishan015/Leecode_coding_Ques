class Solution {
public int[] topKFrequent(int[] nums, int k) {

        // The brute force approach is to generate a frequency map
        // of the elements of the array using a HashMap
        // and then sort the HashMap elements based on the frequency
        // This approach would have a time complexity of O(nlogn)
        // We can do better than this by using a heap

        // Time Complexity: O(nlogk)
        // Constructing the freqMap map would be O(n), adding all the elements into maxheap
        // would also be O(n)
        // then we apply heapify once which is also O(n)
        // then we pop the top k elements, each pop would take O(logn) thus time complexity would be
        // O(klogn)
        // Space Complexity: O(n)

        int[] arr = new int[k];

        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums) freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        PriorityQueue<Map.Entry<Integer, Integer>> maxheap = new PriorityQueue<>((a,b) -> a.getValue() - b.getValue());

        //map.entrySet() gives all the key-value pairs in the hashmap

        for (Map.Entry<Integer, Integer> mapElement : freqMap.entrySet()) {
            maxheap.add(mapElement);
            if(maxheap.size() > k) maxheap.poll();
        }

        int i = k;
        while(!maxheap.isEmpty()){
            arr[--i] = maxheap.poll().getKey();
        }

        return arr;
    }

}
