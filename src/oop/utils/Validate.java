package oop.utils;
import oop.assets.*;

import java.io.BufferedReader;
import java.io.FileReader;

public class Validate {
    public static void main(String[] args) {
        // try with resource
        try (BufferedReader reader = new BufferedReader(new FileReader("README.md"))) {
            while (true) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Throwable e) {
            System.out.println("Error membaca file : " + e.getMessage());
        }
    }

    public static void validateAll() {
        try {
            String[] person = { "Dicky", "Julian" };
            System.out.println(person[100]);
        } catch (Throwable e) {
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            e.printStackTrace();
        }
    }

    public static void validateUsername(Person person) {
        try {
            validate(person.name);
            System.out.println("Data Valid");
        } catch (PersonException e) {
            System.out.println("Data Tidak Valid : " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Data null : " + e.getMessage());
        } finally {
            System.out.println("validation done!");
        }
    }

    // run time exception tidak butuh try/catch block
    public static void validateAddress(Person person) {
        validateRuntime(person.address);
    }

    public static void validateAge(Person person) {
        validateError(person.age);
    }

    public static void validate(Object username) throws PersonException, NullPointerException {
        if (username == null) {
            throw new NullPointerException("Username is null");
        } else if (username == "") {
            throw new PersonException("Username is empty");
        }
    }

    public static void validateRuntime(Object address) {
        if (address == null) {
            throw new NullPointerException("Alamat is null");
        } else if (address == "") {
            throw new PersonRuntimeException("Alamat is empty");
        }
    }

    public static void validateError(int age) {
        if (age == 0) {
            throw new PersonError("Umur tidak boleh kosong");
        }
    }
}
