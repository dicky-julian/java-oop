package oop.assets;

@PersonAnnotation(name="person")
public class Person extends PersonAbstract {
    // You can access this static property without define object class
    public static final String ROLE = "Assistant Manager",
            COMPANY_NAME = "Indonesia National Single Window",
            TERM_TYPE = "Pegawai Tetap";

    public Person(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    // @Overloading constructor
    public Person(String name, String address) {
        this(name, address, 0);
    }

    public Person() {
        this(null, null, 0);
    }

    public void showProfile() {
        System.out.println(name + " * " + address + " * " + age);
    }

    public void showName() {
        System.out.println("name : " + name);
    }

    @Override
    public void showAddress() {
        System.out.println("address : " + address);
    }

    // final method can't override by child
    final public void showAge() {
        System.out.println("age : " + age);
    }


}