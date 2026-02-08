public class Demo {
    // method with class as parameter
    void fun1(A a1) { // here to call this method we can pass 3 possible values
        // 1. same class obj, 2. child class obj, 3. null
        System.out.println("inside fun1 of Demo");
        System.out.println("the value of a1 is : " + a1);
        a1.funA();
    }

    public static void main(String[] args) {
        Demo d1 = new Demo();
        // A a5 = new A();
        // d1.fun1(a5);
        d1.fun1(new A());
    }
}
