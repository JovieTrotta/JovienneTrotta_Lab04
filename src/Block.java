/**
 This is an abstract class and will define all the allowable types for blocks.
 It creates an instance of the Const class (aConst).
 It takes a weight (double) and a type (ResourceType).
 There are two types: WOOD and STONE.
 The weight is determined by the constant values in Const.
 */
public abstract class Block {
    Const aConst = new Const();
    private double weight;
    private ResourceType type;

    /**
     Constructs an abstract class that has a type and a weight.
     @param type (ResourceType) is given to this block and defines the weight.
     */
    public Block(ResourceType type) {
        this.type = type;
        if (this.type == ResourceType.STONE) {
            this.weight = aConst.stoneBlockWeight;
        } else {
            this.weight = aConst.woodBlockWeight;
        }
    }

    /**
     Returns the information for the block.
     The string should have the following format:

     Block {
     Weight: [weight]
     Type: [type]
     }

     @return the formatted information (string) as above.
     */
    @Override
    public String toString() {
        return "Block{" +
                "Weight: " + weight + "\n" +
                "Type: " + type +
                '}';
    }
}
