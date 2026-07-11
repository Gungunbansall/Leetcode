class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hm = new HashMap<>();
        StringBuilder answer = new StringBuilder();
        for(char ch: s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        List<Character> list = new ArrayList(hm.keySet());
        list.sort((ob1,ob2) -> hm.get(ob2)-hm.get(ob1));
        for(char ch:list){
            for(int i =0;i<hm.get(ch);i++){
                answer.append(ch);
            }
        }
        return answer.toString();
    }
}