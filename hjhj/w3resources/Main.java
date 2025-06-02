package hjhj.w3resources;


    
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ean Craig", 11);
        Person person2 = new Person("Evan Ross", 12);

        // Эхний гаралт (анхны хэв маягтай)
        System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old.\n");

        // greet() функц дуудах (шинэ нэмэлт)
        System.out.println("Greeting:");
        person1.greet();
        person2.greet();
        System.out.println(); // хоосон мөр

        // Өгөгдлийг өөрчлөх
        person1.setAge(14);
        person2.setName("Lewis Jordan");
        person2.setAge(12);

        // Шинэ гаралт
        System.out.println("Set new age and name:");
        System.out.println(person1.getName() + " is now " + person1.getAge() + " years old.");
        System.out.println(person2.getName() + " is now " + person2.getAge() + " years old.");

        // Шинэчилсэн greet() функц
        System.out.println("\nUpdated greeting:");
        person1.greet();
        person2.greet();
    }
}

