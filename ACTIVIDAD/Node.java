package ACTIVIDAD;
// Esta clase representa un NODO dentro de una lista enlazada
// Un nodo es como una cajita que guarda dos cosas: un dato de cualquier tipo y la dirección del siguiente nodo
public class Node<T> {
    T data;           // Aquí se guarda el dato que queremos almacenar
    Node<T> next;     // Este es el enlace o camino hacia el siguiente nodo en la lista

    // Constructor para crear un nodo cuando recién le damos un dato
    public Node(T data) {
        this.data = data;  // Guardamos el dato que nos pasan
        this.next = null;  // Como es un nodo nuevo, todavía no apunta a nadie (por eso es null)
    }
}
