import assets.Person;
import assets.PersonChild;
import utils.Validate;

public class OOP {
    public static void main(String[] args) {
        Person person = new Person("Dicky Julian", "Malang");
        person.showProfile();

        PersonChild personChild = new PersonChild("Marsha Lenathea", "Jakarta", 16);
        personChild.showProfile();

//        Person emptyPerson = new Person();
        Validate.validateAll();
    }
}