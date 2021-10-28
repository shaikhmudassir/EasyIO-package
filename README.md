**Programming in JAVA now became easy and joyful with EasyIO** - which is a JAVA package intended to provide ease for programmers to get input and output, beautiful colors in the terminal and also easy data type casting. Specially created for beginners, yet useful for professionals.

# GETTING STARTED

### :octocat: STEP 01

## HOW TO GET IT?

1. Download the repository, better to be in .ZIP format.
2. Unzip it and add into your own project directory.
3. Import it. That's it.

### :octocat: STEP 02

## HOW TO IMPORT PACKAGE?

1. Before starting must import respective.
2. For **EasyIO.pyStyle** package, import as:

    ```java
    // At top, must import this with "static" keyword
    import static EasyIO.pyStyle.*;
    ```

3. For **EasyIO.cStyle** package, import as:

    ```java
    // At top, must import this with "static" keyword
    import static EasyIO.cStyle.*;
    ```

### :octocat: STEP 03-A

## HOW TO PRINT?

USING **EasyIO.pyStyle** PACKAGE

1. These methods will print what ever is written within circular brackets.
2. String must be Written with Double Quotes(" ").
3. " + " Operator is used to concatenate String and to Separate Variables.
4. If user wants Next print Statement within a same line so,he can Enable(true) By writing "true" as second argument.Example,

    ```java
    // At top, must import this
    import static EasyIO.pyStyle.*;
    ...
    ...
    print("One line ",true);
    print("Second line");
    // Output: One line Second
    ...
    ```

USING **EasyIO.cStyle** PACKAGE

1. Can use C Style printing values as described below.
2. Refer *Sample_cStyle.java*. Soon you'll get familiar with it.
3. Can use in following ways:

    ```java
    // At top, must import this
    import static EasyIO.cStyle.*;
    ...
    ...
    // Printing Numbers With And Without Formatting
    print("number is 32");
    print("number is %d",number);
    print('p',"number is %d (this line is in purple color)",number);
    ...
    ```

### :octocat: STEP 03-B

## HOW TO INSERT/GET DATA FROM USER?

USING **EasyIO.pyStyle** PACKAGE

1. All of these methods used to accept input from front end user.
2. User can give description.It is the guidelines for the user.
3. If user wants Description and input in a single line then he can Enable(true)the Single line method.

    ```java
    // At top, must import this
    import static EasyIO.pyStyle.*;
    ...
    ...
    String str = input() ;
    String age = inputInt("Enter your age");
    ...
    ```

USING **EasyIO.cStyle** PACKAGE

1. Can use C Style input output methods as described below.
2. Refer *Sample_cStyle.java*. Soon you'll get familiar with it.
3. Can use in following ways:

    ```java
    ...
    // At top, must import this
    import static EasyIO.cStyle.*;
    ...
    ...
    // Getting Numbers With And Without Formatting
    int number = get_int("Enter the number");
    int number = get_int('r',"Enter the number (this line is in red color)");
    int number = get_int('y',"Enter the number %d times (this line is in yellow color)",2);
    ...
    ```

### :octocat: STEP 03-C

## HOW TO CAST THE TYPE?

ONLY USING **EasyIO.pyStyle** PACKAGE

1. All Type casting Methods has first Letter Capital.
2. Type casting is done with String, Integer, Double, Long, Float data types.

    ```java
    // At top, must import this
    import static EasyIO.pyStyle.*;
    ...
    ...
    int age = Int(args[1]);
    ...
    ```
