package oop.assets;

public class PersonChild extends Person {
    // determine which one is default constructor
    public PersonChild(String name, String address, int age) {
        // set parent's properties
        super(name, address, age);
    }

    @Override
    public void showProfile() {
        System.out.println("name child : " + name);
        System.out.println("address child : " + address);
        System.out.println("age child : " + age);
        System.out.println(PersonEnum.ASSISTANT.getDescription());

        // call parent's function
        super.showProfile();
        super.showAddress();
    }
}
