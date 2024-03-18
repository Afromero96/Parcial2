import java.util.Arrays;

public class Empleados {
    private Empleado[] lista;

     /**
     * Constructor de la clase Empleados.
     * @param empleados El array de empleados para inicializar la lista.
     */
    public Empleados(Empleado[] lista) {
        this.lista = lista;
    }
    /**
     * Obtiene la lista de empleados.
     * @return La lista de empleados.
     */

    public void mostrarListado() {
        for (Empleado empleado : lista) {
            System.out.println(empleado);
        }
    }
/**
     * Aumenta el salario de todos los empleados en un porcentaje dado.
     * @param porcentaje Porcentaje de aumento de salario.
     */
    public void aumentarSalario(double porcentaje) {
        for (Empleado empleado : lista) {
            double nuevoSalario = empleado.getSalario() * (1 + porcentaje / 100);
            empleado.setSalario(nuevoSalario);
        }
    }

      /**
     * Agrega un nuevo empleado a la lista.
     * @param empleado El empleado a agregar.
     */
    public void darAltaEmpleado(String nombre, String cargo, double salario) {
        // Crear un nuevo empleado y agregarlo al final de la lista
        Empleado nuevoEmpleado = new Empleado(nombre, cargo, salario);
        lista = Arrays.copyOf(lista, lista.length + 1);
        lista[lista.length - 1] = nuevoEmpleado;
    }
}
