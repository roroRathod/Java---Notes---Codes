class Counter implements Runnable {
    private int c = 0;

    public void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        c++;
    }

    public void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }

    @Override
    public void run() {
        synchronized (this) {
            this.increment();
            System.out.println("Value after increment " +
                    Thread.currentThread().getName() + " " + this.getValue());
            this.decrement();
            System.out.println("Value at last " +
                    Thread.currentThread().getName() + " " + this.getValue());
        }
    }
}
