/**
 This creates a Factory interface.
 It creates three methods: displayInventory(), produce(), takeResource(Resource resource).
 Body of the methods are provided by the implemented classes (StoneBlockFactory and WoodBlockFactory).
 */
interface Factory {
    public  void displayInventory();
    public  Resource produce();
    public Resource takeResource(Resource resource);
}
