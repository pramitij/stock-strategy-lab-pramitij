package edu.neu.csye7374;

public class classBStockSingletonFactory extends AbstractStockFactory {

    private static classBStockSingletonFactory instance=new classBStockSingletonFactory();

    private classBStockSingletonFactory() {}


    public static AbstractStockFactory getInstance() {
        return instance;
    }

    @Override
    public StockAPI getObject(String name, double price, String desc, double bid, String typeTrade) {
        return  new classBStocks(name,price,desc,bid,typeTrade);
    }
}
