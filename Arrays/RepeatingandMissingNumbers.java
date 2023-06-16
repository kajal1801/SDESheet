import java.util.ArrayList;

public class RepeatingandMissingNumbers { 
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int res[] = new int[2];
        long sum = ((long)n * (long)(n + 1)) / 2;
        long sqSum = ((long)n * ((long)n + 1) * (2*(long)n + 1)) / 6;

        for(int i = 0;i < n;i++){
            sum -= (long)arr.get(i);
            sqSum -= (long)(arr.get(i)*arr.get(i));
        }

        res[0] = (int)(((long)sum + (long)(sqSum/sum))/ 2);
        res[1] = (int)((long)res[0] - (long)sum);
        return res;
    }
}