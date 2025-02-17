# JavaSmall
simple java exercises using jshell


## Lab Brief

Learn to use `jshell` to run Java code.

## Steps

### Startup `jshell`

1. Open a terminal
2. Type `jshell`
3. Type `System.out.println("Hello, World!");`
4. Type `int x = 5;`
5. Type `x`
6. Type `x + 5`
7. Type `x`
8. Type `x = x + 10`
9. Type `x`
10. Type `println(String s) { System.out.println(s); }`
11. Type `println("your name here!");`

Let's save this script to a file.

```java
/save helloWorld.java
```

and then exit `jshell`. Use `/exit` or `Ctrl-D`.

## Section 0

**In the steps below, you will be using `jshell` to run Java code.**

**Start training your brain by TYPING the code into `jshell`. DO NOT COPY AND PASTE.**

**CopyPasta is the enemy of learning. It's cheating yourself. And at this point, it's cheating in this course.**


### Using `jshell` to run a simple Java program

Start `jshell` and type the following code:

Let's use a simple while loop to print out the numbers from 1 to 10.

```java
int i = 1;
while (i <= 10) {
    System.out.println(i);
    i++;
}
```

Now TYPE it into `jshell`. Notice how when you type `return` after that `}` the loop will run.

## Section 1

### Using `jshell` to run a simple Java program with a method

A method in `jshell` is a little different than a method in a Java program.
In `jshell`, you don't need a class to define a method.

A method is a block of code that performs a specific task.
You use methods so you don't have to write the same code over and over again.
(Programmers like to be lazy and efficient that way.)

Let's create a simple method to print out the numbers from 1 to 10.

```java
void printNumbers() {
    int i = 1;
    while (i <= 10) {
        System.out.println(i);
        i++;
    }
}
```

Now TYPE it into `jshell`.
and **invoke** the method by typing `printNumbers();` and then `return` key.

### Using `jshell` to run a simple Java program with a method that takes a parameter

Let's use a simple method to print out the numbers from 1 to `n`.

```java
void printNumbers(int n) {
    int i = 1;
    while (i <= n) {
        System.out.println(i);
        i++;
    }
}
```

Now TYPE it into `jshell`.
and **invoke** the method by typing `printNumbers(5);` and then `return` key.
and then `printNumbers(10);` and then `return` key.
and then  `printNumbers(20);` and then `return` key.

### Using `jshell` to run a simple Java program with a method that takes a parameter and returns a value

Let's use a simple method to return the sum of the numbers from 1 to `n`.

```java
int sumNumbers(int n) {
    int i = 1;
    int sum = 0;
    while (i <= n) {
        sum = sum + i;
        i++;
    }
    return sum;
}
```

Now TYPE it into `jshell`.
and **invoke** the method by typing `sumNumbers(5);` and then `return` key.
and then `sumNumbers(11);` and then `return` key.
and then  `sumNumbers(23);` and then `return` key.
and then  `sumNumbers(5683);` and then `return` key.
and then  `sumNumbers(106839);` and then `return` key.

### Using `jshell` to run a simple Java program with a method that takes a parameter and returns a value and uses a for loop

Let's use a simple method to return the sum of the numbers from 1 to `n`.

```java
int sumNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum = sum + i;
    }
    return sum;
}
```

Now TYPE it into `jshell`.
and **invoke** the method by typing `sumNumbers(5);` and then `return` key.
and then `sumNumbers(10);` and then `return` key.
and then `sumNumbers(20);` and then `return` key.
and then  `sumNumbers(106839);` and then `return` key.

### Using `jshell` to run a simple Java program with a method that takes a parameter and returns a value and uses a for loop and a method that calls the first method

Let's use a simple method to return the sum of the numbers from 1 to `n`.

```java
int sumNumbers(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
        sum = sum + i;
    }
    return sum;
}

int sumNumbersTo10() {
    return sumNumbers(10);
}
```

Now TYPE it into `jshell`.
and **invoke** the method by typing `sumNumbersTo10();` and then `return` key.

### Use jshel to save the code to a file

```java
/save sumNumbers.java
```

### Use jshell to load the code from a file

