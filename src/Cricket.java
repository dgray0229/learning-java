public class Cricket extends  Insect {

    double length;

    public Cricket(int age, double length) {
        super(age, 6);
        this.length = length;
    }
    // We can overwrite existing methods
    public void says() {
        System.out.println("CHIRP");
    }
    // We can create new methods
    public void jump() {
        System.out.println("A cricket jumped!");
    }
}
