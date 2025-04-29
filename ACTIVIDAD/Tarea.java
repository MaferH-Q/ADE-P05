package ACTIVIDAD;
// Esta clase representa una tarea real, con un nombre y una prioridad
// Así podemos trabajar con tareas más organizadas que solo usando textos

public class Tarea {
    private String nombre;  // Aquí vamos a guardar el nombre de la tarea
    private int prioridad;  // Aquí vamos a guardar su prioridad

    // Este es el constructor ->  para crear nuevas tareas
    public Tarea(String nombre, int prioridad) {
        this.nombre = nombre;        // Guardamos el nombre que nos pasen
        this.prioridad = prioridad;  // Y también la prioridad que nos digan
    }

    // Estos métodos se llaman getters -> nos permiten leer los datos guardados
    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    // Este método es TOSTRING -> para imprimir bonito una tarea
    
    public String toString() {
        return "Tarea: " + nombre + " (Prioridad: " + prioridad + ")";
    }
}
