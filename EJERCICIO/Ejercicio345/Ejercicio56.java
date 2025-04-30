package EJERCICIO.Ejercicio345;

public class Ejercicio56 {
    public static void main(String[] args) {
        // Creamos dos listas iguales
        Node<String> lista1 = null;
        Node<String> lista2 = null;

        lista1 = Node.insertarAlFinal(lista1, "Lavar");
        lista1 = Node.insertarAlFinal(lista1, "Estudiar");
        lista1 = Node.insertarAlFinal(lista1, "Dormir");

        lista2 = Node.insertarAlFinal(lista2, "Lavar");
        lista2 = Node.insertarAlFinal(lista2, "Estudiar");
        lista2 = Node.insertarAlFinal(lista2, "Dormir");

        // Comparamos las listas
        boolean iguales = Node.sonIguales(lista1, lista2);
        System.out.println("¿Las listas son iguales? " + iguales); // true

        // Cambiamos un dato en lista2
        lista2 = Node.insertarAlFinal(lista2, "Correr");
        iguales = Node.sonIguales(lista1, lista2);
        System.out.println("¿Las listas son iguales después de modificar? " + iguales); // false
    
        //Ejercicio 6
        // Concatenamos ambas listas
        Node<String> listaUnida = Node.concatenarListas(lista1, lista2);
        // Imprimimos la lista resultante
        System.out.println("Lista concatenada:");
        Node<String> actual = listaUnida;
        while (actual != null) {
            System.out.println("- " + actual.data);
            actual = actual.next;
    }
}   
}