// Each file needs a parent class of the same name,
// Since our file is named Main.java, our parent class is Main

// These libraries are internal Java Libraries
import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    // In order to write a Java program, we need to have a main function. This is what Java automatically runs when we execute a program.
    // main is going to be the name of the function, and it will have one parameter, a string array, and this parameter is going to be called args
    public static void main(String[] args) {

        // Lambda
        // Lambdas are anonymous functions

        // We are setting phone equal to this lambda function
        // We link this lambda function to the Answerable interface to create a reference
        // This lambda function maps back to Anserable's answer() function
        Answerable phone = () ->  { return "Hello"; }; // The return is unnecessary, as are the curly braces, and we don't have to define the function
        System.out.println(phone.answer()); // "Hello" is printed out

        Predicate isOdd = n -> n % 2 != 0; // We don't need a return statement because this one line of code is immediately evaluated. Similar to JavaScript ES6 rules for arrow functions
        System.out.println(isOdd.test(2)); // This will return false because 2 modulo 2 will return 0, which means it's an even number

        Predicate isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(2));

//        Dog d = new Dog();
//        Cat c = new Cat();
//
//        if (c instanceof Pet) {
//            c.play();
//        }
//        if (d instanceof Pet) {
//            d.play();
//        }
//
//        Pet p;
//        Random rand = new Random();
//        int n = rand.nextInt(2);
//
//        if (n == 0) {
//            p = new Dog();
//        } else {
//            p = new Cat();
//        }
//
//        p.play();

//        Insect insect = new Insect(5, 6);
//        Spider spider = new Spider(13, true);
//        Cricket cricket = new Cricket(2, 1.25);
//
//        insect.crawl();
//        insect.says();
//
//        spider.crawl();
//        spider.says();
//
//        cricket.crawl();
//        cricket.says();
//        cricket.jump();
//
//        if (spider instanceof Insect && spider instanceof Spider) {
//            System.out.println("Spider is an Insect and a spider");
//        }

/*
        BankAccount myBankAccount = new BankAccount(4141,100);
//        System.out.println(myBankAccount.account_balance);
        // Error because account_balance has private access
        myBankAccount.deposit(-60);
        // Error because deposit cannot have a negative value for deposit
        myBankAccount.withdraw(150);
        // Error because withdraw amount is greater than account balance (100)
        myBankAccount.deposit(100);
        myBankAccount.withdraw(200);
*/

//        Dice dice = new Dice();
//        System.out.println("Previous: " + dice.previousRoll);
//        System.out.println(dice.roll());
//        System.out.println("Previous: " + dice.previousRoll);
//        System.out.println(dice.roll());
//        System.out.println("Previous: " + dice.previousRoll);

//        Coin c = new Coin();
//        System.out.println("Initial: " + c.getFaceUp());
//        for(int i = 0; i < 10; i++) {
//            c.flip();
//            System.out.println("After Flip: " + c.getFaceUp());
//        }


//        double power = Math.pow(5, 3);
//        System.out.println(power);
//
//        double squareRoot = Math.sqrt(64);
//        System.out.println(squareRoot);
//
//        Random rand = new Random();
//        int randomNumber = rand.nextInt();
//        int randomNumberWithBound = rand.nextInt(10);
//        System.out.println(randomNumber);
//        System.out.println(randomNumberWithBound);

        // Java.lang
            // Fundamental to the core Java language (math, boolean, byte)
        // Java.util
            // Generic utilities (scanning, formatting strings, data manipulation)
        // Java.net
            // Infrastructure for networking

        // While loop

//        System.out.println("While Loop");
//        int x = 3;
//        while (x > 0) {
//            System.out.println("Current x:" + x);
//            x = x - 1;
//        }
//        System.out.println("Final x: " + x);
//        System.out.println();
//
//        // Do While
//        System.out.println("Do-While Loop");
//        int y = 3;
//        do {
//            System.out.println("Current y: " + y);
//            y = y - 1;
//        } while (y > 0);
//        System.out.println("Final y: " + y);
//        System.out.println();
//
//        // For Loop
//        System.out.println("For Loop");
//        for (int i = 3; i > 0; i--) {
//            System.out.println("Current i: " + i);
//        }
//        System.out.println();

        // If / Else statements
