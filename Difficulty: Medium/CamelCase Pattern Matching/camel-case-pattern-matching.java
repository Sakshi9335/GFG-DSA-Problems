class Solution {
    public List<String> camelCase(String[] arr, String pat) {
        // code here
        List<String> res = new ArrayList<>();
        for (String temp : arr) {
            StringBuilder s = new StringBuilder();
            for (int j = 0; j < temp.length(); j++) {
                char ch = temp.charAt(j);
                if (Character.isUpperCase(ch)) {
                    s.append(ch);
                }
            }

            if (s.length() >= pat.length() && 
                s.substring(0, pat.length()).equals(pat)) {
                res.add(temp);
            }
        }

       

       return res;
    }
}
