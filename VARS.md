# Java Variables Guide: A Beginner's Tutorial

This guide will help you understand different variable types in
Java using the jshell environment.
We'll explore int, boolean, double, and String variables
with practical examples.

## Getting Started with jshell
To begin:
1. Open your terminal/command prompt
2. Type `jshell` and press Enter
3. You should see the jshell prompt: `jshell>`

## Integer (int) Variables
**Definition:** An integer variable stores whole numbers without decimal points.

**How to declare:**
```java
int variableName;
int variableName = value;
```

**TYPE into jshell:**
```java
jshell> int age = 25
age ==> 25

jshell> int score = 100
score ==> 100

jshell> int negative = -10
negative ==> -10

jshell> int sum = age + score
sum ==> 125
```

Type `/vars` to see all declared variables.

### Save your work

Save the work in a file using `/save vars.jsh`.
and then exit `jshell` using `/exit` or `Ctrl-D`.

Now, save the repo to your GitHub account.

```bash
git add .
git commit -m "Add Java Variables Guide"
git push
```

Go to a browser and navigate to your GitHub account to see the changes in this repository.

Okay go back to the terminal and let's continue.

## Boolean Variables
**Definition:** A boolean variable stores true/false values.

**How to declare:**
```java
boolean variableName;
boolean variableName = true/false;
```

**TYPE into jshell:**
```java
jshell> boolean isStudent = true
isStudent ==> true

jshell> boolean hasPassedExam = false
hasPassedExam ==> false

jshell> boolean result = 10 > 5
result ==> true

jshell> boolean isEqual = (15 == 15)
isEqual ==> true
```

## Double Variables
**Definition:** A double variable stores decimal numbers with high precision.

**How to declare:**
```java
double variableName;
double variableName = value;
```

**TYPE into jshell:**
```java
jshell> double price = 19.99
price ==> 19.99

jshell> double temperature = -2.5
temperature ==> -2.5

jshell> double result = 10.5 + 3.7
result ==> 14.2

jshell> double division = 10.0 / 3.0
division ==> 3.3333333333333335
```

## String Variables
**Definition:** A String variable stores text (sequence of characters).

**How to declare:**
```java
String variableName;
String variableName = "text";
```

Hey, here, replace "John" with your name.

**TYPE into jshell:**
```java
jshell> String name = "John"
name ==> "John"

jshell> String greeting = "Hello, World!"
greeting ==> "Hello, World!"

jshell> String combined = name + " says " + greeting
combined ==> "John says Hello, World!"

jshell> String empty = ""
empty ==> ""
```

## Practice Tips
1. Try typing these examples in jshell
2. Experiment with different values
3. Try combining variables in operations
4. Use `/vars` command to see all declared variables
5. Save the work in a file using `/save vars.jsh`
6. Use `/exit` to leave jshell

Be sure to do commit of all this work to your GitHub repository.

```bash
git add .
git commit -m "Add Java Variables Guide"
git push
```

## Common Mistakes to Avoid
- Don't forget to declare the variable type
- Use correct capitalization (String vs string)
- Remember to use quotes for String values
- Don't use decimal points in int variables
- Remember that boolean only accepts true/false values

This guide should give you a solid foundation for understanding and working with basic Java variables in jshell. Practice with these examples and try creating your own variables to become more comfortable with these concepts.

Now go to the `ClassPerson.md` guide to learn about creating custom classes in Java.
