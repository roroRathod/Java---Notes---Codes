// class Main {
//     public static void main(String args[]) {
//         Animal parent = new Dog();
//         parent.eat();

//         Dog d = (Dog) parent;
//         d.bark();
//     }
// }

// Safe downcasting using instanceof
class Main {
    void doSomething(Animal a) {
        a.eat();
        if (a instanceof Dog) {
            Dog d = (Dog) a;
            d.bark();
        }
    }

    public static void main(String args[]) {
        Main main = new Main();
        main.doSomething(new Animal());
        main.doSomething(new Dog());
    }
}
