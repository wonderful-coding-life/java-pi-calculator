public class Pi {
    public static void main(String[] args) {
        PiCalculator calc = new PiCalculator();
        System.out.println("Test Single-thread");
        for (int i = 0; i < 10; i++) {
            calc.run();
        }

        System.out.println("Test Multi-thread");
        PiCalculator[] piCalc = new PiCalculator[10];
        for (int i = 0; i < 10; i++) {
            piCalc[i] = new PiCalculator();
            piCalc[i].start();
        }
    }
}
