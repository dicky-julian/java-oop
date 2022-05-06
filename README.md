### OOP (Object Oriented Programming)
#
#### **Object**
something contains field / **properties** / attributes and method / **function** / behavior.   
In **Java**, all non-primitive data are object like Integer, Boolean, Character, String, etc.

```
Object myObject = new Object();
```

#
#### **Class**
blueprint or prototype to create **object**, that declare all object's properties and function.

```
class MyClass {
  // define property
  String myProp;
  
  // define function
  String myFunction() { ... }
}
```
#
#### **Constructor**
a method that called first when the object is initiated.

```
class MyClass {
  String myProp1;

  // constructor's name must be like class name
  MyClass(String args1) {
    this.myProp1 = args1;
  }
}
```

access constructor when initiate object
> MyClass myObject = new MyClass("first property");

we can also do overload to constructor like function in general

```
class MyClass {
  MyClass(String args1) { ... }
  
  // overloading constructor
  MyClass(String args1, String args2) { ... }
  
  // another overloading constructor
  MyClass() { ... }
}
```
access second constructor

> MyClass myObject2 = new MyClass("args1", "args2")

access thrid constructor
> MyClass myObject3 = new MyClass();
#
#### **Method Overriding**
something to redeclare method in child class, like existed method in parent class. It's difference with overloading that redeclare method in same class, but with difference parameter.

```
class ParentClass {
  void sayHello(String message) { ... }
  
  // overloading
  void SayHello(String message, String subject) { ... }
}

class ChildClass extends ParentClass {

  // overriding
  void sayHello(String message) { ... }
}
```
#
#### **Access Modifier**
![6d04cb1f3d9bec908170c21dcfa8b4f3a387fb6ced77ab8aa970e88efed4bd70-image](https://user-images.githubusercontent.com/63696803/167206497-8c787506-99ba-4e6b-a762-3a5d88333462.png)
#
#### **Inheritance**
something to inherit class's properties (parent) to another class (child).

```
// with extends parent class, all parent 
   class's properties will belong to child class.
   
class ChildClass extends ParentClass { ... }
```
#
#### **Polymorphism**
describes situations in which something occurs in several different forms. It describes the concept that you can access objects of different types through the same interface.
```
class ParentClass { ... }
class ChildClass extends ParentClass { ... }
class GrandChildClass extends ChildClass { ... }

// with polymorphism, we can use three class above as same object

ParentClass myClass = new ParentClass();
myClass = new ChildClass();
myClass = new GrandChildClass();
```
#
#### **Abstract Class**
it's like another general class, but abstract class can't be implemented as object (instantiated), but only inherited.

```
abstract class ParentClass { ... }

class ChildClass extends ParentClass { ... }
```
#
#### **Abstract Method**
it's like define a method, but without body/block method. When inheritance of abstract method's class define, it's must do override.

```
public class ParentClass {
  // define abstract method without block
  public abstract void myFunction();
}

public class ChildClass extends ParentClass {
  // must be override
  public void myFunction() { ... }
}
```
#
#### **Interface**
interface is like a contract for child class (class that implements the interface). All method in interface will be public abstract automatically.

```
public interface MyInterface {
  void myFunction();
  int myIntFunction();
}

public ChildClass implements MyInterface {
  public void myFunction() { ... }
  public int myIntFunction() { ... }
}
```
we can also extends interface with a another interface or more.
```
public interface MyInterface 
  extends MyInterface1, MyInterface2 { ... }
```

instead of having to define one by one interface functions on every implementation classes, we can implement default method.

```
public interface MyInterface {
  default String myDefaultFunction() {
    return "Ini adalah default method ...";
  }
}
```
#
#### **Equals Method**
java can't compare non-primitive data with operator "==", we can do that with equals method, but it will only compare based on their memory position, override equals highly recommend.

```
// Product is class (just for example)

@override
public boolean equals(Object o) {
  if (this == o) {
    return true;
  }
  
  if (!(o instanceof Product)) {
    return false;
  }
  
  Product product = (Product) o;
  
  if (price != product.price) {
    return false;
  }
  
  return name != null ?
    name.equals(product.name) : 
    product.name == null
}
```
#
#### **Exception Class**
exception is error representation. Java already provides exception, but we can still create our own exception with extends class Throwable or its inheritance.

```
class ValidationError extends Throwable {
  ValidationError(String message) {
    super(message);
  }
}
```
we can access exception with 'throws'

```
public class ValidationUtil {
  public void validate(User user) throws ValidationError, NullPointerException {
    if (user == null) {
      throw new NullPointerException("user not found");
    } else if (user.getName() == null) {
      throw new ValidationError("username is empty")
    }
  }
  
  public void doValidate() {
    try {
      User user = new User(null, null);
      validate(user);
    } catch (NullPointerException | ValidationException exception) {
      System.out.println(exception.getMessage());
    }
  }
}
```
