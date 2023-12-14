package edu.neu.csye7374;

import java.util.Random;

public class StockAPI implements Tradable{

    private double price;
    private String name;
    private String desc;
    private double bid;
    private String typeTrade;

    public StockAPI() {}

    public StockAPI(String Name, double price, String desc, double bid, String typeTrade) {
        super();
        name = Name;
        this.price = price;
        this.desc = desc;
        this.bid = bid;
        this.typeTrade = typeTrade;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        int metric = getMetric();
        this.price = price+metric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getBid() {
        return bid;
    }

    public String getTypeTrade() {
        return typeTrade;
    }

    public void setTypeTrade(String typeTrade) {
        this.typeTrade = typeTrade;
    }

    @Override
    public void setBid(double bid) {
        this.bid = bid;
    }

    @Override
    public int getMetric() {

        double metric =0.0;
        Random num = new Random(System.currentTimeMillis());
        for (int i=0; i<10; i++)
        {
            metric= metric + num.nextDouble();
        }
        double average =  metric/10;
        double difference = average - this.getPrice();
        return (int) difference;
    }

    @Override
    public String toString(){
        return "StockAPI being traded: "+this.name+" - "+this.desc+" priced at: " +this.price+" with Metric :" +this.getMetric()+"\n";
    }

}
