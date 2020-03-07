import java.util.*;
import java.lang.*;
import java.io.*;

class ejercicio1
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
	
        //Pido el String por pantalla
        //El String dado, sólo contendrá la canción de Dubstep
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        //El String de entrada es entradaTeclado
        
        //Se reemplazan los WUB del Dubstep por espacios
        String reemplazado = entradaTeclado.replace("WUB", " ");
        
        //Si hay varios espacios en blanco se reemplazan por uno sólo
        reemplazado = reemplazado.replaceAll(" +", " ");
        
        System.out.println (reemplazado); //Se muestra la canción original
	}
}
