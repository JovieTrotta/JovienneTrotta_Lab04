// Imports a method to round the resourceBin weight.
import java.text.DecimalFormat;

/**
 This class will define wood factory, which implements the Factory interface.
 It takes a resourceBin (Resource), which has a weight and type.
 It also creates an instance of the DecimalFormat class and sets the desired decimal place to 1.
 */
public class WoodBlockFactory implements Factory{
   private static final DecimalFormat df = new DecimalFormat(("0.0"));
   public Resource resourceBin;

   /**
    Constructs this object.
    Has an instance of the Resource class named resourceBin, which takes an initial weight (double) (0) and type (ResourceType) (wood).
    */
   public WoodBlockFactory() {
      this.resourceBin = new Resource(0.0, ResourceType.WOOD);
   }

   /**
    Creates the displayInventory method.
    Prints the weight of the resourceBin (double), which is formatted to the above DeciMalFormat object.
    @return nothing.
    */
   @Override
   public void displayInventory() {
      System.out.println(df.format((resourceBin.getWeight())));
   }

   /**
    Creates the produce method.
    If the resourceBin weight (double) reaches or surpasses its limit (10), subtracts 10 from the resourceBin.
    @return the resourceBin (Resource).
    (Block is created in the driver file).
    Else, return null.
    (Block is not created in the driver file).
    */
   @Override
   public Resource produce() {
      if (this.resourceBin.getWeight() >= 10.0) {
         this.resourceBin.subtractResources(10.0);
         return this.resourceBin;
      }
      else {
         return null;
      }
   }

   /**
    Creates the takeResource method.
    @param resource (Resource), which is the new mined resource.
    Adds weight (double) of new resource to resourceBin weight (double).
    @return resourceBin (Resource).
    */
   @Override
   public Resource takeResource(Resource resource) {
      this.resourceBin.addResources(resource);
      return this.resourceBin;
   }
}
