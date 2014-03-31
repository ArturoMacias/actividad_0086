import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael KÃ¶lling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random rnd;
    private ArrayList<String> respuestas;
    private HashMap<HashSet<String>,String> map;

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

        HashSet<String> set1 = new HashSet<>();
        set1.add("app");
        set1.add("free");
        HashSet<String> set2 = new HashSet<>();
        set2.add("problem");
        set2.add("linux");
        set2.add("crash");

        //estos dos hashset sirven para hacer conjuntos de un único elemento, para que funcione como dice el eunciado del
        //problema. Habría que hacer otros con problem, linux, crash, pero se hace con estos dos y vale.
        HashSet<String> set3 = new HashSet<>();
        set3.add("app");

        HashSet<String> set4 = new HashSet<>();
        set4.add("free");

        map = new HashMap<>();
        map.put(set1,"Make a free account for downloading");
        map.put(set2,"There is no solution for this problem");
        map.put(set3,"Visit our appStore");
        map.put(set4,"Visit the free section");
    }


    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int index = 0;
        String respuesta=null;
        if (respuestas.size()>1){
            index = rnd.nextInt(respuestas.size()-1);
            respuesta = respuestas.get(index);
            respuestas.remove(index);
        }else if(respuestas.size()==1){
            respuesta = respuestas.get(0);
            respuestas.remove(0);
        }else{
            respuesta = "I haven't understand your question";
        }
        return respuesta; 
    }

    /**
     * Este método ya contiene la posibilidad de que se de que al introducir una palabra,esa palabra nos mande
     * al hashMap o directamente al generateResponse()
     */   
    public String generateExisting(HashSet<String> palabras){
        String response = null;
        if (map.containsKey(palabras)){
            response = map.get(palabras);
        }else{
            response = generateResponse();
        }
        return response;
    }

    /**
     * 
     */
    public HashMap getMap(){
        return map;
    }
}
