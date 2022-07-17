import java.util.Arrays;

public class reshaping_matrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r=1;
        int c=4;
        System.out.println(Arrays.toString(matrixReshape(mat,r,c)));
    }



    static int[][] matrixReshape(int[][] mat, int r, int c){

        int m = mat.length;
        int n= mat[0].length;

        if((m*n)!=(r*c)){
            return mat;
        }
        int[][] answer = new int[r][c];
        int row = 0;
        int column = 0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                answer[row][column] = mat[i][j];
                column++;

                if(column == c){
                    row++;
                    column = 0;
                }
            }
        }
        return answer;
    }
}
