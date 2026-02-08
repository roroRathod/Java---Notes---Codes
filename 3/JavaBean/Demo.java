public class Demo {
    public static void main(String[] args) {
        // using zero argument constructor
        Student student1 = new Student();
        student1.setRoll(100);
        student1.setName("Ram");
        student1.setMarks(800);
        // using parameterized constructor
        Student student2 = new Student(101, "Ramesh", 850);
        System.out.println("Student1 details: ");
        student1.showDetails();
        System.out.println("Student2 details using getter methods");
        System.out.println("Roll is : " + student2.getRoll());
        System.out.println("Name is : " + student2.getName());
        System.out.println("Marks is : " + student2.getMarks());
    }
} 