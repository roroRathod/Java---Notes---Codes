class Main {
    public static void main(String[] args) throws InterruptedException {
        A a1 = new A();
        Thread t = new Thread(a1);

        t.start();
        t.join();

        int result = a1.sum;
        for (int i = 0; i < 10; i++) {
            System.out.println("inside main thread...");
            System.out.println(result);
        }
    }
}
