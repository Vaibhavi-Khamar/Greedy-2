//greedy - with Hashmap to store last occurance of a character or take array of integers
//time=O(2n)
//space=O(1)

class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();
        int []map =new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map[c-'a']=i;        
        }
        int start=0; int end=0;
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            end=Math.max(end,map[c-'a']);
            if(i==end){
                result.add(end-start+1);
                start = i+1;
            }
        }
        return result;
    }
}