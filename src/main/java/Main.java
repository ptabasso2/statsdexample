import com.timgroup.statsd.NonBlockingStatsDClientBuilder;
import com.timgroup.statsd.StatsDClient;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {

        // Instantiate a StatsDClient object
        StatsDClient Statsd = new NonBlockingStatsDClientBuilder()
                .prefix("statsd")
                .hostname("localhost")
                .port(8125)
                .build();

        // Increment counter
        for (int i = 0; i < 10; i++) {
            Statsd.incrementCounter("example_metric.increment", new String[]{"environment:dev"});
            Statsd.decrementCounter("example_metric.decrement", new String[]{"environment:dev"});
            Statsd.count("example_metric.count", 2, new String[]{"environment:dev"});
            System.out.println("Counter iteration: " + i);
            Thread.sleep(5000);
        }

        // Emit  gauge
        for (int i = 0; i < 10; i++) {
            Statsd.recordGaugeValue("example_metric.gauge", i, new String[]{"environment:dev"});
            System.out.println("Gauge iteration: " + i);
            Thread.sleep(10000);
        }


        // Submit Histogram
        for (int i = 0; i < 10; i++) {
            Statsd.recordHistogramValue("example_metric.histogram", new Random().nextInt(20), new String[]{"environment:dev"});
            System.out.println("Histogram iteration: " + i);
            Thread.sleep(2000);
        }

        // Record Distribution
        for (int i = 0; i < 10; i++) {
            Statsd.recordDistributionValue("example_metric.distribution", new Random().nextInt(20), new String[]{"environment:dev"});
            System.out.println("Distribution iteration: " + i);
            Thread.sleep(2000);
        }

        System.exit(0);

    }
}