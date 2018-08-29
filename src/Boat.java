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

   private String name;            //
   private double lengthOverAll;   //
   private double beam;            //
   private double weightCapacity;  //

   /*
   * No arg constructor for Boat class
   */
   public Boat() {
   }

   /*
    * Constructor for Boat class
    * @param
    *
    */
   public Boat(String name, double lengthOverAll, double beam, double weightCapacity) {
      this.name = name;
      this.lengthOverAll = lengthOverAll;
      this.beam = beam;
      this.weightCapacity = weightCapacity;
   }

   /*
    *
    * @return
    */
   public String getName() {
      return name;
   }

   /*
    *
    * @ return
    */
   public double getBeam() {
      return beam;
   }

   /*
    *
    * @return
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
