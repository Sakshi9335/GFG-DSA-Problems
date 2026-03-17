class Solution {
    static boolean isValid(int mat[][]) {
        // code here
           HashSet<String>set=new HashSet<>();
        for(int i=0;i<9;i++){
          for(int j=0;j<9;j++){
           if(mat[i][j]==0)
               continue;
           String row =mat[i][j]+"ROW"+i;
           String col =mat[i][j]+"COL"+j;
           String box =mat[i][j]+"BOX"+(i/3)+"."+(j/3);
           if(set.contains(row)||set.contains(col)||set.contains(box)){
            return false;
           }
           set.add(row);
           set.add(col);
           set.add(box);
          }
        }
        return true;
    }
}