public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int isValidSudoku(final List<String> arr) {
        int row = arr.size();
        int col = arr.get(0).length();
        Map<Integer,List<Character>> rows = new HashMap<>();
        Map<Integer,List<Character>> cols = new HashMap<>();
        Map<Integer,List<Character>> sq = new HashMap<>();
        for(int i = 0;i<row;i++)
        for(int j =0;j<col;j++) {
            char temp = arr.get(i).charAt(j);
            if(temp == '.') continue;
            if(rows.containsKey(i) && rows.get(i).contains(temp)) return 0;
            if(!rows.containsKey(i))
            rows.put(i,new ArrayList<>(Arrays.asList(temp)));
            else 
            rows.get(i).add(temp);
            
            if(cols.containsKey(j) && cols.get(j).contains(temp)) return 0;
            if(!cols.containsKey(j))
            cols.put(j,new ArrayList<>(Arrays.asList(temp)));
            else 
            cols.get(j).add(temp);
            
            int sqBox = ((i/3)*3) + (j/ 3);
            
            if(sq.containsKey(sqBox) && sq.get(sqBox).contains(temp)) return 0;
            if(!sq.containsKey(sqBox))
            sq.put(sqBox,new ArrayList<>(Arrays.asList(temp)));
            else 
            sq.get(sqBox).add(temp);            
        }
        return 1;
    }
}
