class A implements Runnable {
    int sum;

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("inside A thread");
            sum = sum + i;
        }
    }
}