//        System.out.println("enter an age: ");
//        Scanner in = new Scanner(System.in);
//        int age = in.nextInt();
//        if (age >= 0 && age <= 5) {
//            System.out.println("Baby");
//        } else if (age >= 6 && age <= 11) {
//            System.out.println("Kid");
//        } else if (age >= 12 && age <= 17) {
//            System.out.println(("Teen"));
//        } else if (age >= 18) {
//            System.out.println("Adult");
//        } else {
//            System.out.println("Invalid");
//        }
//        System.out.println("Thanks for using this program!");
        // Greater than > less than < equal to == not equal to != greater than or equal to >= less than or equal to <=
        // conditional operators AND, OR, NOT

        // AND: the two operands or inputs must evaluate to true for the expression to evaluate to true; otherwise false
        // OR: at least one input of the two inputs must evaluate to true for the expression to evaluate to true; otherwise, false
        // NOT: takes only one input, and if that input evaluates to false, it returns true; if it evaluates to true, it returns false


//        Dog d = new Dog("Doug", 3);
//
//        d.bark();
//
//        int dogYears = d.getDogYears();
//        System.out.println(dogYears + " dog years.");
//
//        d.fetch();
//        d.fetch();
//        d.fetch();
//        d.fetch();

        // Since we cannot mutate a string, we create a new string using the old string as a datasource
            // String s = "dog";
        // We save a variable dog, and create a new variable that replaces the letter 'd' with the letter 'f'
            // String replacedF = s.replace('d', 'f');
        // We then return that new value, which should print 'fog'.
            // System.out.println(replacedF);

//        int[] numbers = new int[5];
//
//        numbers[0] = 31;
//        numbers[1] = 45;
//        numbers[2] = 22;
//        numbers[3] = 98;
//        numbers[4] = 10;
//
//        int[] numbers2 = {31, 45, 22, 98, 10};
//        Array.sort(numbers);
//        System.out.println(Arrays.toString(numbers));
//        String[] myFavoriteCandyBars = {"Twix", "Hershey's", "Crunch"};
//        System.out.println("Index 1: " + myFavoriteCandyBars[1]);
//        myFavoriteCandyBars[2] = "Butterfinger";
//        System.out.print("Index 2: " + myFavoriteCandyBars[2]);
//        System.out.println("Length: " + myFavoriteCandyBars.length);
//
//        System.out.println(Array.get(myFavoriteCandyBars, 2));

//        System.out.println("Enter a word:");
//        Scanner sc = new Scanner(System.in);
//        int userNumber = sc.nextInt();
//        System.out.println(userNumber);
//        double userNumber2 = sc.nextDouble();
//        System.out.println(userNumber2);
        // String userInput = sc.next();

        // Printing something out to the console, where a user can interact with it
        // System is a class
        // out is a static property of that class
        // println is a function
        // This is how we print things in the console.
        //        System.out.println("Hello, World!");
        //        System.out.println("Devin");
        //        System.out.println("Hello, Java!");

         // Car is the datatype, myCar is the variable, and it will be a new instance of a car
//                Car myCar = new Car(25.5, "1BC32E", Color.BLUE, true);
//                Car sallyCar = new Car(13.9, "3D20BN", Color.BLACK, false);
//
//                System.out.println("My Car's License Plate: " + myCar.licensePlate);
//                System.out.println("Sally's License Plate: " + sallyCar.licensePlate);
//
//                System.out.println(myCar.paintColor.toString());
//                myCar.changePaintColor(Color.RED);
//                System.out.println(myCar.paintColor.toString());
//
//                double myCarSpeed = 50;
//                myCar.speedingUp((myCarSpeed));
//                System.out.println(myCarSpeed);

        // String userInput = "entertainment";
        // We have to store this uppercase value in a variable otherwise we'd lose that new value
        // Saving this new modified value doesn't change the original value because strings are immuteable.
        //        String uppercased = userInput.toUpperCase();
        //        System.out.println(uppercased);
        //        char firstCharacter = userInput.charAt(0);
        //        System.out.println(firstCharacter);
        //        // This returns true if userInput contains "enter" inside of it's string.
        //        System.out.println("Contains: " + userInput.contains("enter".toLowerCase()));
    }
}

