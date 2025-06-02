# Ankhbayr
// HelloOOP.java

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.println("Сайн байна уу, миний нэр бол " + name + ", би " + age + " настай.");
    }
}

public class HelloOOP {
    public static void main(String[] args) {
        Person person = new Person("Анхбаяр", 17);
        person.greet();
    }
}

