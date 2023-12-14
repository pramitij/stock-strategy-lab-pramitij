package edu.neu.csye7374;

import java.util.concurrent.ThreadLocalRandom;

public class AbstractPositiveMetricStrategySingleton implements MetricStrategyAPI {
    private static AbstractPositiveMetricStrategySingleton instance;

    private AbstractPositiveMetricStrategySingleton() {
        super();
        instance=null;
    }

    public static synchronized AbstractPositiveMetricStrategySingleton getInstance() {
        if (instance == null) {
            instance = new AbstractPositiveMetricStrategySingleton();
        }
        return instance;
    }


    @Override
    public int calculateMetric() {
        // TODO Auto-generated method stub
        int number = (int)((ThreadLocalRandom.current().nextInt(1, 40 + 1)*2.5)/2.99);
        return number;
    }
}
