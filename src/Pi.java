public class Pi implements PiCallback {
    public static void main(String[] args) {
        Pi pi = new Pi(10);
        pi.performPiCalculation();
    }

    public Pi(int max) {
        this.max = max;
    }

    public void performPiCalculation() {
        PiCalculator calc = new PiCalculator(this);
        System.out.println("Test Single-thread");
        count = 0;
        elapsed = 0;
        for (int i = 0; i < max; i++) {
            calc.run();
        }

        System.out.println("Test Multi-thread");
        PiCalculator[] piCalc = new PiCalculator[max];
        count = 0;
        elapsed = 0;
        for (int i = 0; i < max; i++) {
            piCalc[i] = new PiCalculator(this);
            piCalc[i].start();
        }
    }

    private int max = 0;
    private int count = 0;
    private long elapsed = 0;
    @Override
    public void elapsed(long elapsed) {
        this.elapsed += elapsed;
        count++;
        if (count == max) {
            System.out.println("average = " + this.elapsed / max);
        }
    }
}
