package kata1;

import java.util.Date;
import java.util.Scanner;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Christian", new Date(96, 11, 15));
        System.out.println(person.getName() + " tiene " + person.getAge() + " años.");
    }

}
