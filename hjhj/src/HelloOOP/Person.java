package HelloOOP;
    public class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void greet() {
        System.out.println("Sain baina uu! Minii ner:" + name + ", Bi " + age + " nastai.");
    }
}


