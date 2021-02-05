package edu.escuelaing.arep.stat;

import edu.escuelaing.arep.util.MyLinkedList;

/**
 * La clase StatCalculator contiene m�todos que realizan dos operaciones estad�sticas
 * b�sicas: la media y la desviaci�n est�ndar de un conjunto finito de n�meros.
 * @author Federico Barrios Meneses
 */
public class StatCalculator {
    
    /**
     * Constructor por defecto de una calculadora estad�stica que calcula la
     * media y la desviaci�n est�ndar de un arreglo de n�meros.
     */
    public StatCalculator(){
        
    }
    
    /**
     * Calcula la media o promedio de un conjunto finito de n�meros.
     * @param array El arreglo de n�meros cuya media ser� calculada.
     * @return La media del arreglo de n�meros.
     */
    public static Double mean(MyLinkedList<Double> array){
        Double sum = 0.0;
        for(Double n: array){
            sum = sum + n;
        }
        return sum/array.size();
    }
    
    /**
     * Calcula la desviaci�n est�ndar de un conjunto finito de n�meros.
     * @param array El arreglo de n�meros cuya desviaci�n est�ndar ser� calculada.
     * @return La desviaci�n est�ndar del arreglo de n�meros.
     */
    public static Double standardDeviation(MyLinkedList<Double> array){
        Double mean = mean(array);
        Double sum = 0.0;
        for(Double n: array){
            sum = sum + Math.pow(n - mean, 2);
        }
        return Math.sqrt(sum/(array.size()-1));
    }
}