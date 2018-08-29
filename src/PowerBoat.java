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

   private double engineHP;   // The boat engine's horsepower

   /*
    * No arg constructor
    */
   public PowerBoat() {
   }

   /*
    * Constructs the class with the given parameters.
    *
    * @param   name              Name of the SailBoat
    * @param   lengthOverAll     The length of the SailBoat
    * @param   beam              The length of the sail's beam
    * @param   weightCapacity    The amount of weight the boat can hold
    * @param   engineHP          The amount of horsepower the boat's engine has
    */
   public PowerBoat(String name, double lengthOverAll, double beam,
                    double weightCapacity, double engineHP)
   {
      super(name, lengthOverAll, beam, weightCapacity);
      this.engineHP = engineHP;
   }

   /*
    * Return information about the constructed Boat
    *
    * @return  A string that describes the Boat
    */
   @Override
   public String toString() {
      return "PowerBoat{" +
          "engineHP=" + engineHP +
          ", " + super.toString() + "}";
   }


   /*
    * Create a new PowerBoat object for BoatMain invocation, and print its toString().
    *
    * @param   args     Program arguments
    */
   public static void main(String[] args)
   {
      System.out.println(new PowerBoat("Fish King", 8.0, 4.0, 300, 10.0));
   }
}
