import java.util.ArrayList;

public class BuynSellStocks{
    public static int maximumProfit(ArrayList<Integer> prices){
        // Write your code here.
        int profit = 0, buy = prices.get(0);
        for(int i = 1;i < prices.size();i++){
            if(prices.get(i) < buy){
                buy = prices.get(i);
            }
            else{
                profit = Math.max(profit, prices.get(i) - buy);
            }
        }
        return profit;
    }
}