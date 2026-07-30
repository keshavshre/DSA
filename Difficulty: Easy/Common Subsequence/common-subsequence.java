class Solution {
    public boolean commonSubseq(String s1, String s2) {
        // code here
        HashSet<Character>h=new HashSet<>();
        for(int i=0;i<s1.length();i++){
            h.add(s1.charAt(i));
        }
        for(int i=0;i<s2.length();i++){
            if(h.contains(s2.charAt(i)))return true;
        }
        return false;
    }
}