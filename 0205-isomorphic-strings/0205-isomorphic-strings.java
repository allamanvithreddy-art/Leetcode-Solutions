class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> k=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!k.containsKey(s.charAt(i))){
                if(t.indexOf(t.charAt(i))<i){
return false;
                }
k.put(s.charAt(i),t.charAt(i));
            }
            else{
                if(t.charAt(i)!=k.get(s.charAt(i))){
                    return false;
                }
            }
        }
        return true;
    }
}