public class FindDuplicate {
    public int findDuplicate(int[] nums) {
        int slowPtr = nums[0];
        int fastPtr = nums[0];

        do{
            slowPtr = nums[slowPtr];
            fastPtr = nums[nums[fastPtr]];
        }while(slowPtr != fastPtr);

        fastPtr = nums[0];

        while(slowPtr != fastPtr){
            slowPtr = nums[slowPtr];
            fastPtr = nums[fastPtr];
        }
        return slowPtr;
    }
}
