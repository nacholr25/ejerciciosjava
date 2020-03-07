import java.util.*;
import java.lang.*;
import java.io.*;

//Entiendo que dada una fila n dar como resultado n^3 es demasiado fácil

/*También considero que es demasiado fácil ver que el primer impar de una
	fila n es n*(n-1)+1*/

/*Lo que voy a hacer es calcular cuantos impares son anteriores a la fila n dada.
	Como cada fila i se tienen en cuenta i impares, entonces habrá 1+2+...+n-1
	impares anteriores a la fila n dada. De esta forma, el primer impar pedido
	será 2*sum(n-1)+1*/

class ejercicio3
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
        //Pido el numero de la fila por pantalla
        int entradaFila;
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaFila = entradaEscaner.nextInt (); //Invocamos un método sobre un objeto Scanner
        //El numero de entrada es entradaFila
        
        //Calculamos cuantos impares hay antes de la fila n
        int sum = 0;
        for(int i = 1; i < entradaFila; ++i){
        	sum += i;
        }
        
        int resultado = 0;
        int impar = 2*sum + 1; //Primer impar de la fila n
        for(int j = 0; j < entradaFila; ++j){
        	resultado += impar + 2*j; //La distancia con el siguiente impar es 2
        }
        
        System.out.println (resultado); //Se muestra el resultado
	}
}
