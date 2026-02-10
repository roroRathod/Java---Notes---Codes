import java.io.Serializable;

public class Student implements Serializable {
    int id;
    transient int age;

    Student(int id, int age){
        this.id = id;
        this.age = age;
    }
}