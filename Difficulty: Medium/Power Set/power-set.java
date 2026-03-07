// User function Template for Java

class Solution {
    public List<String> AllPossibleStrings(String s) {
        // Code here
        List<String> list = new ArrayList<>();
        subset("",s,0,list);
        Collections.sort(list);
        return list;
    }
    private void subset(String ans, String s, int i, List<String>list){
         if(i==s.length())
        {
            if(ans.length()!=0)
                list.add(ans);
            return;
        }
        char ch = s.charAt(i);
        subset(ans+ch,s,i+1,list);
        subset(ans,s,i+1,list);
    }
}