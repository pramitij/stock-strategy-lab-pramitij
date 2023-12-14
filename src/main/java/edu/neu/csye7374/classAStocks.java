package edu.neu.csye7374;

import java.util.concurrent.ThreadLocalRandom;

public class classAStocks extends StockAPI {
    public classAStocks() {}
    public classAStocks(String name, double price, String desc, double bid, String typeTrade) {
        super(name, price, desc, bid, typeTrade);
    }

    public  double getBid() {
        int rand1= ThreadLocalRandom.current().nextInt(190, 270 + 1);
        return rand1;
    }

    @Override
    public void setBid(double Price) {
        // TODO Auto-generated method stub
        super.setBid(Price);
    }

    @Override
    public  int getMetric() {
        // TODO Auto-generated method stub
        int n = (ThreadLocalRandom.current().nextInt(-30, 30 + 1)*5)/4;
        return n;
    }
}
