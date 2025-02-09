public class Main {
    public static void main(String[] args) {
            Person[] people = {
                    new Person("Jack", 45),
                    new Person("Ann", 35),
                    new Person("John", 20),
                    new Person("Mary", 25),
            };
            System.out.println("Before sorting:");
            for (Person p : people) {
                System.out.println(p);
            }
            Person.bubbleSort(people);
            System.out.println("\n");
            System.out.println("After sorting:");
            for (Person p : people) {
                System.out.println(p);
            }
        }
    }

