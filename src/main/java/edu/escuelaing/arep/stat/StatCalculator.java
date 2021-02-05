package edu.escuelaing.arep.stat;

import edu.escuelaing.arep.util.MyLinkedList;

/**
 * La clase StatCalculator contiene métodos que realizan dos operaciones estadísticas
 * básicas: la media y la desviación estándar de un conjunto finito de números.
 * @author Federico Barrios Meneses
 */
public class StatCalculator {
    
    /**
     * Constructor por defecto de una calculadora estadística que calcula la
     * media y la desviación estándar de un arreglo de números.
     */
    public StatCalculator(){
        
    }
    
    /**
     * Calcula la media o promedio de un conjunto finito de números.
     * @param array El arreglo de números cuya media será calculada.
     * @return La media del arreglo de números.
     */
    public static Double mean(MyLinkedList<Double> array){
        Double sum = 0.0;
        for(Double n: array){
            sum = sum + n;
        }
        return sum/array.size();
    }
    
    /**
     * Calcula la desviación estándar de un conjunto finito de números.
     * @param array El arreglo de números cuya desviación estándar será calculada.
     * @return La desviación estándar del arreglo de números.
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