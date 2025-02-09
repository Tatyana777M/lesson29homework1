public class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public static int comparePersons(Person p1, Person p2) {
            return p1.age - p2.age;
        }
        @Override
        public String toString() {
            return name + " (" + age + " years)";
        }
        public static void bubbleSort(Person[] people) {
            int a = people.length;
            for (int i = 0; i < a - 1; i++) {
                for (int j = 0; j < a - 1 - i; j++) {
                    if (Person.comparePersons(people[j], people[j + 1]) > 0) {
                        Person temp = people[j];
                        people[j] = people[j + 1];
                        people[j + 1] = temp;
                    }
                }
            }
        }
    }
