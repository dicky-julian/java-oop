package oop.assets;

public interface PersonInterface {
    // function as default will determine as public abstract
    void showProfile();
    void showName();

    // define function which isn't mandatory (isn't abstract)
    default void showAddress() {
        System.out.println("Show Address");
    }
}
