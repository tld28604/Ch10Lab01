/**
 * BoatMain
 *
 * Demonstration module for ch10lab1.
 *
 * @date    8/29/2018
 * @author  Trevor Deligne
 * @author  David Keaton
 */

/**
 * Test module to demonstrate created boat[s] information stored.
 */
public class BoatMain {
   /**
    * Create a new Boat object, and print its toString(), but use the main methods for
    * PowerBoat and SailBoat to take care of creation and printing attributes.
    *
    * @param   args    Program arguments
    */
   public static void main(String[] args) {
      System.out.println(new Boat("canoe", 14.0, 2.5, 250.0));
      new SailBoat().main(null);
      new PowerBoat().main(null);
   }
}
