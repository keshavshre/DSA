class Solution {
    public List<String> letterCombinations(String digits) {
        List<String>res=new ArrayList<>();
        if(digits==null || digits.length()==0){
            return res;
        }
        String curr="";
        String[]map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        func(0,digits,map,curr,res);
        return res; 
    }
    public static void func(int ind,String digits,String[]map,String curr,List<String>res){
        if(ind==digits.length()){
            res.add(curr);
            return;
        }
        String letter=map[digits.charAt(ind)-'0'];
        for(char ch:letter.toCharArray()){
            func(ind+1,digits,map,curr+ch,res);
        }
    }
}