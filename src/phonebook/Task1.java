package phonebook;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {

        Random r = new Random();

        Phonebook phonebook = new Phonebook();
        phonebook.addPhone(new FullName("Ivanov","Ivan"),"89997778888");
        phonebook.addPhone(new FullName("Petrov","Petr"),"89997775555");
        phonebook.addPhone(new FullName("Pet","Pet"),"89997774444");
        phonebook.addPhone(new FullName("Setrov","Setr"),"89997773333");
        phonebook.addPhone(new FullName("Getrov","Getr"),"89997772222");
        phonebook.addPhone(new FullName("Metrov","Metr"),"89997771111");
        System.out.println(phonebook);

    }

}
