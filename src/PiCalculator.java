public class PiCalculator extends Thread {
    public void run() {
        double Pi = 0.0;
        long start = System.currentTimeMillis();
        for (double i = 1; i < 100000000; i++) {
            Pi += (i % 2 == 0) ? -1 / (2 * i - 1) : 1 / (2 * i - 1);
        }
        long stop = System.currentTimeMillis();
        System.out.println("Calculated PI = " + (Pi * 4) + ", time elapsed = " + (stop-start));
    }
}
