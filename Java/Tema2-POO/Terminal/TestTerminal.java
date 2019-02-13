/**
 * 
 */
package Terminal;

/**
 *
 *
 * @author Rafael Miguel Cruz Álvarez
 * @version 1.0
 */
public class TestTerminal {

  /**
   * @param args
   */
  public static void main(String[] args) {
    
    Terminal t1 = new Terminal ("111 111 111");
    Terminal t2 = new Terminal ("222 222 222");
    Terminal t3 = new Terminal ("333 333 333");
    Terminal t4 = new Terminal ("444 444 444");
    
    System.out.println(t1);
    System.out.println(t2);
    t1.llamar(t2, 20);
    t1.llamar(t3, 40);
    System.out.println(t1);
    System.out.println(t2);

  }

}
