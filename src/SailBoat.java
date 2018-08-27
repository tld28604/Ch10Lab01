/**
 * SailBoat
 *
 * Stores information regarding a sail boat, extending the @ref Boat class.
 *
 * @date    8/29/2018
 * @author  Trevor Deligne
 * @author  David Keaton
 */
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

   public static void main(String[] args)
   {
      System.out.println(new SailBoat("Patience", 11.0, 3.5, 250.0, 45.0));
   }
}
