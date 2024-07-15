package Ejercicio;

import java.util.ArrayList;
import java.util.List;

/*
 * Implementa un método para devolver todos los subconjuntos de un arreglo de enteros
 * 
 * Se puede sin recursividad
 * Ejemplo:
 *  Input: [1,2,3]
 *
 *  Output:
 *    [
 *      [1,2,3],
 *      [1,2],
 *      [1,3],
 *      [2,3],
 *      [1],
 *      [2],
 *      [3],
 *      []
 *    ]
 * 
 * El  metodo me debe devolver una lista de listas de enteros. 
 * Se puede usar varios metodos 
 * 
 * Ecoja la mejor estructura de datos para que sea mas eficiente
 */
public class EjercicioUno {

   // Método que devuelve todos los subconjuntos de un conjunto dado
   public List<List<Integer>> subsets(List<Integer> set) {
    // Inicializa la lista que contendrá todos los subconjuntos
    List<List<Integer>> result = new ArrayList<>();
    // Añade el subconjunto vacío
    result.add(new ArrayList<>());

    // Itera sobre cada número en el conjunto de entrada
    for (int num : set) {
        // Almacena el tamaño actual de result
        int size = result.size();
        // Itera sobre cada subconjunto existente en result
        for (int i = 0; i < size; i++) {
            // Crea un nuevo subconjunto basado en el subconjunto actual
            List<Integer> subset = new ArrayList<>(result.get(i));
            // Añade el número actual al nuevo subconjunto
            subset.add(num);
            // Añade el nuevo subconjunto a la lista de resultados
            result.add(subset);
        }
    }

    // Devuelve la lista de todos los subconjuntos
    return result;
}
}
