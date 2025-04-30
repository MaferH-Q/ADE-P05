package EJERCICIO;

import java.util.List;
import java.util.ArrayList;

public class Ejercicio1 {

    // Este metodo busca si un valor esta dentro de una lista generica de Java
    public static <T> boolean buscarElemento(List<T> lista, T valor) {
        return lista.contains(valor); // usamos el metodo contains de Java, que compara con equals
    }

    public static void main(String[] args) {
        // Creamos una lista generica de Strings
        List<String> tareas = new ArrayList<>();
        tareas.add("Lavar");
        tareas.add("Estudiar");
        tareas.add("Dormir");

        // Probar si la tarea Estudiar está en la lista
        System.out.println("¿Está Estudiar? " + buscarElemento(tareas, "Estudiar")); // true

        // Probar si la tarea Correr está en la lista
        System.out.println("¿Está Correr? " + buscarElemento(tareas, "Correr")); // false
    }
}
