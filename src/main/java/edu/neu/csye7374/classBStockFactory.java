package edu.neu.csye7374;

public class classBStockFactory extends AbstractStockFactory {

    @Override
    public StockAPI getObject(String name, double price, String desc, double bid, String typeTrade) {
        return new classAStocks(name,price,desc,bid,typeTrade);
    }
}
