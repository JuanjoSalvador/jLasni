/**
 *
 * @author Juan José Salvador
 */

import java.util.Random;
public class JLasni {

    /**
     *
     * Mensajes
     */

    public void roto() {
        System.out.println("Hola me he roto :D");
    }

    public void pechote() {
        System.out.println("Me pica un pechote (????)");
    }

    public void meIgnora(String nombre) {
        System.out.println(nombre + " me ignora (????)");
    }

    public void botonaco() {
        System.out.println("Aquí va un BOTONACO");
    }

    public void guapisimo() {
        System.out.println("Guapísimo xDDDDDDDDDDDDD");
    }

    public void felicidad() {
        String msg = "asdf";
        Random random = new Random();
        int n = random.nextInt(10) + 5;
        int nLetters = 'z' - 'a';

        for (int i = 0; i < n; i++) {
          msg += (char) ('a' + random.nextInt(nLetters));
        }

        System.out.println(msg);
    }

    public void aPastar() {
      System.out.println("A PASTAR");
    }

    // Añade más frases

    /**
     *
     * Excepciones
     */
}
