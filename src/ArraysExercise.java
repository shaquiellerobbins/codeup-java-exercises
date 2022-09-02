import java.util.Arrays;

public class ArraysExercise {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];
        System.out.println(Arrays.toString(people));

        people[0] = new Person("Bob");
        people[1] = new Person("Sue");
        people[2] = new Person("Tom");

        for(Person person : people) {
            System.out.println(person);
        }

        people = addPerson(people, new Person("Lou"));
        for(Person person : people) {
            System.out.println(person);
        }

    }

    private static Person [] addPerson(Person [] people, Person newPerson) {

        Person [] newArray = Arrays.copyOf(people, people.length + 1);


        newArray[newArray.length - 1] = newPerson;


        return newArray;
    }
}