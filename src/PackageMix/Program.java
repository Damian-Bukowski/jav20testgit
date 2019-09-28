package PackageMix;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Person person1 = new Person ("Artur",15, "mężczyzna");
        Person person2 = new Person ("Basia",30, "kobieta");
        Person person3 = new Person ("Paweł",20, "mężczyzna");
        Person person4 = new Person ("Kasia",25, "kobieta");
        Person person5 = new Person ("Marcin",101, "mężczyzna");

            ArrayList<Person> list = new ArrayList();
            list.add(person1);
            list.add(person2);
            list.add(person3);
            list.add(person4);
            list.add(person5);
        }
    }
