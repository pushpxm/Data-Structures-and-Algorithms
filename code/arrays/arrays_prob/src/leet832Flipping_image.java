import java.lang.reflect.Array;
import java.util.Arrays;

public class leet832Flipping_image {
    public static void main(String[] args) {
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        System.out.println(Arrays.toString(flipAndInvertImage(image)));

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int arr_len= image.length;
        int arr_inside_len= image[0].length;
        for(int i=0;i< image.length;i++){    // shifting code
            int start=0;
            int end= (arr_inside_len-1);
            while(start<=end){
                int temp= image[i][start];
                image[i][start]= image[i][end];
                image[i][end]= temp;

                start+=1;
                end-=1;}}

        for(int i=0;i< image.length;i++){                                 // 0->1 / 1->0
            for(int j=0;j<image[i].length;j++){
                if(image[i][j]==1){
                    image[i][j]=0;
                }
                else if(image[i][j]==0){
                    image[i][j]=1;
                }
                else{continue;}
            }
        }
        return image;

    }}





//    static int[][] flipAndInvertImage(int[][] image){
//        int arr_length = image.length;
//        int arr_inside_length = image[0].length;
//        for(int i=0;i<image.length;i++){
//            int start =0;
//            int end = arr_inside_length-1;
//            /* reversing the image-> (Basically swapping) */
//            while (start<=end){
//                int temp = image[i][start];
//                image[i][start]= image[i][end];
//                image[i][end] = temp;
//                start++;
//                end--;
//            }
//        }
//        for(int i=0; i< image.length;i++){
//            for (int j = 0; j < image[i].length; j++) {
//                if(image[i][j]==1){
//                    image[i][j]=0;
//                }else if(image[i][j]==0){
//                    image[i][j]=1;
//                }
//                else {continue;}
//            }
//        }
//    return image;}
//}