```java
/open sumNumbers.java
```

### Use jshell to edit the code

```java
/edit sumNumbers.java
```

in the popup window, make a change, and then save the file.
add a `sumNumbersTo13` method that calls `sumNumbers(13)`.

_No, I'm not giving you that code, you have to write it yourself._

when done, click the `exit` button in the popup window.

now, run the `sumNumbersTo13` method in `jshell`.

### Use jshell to save the code to a file

```java
/save sumNumbers.java
```

### Write a few methods that takes a parameter and returns a value

Write a method that takes a parameter and returns a value.

```java
int addTwoNumber(int x, int y) {
    return 0; // fix this
}
```

Now TYPE it into `jshell`.
and **invoke** the method by typing `addTwoNumber(5, 10);` and then `return` key.
Notice how the answer is wrong. Fix the method by using `/edit` and then run it again.

Now `/edit` and create 3 methods that takes two parameters and returns a math operation of the two numbers.

1. divide `divideTwoNumbers(int x, int y)`
2. multiply `multiplyTwoNumbers(int x, int y)`
3. subtract `subtractTwoNumbers(int x, int y)`

Save the changes.

## Section 2

Let's do some methods with if statements.

### Write a method that takes a parameter and returns a value

Write a method that takes a parameter and returns a value.

```java
int isEven(int x) {
    return 0; // fix this
}
```

Now TYPE it into `jshell`.

and **invoke** the method by typing `isEven(5);` and then `return` key.

Notice how the answer is wrong. Fix the method by using `/edit` and then run it again.
(what might be wrong with the method?) maybe `if` the number is even, return `1`, otherwise return `0`.

But, what if we want to return a `boolean` instead of an `int`?

### Write a method that takes a parameter and returns a boolean

Write a method that takes a parameter and returns a boolean.

```java
boolean isEven(int x) {
    return false; // fix this
}
```

Now TYPE it into `jshell`.

and **invoke** the method by typing `isEven(5);` and then `return` key.
So... what's wrong with the method? maybe `if` the number is even, return `true`, otherwise return `false`.

### Write a method that takes a parameter and returns a boolean

Write a method that takes a parameter and returns a boolean.

```java
boolean isOdd(int x) {
    return false; // fix this
}
```

Now TYPE it into `jshell`.
and **invoke** the method by typing `isOdd(5);` and then `return` key.

## Lets talk about odd and even numbers

How can we tell if a number is odd or even? The most common way is to use the modulo operator `%`.

See how it works:

```java
var x = 5;
var y = 2;
x % y
```

What does it return? What does it mean?

now write a while loop that prints out the numbers from 1 to 10 and prints out the modulo of each number with 2.

```java
int i = 1;

while (i <= 10) {
    System.out.println(i + " % 2 = " + i % 2);
    i++;
}
```

Now TYPE it into `jshell`.

Hmm. It appears that the `%` (mod or modulo) operator returns `0` if the number is even and `1` if the number is odd.

How can we use that in isEven and isOdd methods?

### Write isOdd and isEven methods using the modulo operator

You'll need an if statement to check if the number is even or odd.

```java
boolean isEven(int x) {
    return x % 2 == 0;
}
```

And now you write the isOdd method. Remember `!=` means "not equal to".

You could also use `==` and make the 0 a 1, right?

Hey, why not do a /save?

```java
/save sumNumbers.java
```

### Write a method that prints "odd" or "even" for the numbers from 1 to 10

Write a method that prints "odd" or "even" for the numbers from 1 to 10.

```java
void printOddEven() {
    int i = 1;
    while (i <= 10) {
        if (isEven(i)) {
            System.out.println(i + " is even");
        } else {
            System.out.println(i + " is odd");
        }
        i++;
    }
}
```

see the `else` part? what if you remove it?
(puzzle over it in your mind. c'mon experiment!)

Now TYPE it into `jshell`.

## Ok, enough here

You've done a lot of work. You've learned a lot about `jshell` and Java methods.
Make sure you save it all to github.

```bash
git add .
git commit -m "done with jshell and JavaSmall"
git push
```

Now, switch to `VARS.md` and learn about variables in Java.
