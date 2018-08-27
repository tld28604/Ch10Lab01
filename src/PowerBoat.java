public class PowerBoat extends Boat{

   private double engineHP;

   public PowerBoat() {
   }

   public PowerBoat(String name, double lengthOverAll, double beam, double weightCapacity,
                    double engineHP) {
      super(name, lengthOverAll, beam, weightCapacity);
      this.engineHP = engineHP;
   }

   @Override
   public String toString() {
      return "PowerBoat{" +
          "engineHP=" + engineHP +
          ", " + super.toString() + "}";
   }
}
