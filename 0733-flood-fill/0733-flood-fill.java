class Solution {
    int count =0,nc=0;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(count == 0){
            nc = image[sr][sc];
            count++;
        }
        if((sr < 0 || sr >= image.length) || (sc < 0 || sc >= image[0].length)){
            return image;
        }
        if(image[sr][sc] != nc ){
            return image;
        }
        if(image[sr][sc] == color){
            return image;
        }
        image[sr][sc]=color;
        floodFill(image,sr,sc-1,color);
        floodFill(image,sr,sc+1,color);
        floodFill(image,sr-1,sc,color);
        floodFill(image,sr+1,sc,color);
       return image;
    }
   
}