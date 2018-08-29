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
    * Simply create a Boat class, and dump the contents of toString() with System.out.println(),
    * but dynamically create and call the main methods of PowerBoat and SailBoat - as their main
    * methods will instantiate examples for us. Leave Java to take care of our garbage collection.
    *
    * @param   args    Program arguments
    */
   public static void main(String[] args) {
      System.out.println(new Boat("canoe", 14.0, 2.5, 250.0));
      new SailBoat().main(null);
      new PowerBoat().main(null);
   }
}
