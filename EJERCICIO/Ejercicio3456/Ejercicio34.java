package EJERCICIO.Ejercicio345;

public class Ejercicio34 {

    public static void main(String[] args) {
        Node<String> head = null; // Creamos una lista vacía (sin nodos)

        // Insertamos tareas una por una (NODOS )(Ejercicio 3)
        head = Node.insertarAlFinal(head, "Lavar");
        head = Node.insertarAlFinal(head, "Estudiar");
        head = Node.insertarAlFinal(head, "Dormir");
        
        // Recorremos e imprimimos la lista
        System.out.println("Tareas en la lista enlazada:");
        Node<String> actual = head;
        while (actual != null) {
            System.out.println("- " + actual.data);
            actual = actual.next;
        }
        // Ahora contamos los nodos(Ejercicio 4)
        int total = Node.contarNodos(head);
        System.out.println("\nTotal de tareas: " + total);
    }

    
}