// Program – a sequence of instructions (called statements), which are executed one after another in a predictable manner. Sequential flow is the most common and straight-forward sequence of statements, in which statements are executed in the order that they are written - from top to bottom in a sequential manner;
//        Statement – a single action (like print a text) terminated by semi-colon (;);
//        Block – a group of zero, one or more statements enclosed by a pair of braces {...}; There are two such blocks in the program above.
//        Syntax – a set of rules that define how a program needs to be written in order to be valid; Java has its own specific syntax that we will learn;
//        Keyword – a word that has a special meaning in the programming language (public, class, and many others). These words cannot be used as variable names for your own program;
//        Identifier or name – a word that refers to something in a program (such as a variable or a function name);
//        Comment – a textual explanation of what the code does. Java comments start with //.
//        Whitespace – all characters that are not visible (space, tab, newline, etc.).

// The public class: Every Java program must have at least one class. The definition of a class consists of the class keyword followed by the class name. A class can have any name, but it must not start with a digit. A set of braces {} encloses the body of a class.
// The main method: To make the program runnable, we put a method named main inside a class. It is the entry point for a Java program. Again, the braces {} encloses the body of the method, which containes programming statements.

// Standard output is a receiver to which a program can send information (text). Java uses System.out to work with the standard output.

// The println method displays the passed string followed by a new line on the screen (print-line).

// The print method displays the passed value and places the cursor (the position where we display a value) after it.

// Both println and print allow a program to print strings, characters, and numbers

// Strings are immutable in Java

// Strings in Java 9 are bytes inside of a byte array instead of chars inside of a char array because it takes up less space in java because a char takes up 8 bytes.

// Arrays in Java are different from JavaScript in that they are collections of data for only one datatype.

// Functions

// Argument
    // Actual value passed to the function
    // Example: (Red is the argument) changePaintColor("Red");

// Parameter
    // A variable in a method definition
    // Example: (color is the Parameter)
    // public static void changePaintColor(String color) {...}

// Call by value
// Call by value receives a copy of each argument passed to it rather than a reference to the object itself

// Call by reference
    // A function receives a reference to each argument, and can modify them

// Java uses only call by value, so the original arguments of a function are never modified.

// Object Oriented Programming

    // Style of programming where you organize your program around objects rather than actions, and data rather than logic
    // Car class with attributes
    // Car class with methods
    // Encapsulation
        // Encapsulation is the process of wrapping data and methods into a single unit (class)
        // A way to make programs more secure
        // Prevents unauthorized members from accessing certain variables and methods
        // Encapsulation in Java can be known as data hiding
        // You cannot directly access the private properties of a class unless you are writing code inside the class itself
        // It helps developers better group and organize data
        // Developers can easily change code without affecting other parts of the program
// Polymorphism
    // Inheritance
        // Inheritance is when one class acquires the methods and fields of another
        // The class which inherits the properties of the other is known as a subclass (or derived class, parent class)
        // Every object in Java inherits from the Object class implicitly
        // We define inheritance through the keyword "extends"
        // Uses of a class extend to inherit the properties of another class

        // Advantages of inheritance
            // Minimize duplication of code
        // Disadvantages of inheritance
            // Superclass and subclass can be tightly coupled
            // Increased effort to jump through levels of abstraction to get appropriate functionality
// Abstraction (through interfaces)
    // Interfaces
        // Forces interfaces to have parent methods
        // Implementation of these methods are up to the classes themselves, but they are forced to have these methods
        // Interfaces are the definition of a behavior
        // When used, they force classes and objects to have certain properties without forcing their implementation
// Functional Programming
    // Functional programming focuses on computing results from functions rather than performing actions on objects
    // Objects are immutable
    // Instead of modifying or changing an object, you create a new object which looks like the old object, except for the change
// Lambda
    // In Java, whenever you create a function, you usually have to put it inside a class.
    // With lambda, we can get around this
    // Lambdas are anonymous functions that you can create easily in Java without the usual overhead of public, static, void, etc.
    // Great for quick functions and calculations.
    // Lambda functions are anonymous functions that you can create in Java without the usual code overhead
    // A great tool if you need a quick function for a calculation in your code
    // They usually have a single purpose and do not affect other objects in the code
