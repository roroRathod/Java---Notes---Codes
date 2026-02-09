@FunctionalInterface
interface Intr {
    void printDetails(Student student);
}

public class Main {
    public static void main(String[] args) {
        Intr i1 = s -> {
            System.out.println("Roll :" + s.getRoll());
            System.out.println("Name :" + s.getName());
            System.out.println("Marks :" + s.getMarks());
        };

        i1.printDetails(new Student(10, "Ram", 850));
    }
}
