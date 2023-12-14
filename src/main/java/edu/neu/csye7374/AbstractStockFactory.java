package edu.neu.csye7374;

public abstract class AbstractStockFactory {
    public abstract StockAPI getObject(String name, double price, String desc, double bid, String typeTrade);
}
