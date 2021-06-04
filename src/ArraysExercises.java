import java.util.Arrays;


public class ArraysExercises {


public static Person[] addPerson(Person[] arr, Person addPerson) {
    Person[] newArr = Arrays.copyOf(arr, arr.length + 1);
    newArr[arr.length] = addPerson;
    return newArr;
}

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3, 4, 5};
// we need Arrays.toString to show the data within the numbers array because numbers alone just refers to the array object.
        System.out.println(Arrays.toString(numbers));


        Person[] people = new Person[3];

        Person person1 = new Person("Jim");
        Person person2 = new Person("Bob");
        Person person3 = new Person("Greg");


        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

        Person[] morePeople = new Person[2];

        Person person4 = new Person("Phil");
        Person person5 = new Person("Dave");

        morePeople[0] = person4;
        morePeople[1] = person5;

        morePeople = addPerson(morePeople, person1);
        morePeople = addPerson(morePeople, person2);
        morePeople = addPerson(morePeople, person3);




        for (Person person : morePeople) {
            System.out.println(person.getName());
        }



    }
}
