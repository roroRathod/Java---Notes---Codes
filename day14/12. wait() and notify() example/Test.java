class Test {
    public static void main(String[] args) throws Exception {
        MyThread mt = new MyThread();
        mt.start();

        synchronized (mt) {
            System.out.println("main thread calling wait()");
            mt.wait();
            System.out.println("main thread got notification");
            System.out.println(mt.num);
        }
    }
}
