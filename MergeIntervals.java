import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<int[]>();
        Arrays.sort(intervals, (a,b) -> (a[0] - b[0]));
        int first = intervals[0][0];
        int second = intervals[0][1];
        for(int i[] : intervals){
            if(i[0]  <= second){
                second = Math.max(second, i[1]);
            }
            else{
                res.add(new int[]{first, second});
                first = i[0];
                second = i[1];
            }
        }
        res.add(new int[]{first, second});
        return res.toArray(new int[0][]);
    }
}
