import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random rnd;
    private ArrayList<String> respuestas;
    private HashMap map;
    
    /**
     * 
     * 
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rnd = new Random();
        respuestas = new ArrayList<>();
        respuestas.add("Try to explain me the problem you have found");
        respuestas.add("We are in the rigth track, tell me a bit more...");
        respuestas.add("Exactly, which is the error message shown by your device?");
        respuestas.add("Please, repeat me the previous information you gave me");
        respuestas.add("It seems you have a difficult problem to solve...");
        
        map = new HashMap();
        map.put("computer","You must restart your computer");
        map.put("internet","Contact with your Internet company");
        map.put("problem","ok, we're going to solve it");
        map.put("sound","Are your speakers working?");
    }
    
  

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        String respuesta = respuestas.get(rnd.nextInt(respuestas.size()-1));
        return respuesta; 
    }
    
    /**
     * 
     */
    public HashMap getMap(){
        return map;
    }
}
