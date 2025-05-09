package EJERCICIO.Ejercicio3456;

// Esta clase representa un nodo generico para nuestra lista enlazada
class Node<T> {
    T data;         // Este es el dato que el nodo guarda 
    Node<T> next;   // Esta es la que apunta al siguiente nodo en la lista

    public Node(T data) {
        this.data = data;
        this.next = null; // Al crear un nodo nuevo este  todavia no esta conectado a nada
    }

    //Este es del ejercicio 3 
    // Este metodo agrega un nuevo nodo al final de la lista enlazada
    public static <T> Node<T> insertarAlFinal(Node<T> head, T valor) {
        Node<T> nuevoNodo = new Node<>(valor); // Creamos el nuevo nodo con el dato que nos dan

        if (head == null) {
            // Si la lista está vacía -> el nuevo nodo será el primero
            return nuevoNodo;
        }

        // Si ya hay nodos ->  recorremos hasta el ultimo
        Node<T> actual = head;
        while (actual.next != null) {
            actual = actual.next; // Seguimos hasta encontrar el ultimo nodo
        }
        // Ahora conectamos el ultimo nodo al nuevo nodo
        actual.next = nuevoNodo;
        // Devolvemos el head original porque la cabeza no cambia
        return head;
    }

    //Ejercicio 4
    // Este metodo cuenta cuantos nodos hay en una lista enlazada
    public static <T> int contarNodos(Node<T> head) {
        int contador = 0;               // Comenzamos con cero
        Node<T> actual = head;          // Empezamos desde el primer nodo

        while (actual != null) {
            contador++;                 // Cada vez que encontramos un nodo -> sumamos 1
            actual = actual.next;       // Pasamos al siguiente nodo
        }
        return contador; // Devolvemos cuantos nodos encontramos
    }

    //Ejercicio 5 
    // Este metodo compara dos listas enlazadas y devuelve true si son exactamente iguales
    public static <T> boolean sonIguales(Node<T> head1, Node<T> head2) {
        Node<T> actual1 = head1; // Primer nodo de la primera lista
        Node<T> actual2 = head2; // Primer nodo de la segunda lista

        // Recorremos ambas listas al mismo tiempo
        while (actual1 != null && actual2 != null) {
            // Si los datos no son iguales -> devolvemos false
            if (!actual1.data.equals(actual2.data)) {
                return false;
            }
            // Pasamos al siguiente nodo en ambas listas
            actual1 = actual1.next;
            actual2 = actual2.next;
        }
        // Si ambas listas terminaron al mismo tiempo -> son iguales
        return actual1 == null && actual2 == null;
    }

    //Ejercicio 6
    // Este metodo une dos listas enlazadas en una sola
    public static <T> Node<T> concatenarListas(Node<T> lista1, Node<T> lista2) {
        if (lista1 == null) {
            // Si la primera lista esta vacia -> devolvemos la segunda lista
            return lista2;
        }
        Node<T> actual = lista1; // Empezamos desde el principio de la primera lista
        // Recorremos hasta el ultimo nodo de la primera lista
        while (actual.next != null) {
            actual = actual.next; // Seguimos avanzando
        }
        // Ahora el ultimo nodo de la primera lista apunta al inicio de la segunda
        actual.next = lista2;
        // Devolvemos la primera lista ->  que ahora tiene todo unido
        return lista1;
    }

}

