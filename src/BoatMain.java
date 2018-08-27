/**
 * BoatMain
 *
 * Demonstration module for ch10lab1.
 *
 * @date    8/29/2018
 * @author  Trevor Deligne
 * @author  David Keaton
 */
public class BoatMain {
   public static void main(String[] args) {
      System.out.println(new Boat("canoe", 14.0, 2.5, 250.0));
      new SailBoat().main(null);
      new PowerBoat().main(null);
   }
}
