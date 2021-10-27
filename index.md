**EasyIO** is a JAVA package - which intended to provide ease for programmers to get input and to display them, specially for beginners yet useful for professionals.

# DOCUMENTATION

## HOW TO GET IT?

1. Download the repository, better to be in .ZIP format.
2. Unzip it and add into your own project directory.
3. Import it. That's it.


## HOW TO USE PACKAGE?

Use following format to import in JAVA.

```java
// must use "static" keyword
import static EasyIO.EasyIO.*;
```

## HOW TO PRINT?

1. These methods will print what ever is written within circular brackets.
2. String must be Written with Double Quotes(" ").
3. " + " Operator is used to concatenate String and to Separate Variables.
4. If user wants Next print Statement within a same line so,he can Enable(true) By writing "true" as second argument.Example,

```java
print("One line ",true);
print("Second line");
// Output: One line Second
```
5. Can use C Style printing values as described below.
6. Refer *Sample.java*. Soon you'll get familiar with it.
7. Can use in following ways:
```java
// Printing Numbers With And Without Formatting
print("number is 32");
print("number is %d",number);
print('p',"number is %d (this line is in purple color)",number);
// Do experiment by yourself ...
```

## HOW TO INSERT/GET DATA FROM USER?

1. All of these methods used to accept input from front end user.
2. User can give description.It is the guidelines for the user.
3. If user wants Description and input in a single line then he can Enable(true)the Single line method.

```java
String str = insert() ;
String age = insertInt("Enter your age");
```
4. Can use C Style printing values as described below.
5. Refer *Sample.java*. Soon you'll get familiar with it.
6. Can use in following ways:
```java
// Getting Numbers With And Without Formatting
int number = get_int("Enter the number");
int number = get_int('r',"Enter the number (this line is in red color)");
int number = get_int('y',"Enter the number %d times (this line is in yellow color)",2);
// Do experiment by yourself ...
```

## HOW TO CAST THE TYPE?

1. All Type casting Methods has first Letter Capital.
2. Type casting is done with String, Integer, Double, Long, Float data types.

```java
int age = Int(args[1]);
```
