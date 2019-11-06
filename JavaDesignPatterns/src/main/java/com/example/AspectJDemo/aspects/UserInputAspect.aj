public aspect UserInputAspect {

    pointcut readInput() : call(String CommandLineInputScanner.readInput());

    before() : readInput() {
        System.out.println("AspectJDemo is waiting for an input...");
    }
}