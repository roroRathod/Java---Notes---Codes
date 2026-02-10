import java.util.concurrent.*;

class MyCallable implements Callable<Integer> {
    int num;

    MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName() +
                " calculating sum of first " + num + " numbers");
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        return sum;
    }
}
