class X extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 30; i++) {
            System.out.println("inside run method " + i);
        }
        System.out.println("end of run() method");
    }

    public static void main(String[] args) {
        X x1 = new X();
        // x1.run(); // normal method call
        x1.start(); // starts a new thread

        for (int i = 25; i < 60; i++) {
            System.out.println("inside main method " + i);
        }
        System.out.println("end of main()");
    }
}
