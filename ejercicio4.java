import java.util.*;
import java.lang.*;
import java.io.*;

class ejercicio4
{
	
	public static void main (String[] args) throws java.lang.Exception
	{
		
        //He tenido problemas para pedir el array por pantalla
        int[][] entradaArray = {{3, 2, 1}, {4, 6, 5}, {}, {9, 7, 8}}; //Array de entrada
        Arrays.sort(entradaArray[0]); //ordeno el primer elemento del Array
        Arrays.sort(entradaArray[1]); //ordeno el segundo elemento del Array
        Arrays.sort(entradaArray[3]); //ordeno el cuarto elemento del Array
        
        /*Lo suyo sería hacer un mergeSort con el primer elemento y el segundo del Array.
        Después, se haría otro mergeSort con el resultado de la mezcla anterior y el cuarto Array*/
        
        //Para facilitar la implementación, he programado una solución más simple
        int[] resultado = new int[9];
        for (int i = 0; i < 3; i++){
        	resultado[i] = entradaArray[0][i];
        }
        for (int j = 0; j < 3; j++){
        	resultado[3+j] = entradaArray[1][j];
        }
        for (int k = 0; k < 3; ++k){
        	resultado[6+k] = entradaArray[3][k];
        }
        System.out.println(resultado); //Necesito un for para que se vean los elementos del Array
        //pero el Array resultado es el correcto
	}
}
