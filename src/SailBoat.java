public class SailBoat extends Boat{
   private double sailArea;

   public SailBoat() {
   }

   public SailBoat(String name, double lengthOverAll, double beam, double weightCapacity,
                   double sailArea)
   {
      super(name, lengthOverAll, beam, weightCapacity);
      this.sailArea = sailArea;
   }

   @Override
   public String toString() {
      return "SailBoat{" +
          "sailArea=" + sailArea +
          ", " + super.toString() + "}";
   }
}
