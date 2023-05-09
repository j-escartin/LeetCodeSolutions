/**
 * created by James Vincent Escartin on 5/9/23
 **/
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m -1; // last index for nums1;
        int j = n-1; //last index for nums2
        int k = m + n -1; // last indext of the merge array nums1

        //Compare indexes
        while(i > 0 && j > 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        //if there are still remain numbers in j
        while(j-- >0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}
