package EJERCICIO;

import java.util.List;
import java.util.ArrayList;


public class Ejercicio2 {

    // Este metodo invierte el orden de una lista generica y devuelve una nueva lista con los elementos invertidos
    public static <T> List<T> invertirLista(List<T> listaOriginal) {
        List<T> listaInvertida = new ArrayList<>(); // Creamos una nueva lista vacía
        // Recorremos la lista original desde el final hasta el principio
        for (int i = listaOriginal.size() - 1; i >= 0; i--) {
            listaInvertida.add(listaOriginal.get(i)); // Vamos añadiendo cada elemento desde atras hacia adelante
        }
        return listaInvertida; // Retornamos la lista con los elementos en orden inverso
    }

    public static void main(String[] args) {
        // Creamos una lista generica con valores de tipo String
        List<String> tareas = new ArrayList<>();
        tareas.add("Lavar");
        tareas.add("Estudiar");
        tareas.add("Dormir");
        // Imprimimos la lista original
        System.out.println("Lista original:");
        for (String tarea : tareas) {
            System.out.println("- " + tarea);
        }
        // Llamamos a la función para invertir la lista
        List<String> tareasInvertidas = invertirLista(tareas);
        // Imprimimos la lista invertida
        System.out.println("\nLista invertida:");
        for (String tarea : tareasInvertidas) {
            System.out.println("- " + tarea);
        }
    }
}

