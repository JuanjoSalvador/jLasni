package es.juanjosalvador.jlassni;

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

    public String roto() {
        return "Hola me he roto :D";
    }

    public String pechote() {
       return "Me pica un pechote (????)";
    }

    public String meIgnora(String nombre) {
       return  String.format("%s me ignora (????)", nombre);
    }

    public String botonaco() {
        return "Aquí va un BOTONACO";
    }

    public String guapisimo() {
        return "Guapisimo xDDDDDDDDDDDDD";
    }

    public String felicidad() {
        String msg = "asdf";
        Random random = new Random();
        int n = random.nextInt(10) + 5;
        int nLetters = 'z' - 'a';

        for (int i = 0; i < n; i++) {
          msg += (char) ('a' + random.nextInt(nLetters));
        }

        return msg;
    }

    public String aPastar() {
      return  "A PASTAR";
    }
    
    public String croqueta() {
        return "Me he roto *huye haciendo la croqueta*";
    }

    public String hipazo() {
        return "HIPAZO.";
    }
    
    public String otp() {
       return "DobleJota OTP.";
    }
}
