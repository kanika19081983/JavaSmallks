# Understanding Java Classes: A Guide to Creating a Person Class

## What is a Class?
A class is a blueprint or template that defines the properties (attributes) and behaviors (methods) that all objects of that type can have.

## The Person Class Step by Step Guide

### Step 1: Basic Class Structure
Here's how to create a simple Person class in jshell:

```java
class Person {
    String name;
    int age;
}
```

### Step 2: Creating a Constructor
A constructor helps initialize a new Person object with specific values:

```java
class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }
}
```

### Step 3: Creating Person Objects
Let's create some Person objects using our class:

```java
jshell> Person person1 = new Person("Alice", 25)
person1 ==> Person@7852e922

jshell> Person person2 = new Person("Bob", 30)
person2 ==> Person@4e25154f
```

### Step 4: Accessing Object Properties
You can access the properties of a Person object using dot notation:

```java
jshell> person1.name
$4 ==> "Alice"

jshell> person1.age
$5 ==> 25
```

### Step 5: Adding Methods
Let's add some methods to our Person class:

```java
class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + name);
    }

    void haveBirthday() {
        age = age + 1;
        System.out.println("Happy Birthday! " + name + " is now " + age);
    }
}
```

### Step 6: Using Methods
Now we can use these methods with our Person objects:

```java
jshell> person1.sayHello()
Hello, my name is Alice

jshell> person1.haveBirthday()
Happy Birthday! Alice is now 26
```

## Practice Exercise
Try creating your own Person class with:
1. Create the basic class structure
2. Add properties (name and age)
3. Create a constructor
4. Create two Person objects
5. Access their properties
6. Add and use methods

## Common Mistakes to Avoid
1. Forgetting to initialize variables in the constructor
2. Not using proper capitalization (class names should start with a capital letter)
3. Forgetting to use `new` when creating objects
4. Trying to access private variables directly

## Tips for Success
1. Always test your class by creating objects and using their methods
2. Use meaningful names for variables and methods
3. Keep your code organized and properly indented
4. Remember that each object is independent and has its own set of values

## Checking Your Work
You can use these jshell commands to verify your work:
- `/vars` - shows all variables
- `/methods Person` - shows all methods in the Person class
- `/list` - shows all code entered

## Extended Example
Here's a more complete Person class:

```java
class Person {
    String name;
    int age;

    // Constructor
    Person(String n, int a) {
        name = n;
        age = a;
    }

    // Method to print person details
    void printDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to check if person is adult
    boolean isAdult() {
        return age >= 18;
    }

    // Method to have birthday
    void haveBirthday() {
        age = age + 1;
        System.out.println("Happy Birthday! " + name + " is now " + age);
    }
}
```

Try using this extended example:
```java
jshell> Person person = new Person("John", 17)
jshell> person.printDetails()
jshell> System.out.println(person.isAdult())
jshell> person.haveBirthday()
jshell> System.out.println(person.isAdult())
```

This guide should give you a solid foundation for understanding
how to create and use classes in Java.
Remember to practice by creating your own variations of the Person
class and experimenting with different properties and methods.

Maybe add a method that sets and gets a person's "chirality" (left-handed or right-handed) or "handedness" (ambidextrous, left-handed, right-handed).
What type is variable would be best for this?
What would be the default value?

You have to add a veriable declaration for the handedness.
And add a getter and setter for the handedness.
Be sure to add a method to print out the handedness.

Save it in a file using `/save Person.jsh` and also do the trinity if github commands,

```bash
git add .
git commit -m "Add Person class work"
git push
```

## Conclusion

Classes and Objects are an essential part of object-oriented programming in Java.


Be sure to do commit of all this work to your GitHub repository.

```bash
touch finished.txt
git add .
git commit -m "Finished"
git push
```
