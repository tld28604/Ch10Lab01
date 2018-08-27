/**
 * PowerBoat
 *
 * Stores information regarding a power boat, extending the @ref Boat class.
 *
 * @date    8/29/2018
 * @author  Trevor Deligne
 * @author  David Keaton
 */
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

   public static void main(String[] args)
   {
      System.out.println(new PowerBoat("Fish King", 8.0, 4.0, 300, 10.0));
   }
}
