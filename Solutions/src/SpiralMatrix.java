import java.util.ArrayList;
import java.util.List;

/**
 * created by Acer on 5/9/23
 **/
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();

        if(matrix == null || matrix.length == 0 || matrix[0].length == 0){
            return result;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;
        int top = 0;
        int bottom = rows -1;
        int left = 0;
        int right = columns - 1;

        while(top <= bottom && left <= right) {
            //Traverse Top Row
            for(int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top ++;

            //Travers Right Column
            for(int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right --;

            //Traverse Bottom Row
            if(top <= bottom){
                for(int i = right; i>= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom --;
            }

            //Traverse Left Column
            if(left <= right){
                for(int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }

        return result;

    }
}
