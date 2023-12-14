package edu.neu.csye7374;

import java.util.concurrent.ThreadLocalRandom;

public class AbstractNegativeMetricStrategySingleton implements MetricStrategyAPI {

    private static AbstractNegativeMetricStrategySingleton instance;

    private AbstractNegativeMetricStrategySingleton() {
        super();
        instance=null;
    }

    public static synchronized AbstractNegativeMetricStrategySingleton getInstance() {
        if (instance == null) {
            instance = new AbstractNegativeMetricStrategySingleton();
        }
        return instance;
    }


    @Override
    public int calculateMetric() {
        // TODO Auto-generated method stub
        int number = (int)((ThreadLocalRandom.current().nextInt( -40 + 1,0)*2.5)/2.99);
        return number;
    }
}
