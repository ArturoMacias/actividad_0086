import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     actividad 0094 parte 1
    public String getInput()
    {
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();
        String [] palabras = inputLine.split(" ");
        String primeraPalabra = palabras[0];//devuelve la primera palabra que metemos en cada frase
        return primeraPalabra;
    }
    */
   
    public HashSet<String> getInput(){
        System.out.print("> ");         // print prompt
        String inputLine = reader.nextLine();
        String [] frase = inputLine.split(" ");
        HashSet<String> palabras = new HashSet<>();
        for (int i = 0;i < frase.length;i++){
            palabras.add(frase[i]);
        }
        return palabras;
    }
}
