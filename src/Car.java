import java.awt.*;
// awt abstract window toolkit library. built into Java
// * selects everything from that library;
public class Car {
    // In Java we have the datatype followed by the variable name when declaring variables
    // Data Types:
    // int -> integer 1, 2, 3
    // double -> decimal 34.5, 32.1 || think floats in JavaScript
    // String -> "a1a2" or "Hello World"
    // boolean -> true or false

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean areTaillightsWorking;

    // Creating a car constructor.
    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputAreTaillightsWorking) {
        // We are initializing values defined above to the constructor arguments.
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.areTaillightsWorking = inputAreTaillightsWorking;
    }

    // Method Signature
    // This explains basic components of the method.
    // changePaintColor = method name
    // method will have one paramater of newPaintColor
    // newPaintColor will be of the Color type

    // This function will not return a value, so we use the 'void' keyword
    // This function will just modify the car color output
    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }
    public double speedingUp(double currentSpeed) {
        // Since Java is callByValue, we cannot mutate the value of a variable, even if we edit it within this scope
        currentSpeed += 100;
        // but we can return the new value
        return currentSpeed;
    }
}