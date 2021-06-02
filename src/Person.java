public class Person {
    private String name;
// Constructor
    public Person(String name) {
        this.name = name;
    }
// Getter
    public String getName() {
        return name;
    }
// Setter
    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello, " + getName() + ".");
    }

    public static void main(String[] args) {
        Person person1 = new Person("Birdperson");
//        Person person2 = new Person("Birdperson");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Rick");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        System.out.println(person1.getName());
//        person1.setName("Rick");
//        person1.sayHello();

    }
}
