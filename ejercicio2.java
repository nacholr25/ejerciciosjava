import java.util.*;
import java.lang.*;
import java.io.*;

class ejercicio2
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
        //Pido el entero n por pantalla
        int entradaNumero;
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaNumero = entradaEscaner.nextInt (); //Invocamos un método sobre un objeto Scanner
        //El entero de entrada es entradaNumero
        
        //Hay que calcular (1! + 2! +...+ n!)/n!
        int mult = 1; //Va calculando los factoriales
        int sum = 0; //Se van sumando los factoriales
        for(int i = 1; i <= entradaNumero; ++i){
        	mult *= i;
        	sum += mult;
        }
        //sum = (1! + 2! +...+ n!), mult = n!
        
        //Calculamos la division
        double resultado = (double) sum / mult;
        
        //Queremos sólo 6 decimales
        int numDecimales = 6; //Número de decimales
        resultado = Math.round(resultado * Math.pow(10, numDecimales)) / Math.pow(10, numDecimales);
        
        System.out.println (resultado); //Se muestra el resultado
	}
}
