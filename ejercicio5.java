import java.util.*;
import java.lang.*;
import java.io.*;

class ejercicio5
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
        //Pido el String por pantalla
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        //El String de entrada es entradaTeclado
        
        //Paso el String de entrada a minúsculas
        entradaTeclado = entradaTeclado.toLowerCase();
        
        //Elimino las vocales
        entradaTeclado = entradaTeclado.replaceAll("a", "");
        entradaTeclado = entradaTeclado.replaceAll("o", "");
        entradaTeclado = entradaTeclado.replaceAll("y", "");
        entradaTeclado = entradaTeclado.replaceAll("e", "");
        entradaTeclado = entradaTeclado.replaceAll("u", "");
        entradaTeclado = entradaTeclado.replaceAll("i", "");
        
        //Inserto "." antes de cada consonante
        String resultado = "";
        for(int i = 0; i < entradaTeclado.length(); i++){
        	resultado = resultado + "." + entradaTeclado.charAt(i);
        }
        
        System.out.println (resultado);
	}
}
