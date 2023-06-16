import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> permutation) 
	{
		// Write your code here.
		if(permutation.size() <= 1)
			return permutation;
		int i = permutation.size() - 2;
		while(i >= 0 && permutation.get(i) >= permutation.get(i + 1))
			i--;
		if(i >= 0){
			int j = permutation.size() - 1;
			while(permutation.get(j) <= permutation.get(i))
				j--;
			Collections.swap(permutation, i, j);
		}
		Collections.reverse(permutation.subList(i + 1, permutation.size()));

		return permutation;
	}
}