/**
 This is a class and will hold all the constant variables for our blocks.
 It takes a stoneBlockWeight (double) and a woodBlockWeight (double).
 These values cannot be changed (final), but can be accessed by any object.
 */
public final class Const {
    public final double stoneBlockWeight;
    public final double woodBlockWeight;

    /**
     Creates a  class that has two weights, which are constant.
     There are no parameters.
     */
    public Const() {
        this.stoneBlockWeight = 20.0;
        this.woodBlockWeight = 10.0;
    }
}
