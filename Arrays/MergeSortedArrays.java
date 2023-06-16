// Merge two sorted arrays without using extra space

public class MergeSortedArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while(i < m && j < n){
            if(nums2[j] < nums1[i]){
                int p = m;
                while(p > i && p < m+n){
                    nums1[p] = nums1[p-1];
                    p--;
                }
                nums1[p] =  nums2[j];
                j++;
                m++;
            }
            else{
                i++;
            }
        }
        int k = 0;
        while(j < n && (m+k) < (m+n)){
            nums1[m + k] = nums2[j++];
            k++;
        }
    }
}
