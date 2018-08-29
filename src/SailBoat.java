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
   private double sailArea;      // The geometric area of the SailBoat's sail

   /*
    * No arg constructor
    */
   public SailBoat() {
   }

   /*
    * Constructs the class with the given parameters.
    *
    * @param   name              Name of the SailBoat
    * @param   lengthOverAll     The length of the SailBoat
    * @param   beam              The length of the sail's beam
    * @param   weightCapacity    The amount of weight the boat can hold
    * @param   sailArea          The geometric area of the sail
    */
   public SailBoat(String name, double lengthOverAll, double beam,
                   double weightCapacity, double sailArea)
   {
      super(name, lengthOverAll, beam, weightCapacity);
      this.sailArea = sailArea;
   }

   /*
    * Return information about the SailBoat in addition to the Boat class derived from.
    *
    * @return  A string that describes the SailBoat
    */
   @Override
   public String toString() {
      return "SailBoat{" +
          "sailArea=" + sailArea +
          ", " + super.toString() + "}";
   }

   /*
    * Create a new SailBoat object for BoatMain invocation, and print its toString().
    *
    * @param   args     Program arguments
    */
   public static void main(String[] args)
   {
      System.out.println(new SailBoat("Patience", 11.0, 3.5, 250.0, 45.0));
   }
}
