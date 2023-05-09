/**
 * created by James Vincent Escartin on 5/9/23
 **/
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int k = 0; // Variable to store count of element not equal to val

        for(int i =0; i < nums.length; i ++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }

}
