public class Spider extends Insect {
    boolean isPoisonous;

    public Spider(int age, boolean isPoisonous) {
        // Super is calling the Insect constructor
        //  Since Spider extends Insect, we have to call the insect constructor, and set all of that up before we can begin constructing and setting up our spider.
        // We set the age parameter to the age of our spider class, and define the numberOfLegs property from our Insect class to 8
        super(age, 8);
        this.isPoisonous = isPoisonous;
    }
    public void says() {
        System.out.println("HISSSS");
    }
}
