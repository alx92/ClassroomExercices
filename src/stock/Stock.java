package stock;

public class Stock {

    private String symbol;
    private String stock;
    private double closingPrice;
    private double currentPrice;
   // private double precedentClosingPrice;

    public Stock(String symbol, String stock) {
        this.symbol = symbol;
        this.stock = stock;
    }
    // Formula for getting percent change: subtract the old price(closingPrice)
    // from the new price(currentPrice)
    // and divide the difference by the old price(closingPrice).
    // Then, multiply by 100 to get the percent change.
    public double getChangePercent(double closingPrice, double currentPrice) {
        return (currentPrice - closingPrice) / closingPrice * 100;
    }
}

