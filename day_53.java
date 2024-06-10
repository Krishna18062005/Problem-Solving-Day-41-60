class Solution {
    public int heightChecker(int[] heights) {
        int[] hei=new int[heights.length];
        for(int i=0;i<heights.length;i++) hei[i]=heights[i];
        Arrays.sort(hei);
        int c=0;
        for(int i=0;i<hei.length;i++){
            if(hei[i]!=heights[i]) {
                c++;}
        }
       
        return c;
        
    }
}
