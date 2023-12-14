package edu.neu.csye7374;

public class classAStockSingletonFactory extends AbstractStockFactory{

    private static classAStockSingletonFactory instance=new classAStockSingletonFactory();

    private classAStockSingletonFactory() {}

    public static AbstractStockFactory getInstance() {
        return instance;
    }

    @Override
    public StockAPI getObject(String name, double price, String desc, double bid, String typeTrade) {
        return new classAStocks(name,price,desc,bid,typeTrade);
    }
}
