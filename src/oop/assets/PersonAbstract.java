package oop.assets;

public abstract class PersonAbstract implements PersonInterface {
    public String name, address;
    public int age;

    // declare abstract method
    public abstract void showProfile();
    public abstract void showName();
    // BUT, when we implement interface to abstract class,
    // we don't need to declare interface method.
    // So, we can delete it.
}
