package DSA_practice;

public class Buy_Sell_Stock {
    public  static int BuyAndSellStocks(int[] prices){

        int BuyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i=0; i< prices.length; i++){
            if (BuyPrice <  prices[i]){
                int profit = prices[i] - BuyPrice;//today's profit
               maxProfit =  Math.max(maxProfit, profit);
            }else {
              BuyPrice =   prices[i]; //today is the less price of stock buy it
            }
        }

        return maxProfit;

    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        //function call
       int Profit = BuyAndSellStocks(prices);
        System.out.println("Your Profit will be of Rupees "+Profit);
    }
}
