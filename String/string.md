## 1. String creation using literal

```java
String message = "Welcome to Masai";
```

```java
String s = "Welcome";
```

---

## 2. String literal memory example (`==`)

```java
String s1 = "Welcome";
String s2 = "Welcome";

if (s1 == s2)
    System.out.println("same");
else
    System.out.println("not same");
```

---

## 3. String creation using `new` keyword

```java
String s1 = new String("Welcome");
```

```java
String s1 = new String("Welcome");
String s2 = new String("Welcome");

if (s1 == s2)
    System.out.println("same");
else
    System.out.println("not same");
```

---

## 4. String constructor using byte array

```java
byte[] bytes = {100, 101, 102};
String str = new String(bytes);
System.out.println(str);
```

---

## 5. String constructor using char array

```java
char chars[] = {'M', 'a', 's', 'a', 'i'};
String s = new String(chars);
System.out.println(s);
```

---

## 6. String constructor using StringBuffer

```java
StringBuffer sbuffer = new StringBuffer("Masai");
String s = new String(sbuffer);
```

---

## 7. String constructor using StringBuilder

```java
StringBuilder sbuilder = new StringBuilder("Masai");
String s = new String(sbuilder);
```

---

## 8. String concatenation examples

```java
String name = "Java ";
System.out.println("Student Name is : " + name);
```

```java
System.out.println("Hello" + 10 + 20 + "Welcome");
```

---

## 9. String immutability example (no reassignment)

```java
String message = "Welcome";
message.concat(" user");
System.out.println(message);
```

---

## 10. String immutability example (with reassignment)

```java
String message = "Welcome";
String newMessage = message.concat(" user");

System.out.println(message);
System.out.println(newMessage);
```

---

## 11. StringBuilder append example

```java
StringBuilder z = new StringBuilder("start");
z.append("le");
System.out.println(z);
```

---

## 12. StringBuilder modification example

```java
StringBuilder message = new StringBuilder("Welcome");
message.append(" to Masai");
System.out.println(message);
```

---

## 13. String comparison using `==`

```java
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

System.out.println(s1 == s2);
System.out.println(s1 == s3);
```

---

## 14. String comparison using `compareTo()`

```java
String s1 = "Sachin";
String s2 = "Sachin";
String s3 = "Ratan";

System.out.println(s1.compareTo(s2));
System.out.println(s1.compareTo(s3));
System.out.println(s3.compareTo(s1));
```

---

## 15. Scanner – read a line of text

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("My name is " + name);
    }
}
```

---

## 16. Scanner – read integers

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        int num1 = scanner.nextInt();

        System.out.println("Enter number 2: ");
        int num2 = scanner.nextInt();

        System.out.println("Result is : " + (num1 + num2));
    }
}
```

---

## 17. Scanner `next()` example

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String value = scanner.next();

        System.out.println("Using next(): " + value);
        scanner.close();
    }
}
```

---

## 18. Scanner `nextLine()` example

```java
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String value = scanner.nextLine();

        System.out.println("Using nextLine(): " + value);
        scanner.close();
    }
}
```

