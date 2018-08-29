/**
 * Boat
 *
 * Stores and sets basic attributes of a boat.
 *
 * @date    8/29/2018
 * @author  Trevor Deligne
 * @author  David Keaton
 */
public class Boat {

   private String name;            // The name of the boat
   private double lengthOverAll;   // The length of the boat
   private double beam;            // The length of the sail's beam
   private double weightCapacity;  // The maximum allowed weight for the boat

   /*
   * No arg constructor for Boat class
   */
   public Boat() {
   }

   /*
    * Constructs the class with the given parameters.
    *
    * @param   name              Name of the SailBoat
    * @param   lengthOverAll     The length of the SailBoat
    * @param   beam              The length of the sail's beam
    * @param   weightCapacity    The amount of weight the boat can hold
    */
   public Boat(String name, double lengthOverAll, double beam, double weightCapacity) {
      this.name = name;
      this.lengthOverAll = lengthOverAll;
      this.beam = beam;
      this.weightCapacity = weightCapacity;
   }

   /*
    * Returns the name of the boat.
    *
    * @return  name of Boat as a String
    */
   public String getName() {
      return name;
   }

   /*
    * Returns the beam length of the boat
    *
    * @return  length of the beam as a double
    */
   public double getBeam() {
      return beam;
   }

   /*
    * Creates a string that describes the attributes of the Boat.
    *
    * @return  A string describing the attributes of the Boat
    */
   @Override
   public String toString() {
      return "Boat{" +
          "name='" + name + '\'' +
          ", lengthOverAll=" + lengthOverAll +
          ", beam=" + beam +
          ", weightCapacity=" + weightCapacity +
          '}';
   }
}
