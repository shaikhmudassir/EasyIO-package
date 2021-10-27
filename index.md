# WELCOME TO **EASYIO**

EasyIO is a JAVA package - is intended to provide ease for programmers to get input and to display them, specially for beginners yet useful for professionals.

# DOCUMENTATION

## HOW TO GET IT?

Download this repository, unzip it and add into your project directory.

``` html
https://github.com/shaikhmudassir/EasyIO-package/archive/refs/heads/main.zip
```

## HOW TO USE PACKAGE?

Import following statement, it is must to add **static** keyword.

```java
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
```

Output:
> One line Second

## HOW TO INSERT?

1. All of these methods used to accept input from front end user.
2. User can give description.It is the guidelines for the user.
3. If user wants Description and input in a single line then he can Enable(true)the Single line method.

```java
String str = insert() ;

String age = insertInt("Enter your age");
```

## HOW TO CAST THE TYPE?

1. All Type casting Methods has first Letter Capital.
2. Type casting is done with String,Integer,Double,Long,Float data types.

```java
int age = Int(args[1]);
```

## C STYLE GETTING AND PRINTING

1. Refer *Sample.java* here and soon you'll get familiar with it.
2. Can use in following ways:

```java
// Getting Numbers With And Without Formatting
int number = get_int("Enter the number");
int number = get_int('r',"Enter the number (this line is in red color)");
int number = get_int('y',"Enter the number %d times (this line is in yellow color)",2);
// Printing Numbers With And Without Formatting
print("number is 32");
print("number is %d",number);
print('p',"number is %d (this line is in purple color)",number);
// Do experiment by yourself ...
```

