import java.util.ArrayList;

public class PascalsTriangle {
	public static ArrayList<ArrayList<Long>> printPascal(int n) {
        // Write your code here.
		ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
		ArrayList<Long> curr, prev = null;
		for(int i = 0;i < n;i++){
			curr = new ArrayList<Long>();
			for(int j = 0;j <= i;j++){
				if(j == 0 || j == i){
					curr.add(1L);
				}
				else{
					curr.add(prev.get(j-1) + prev.get(j));
				}
			}
			prev = curr;
			ans.add(curr);
		}
		return ans;
	}
}
