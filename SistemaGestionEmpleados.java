import java.util.Scanner;

/**
 * Clase que gestiona la lógica relacionada con los empleados.
 */
public class SistemaGestionEmpleados {

    public static void main(String[] args) {
        // Crear un array de empleados
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", Constantes.CARGO_DESARROLLADOR, 50000);
        empleados[1] = new Empleado("María", Constantes.CARGO_DISEÑADOR, 45000);
        empleados[2] = new Empleado("Pedro", Constantes.CARGO_GERENTE, 60000);

        // Crear un objeto Empleados para gestionar la lista
        Empleados gestorEmpleados = new Empleados(empleados);

        // Solicitar al usuario el porcentaje de aumento de salario
        Scanner scanner = new Scanner(System.in);
        System.out.print(Constantes.MENSAJE_AUMENTO_SALARIO);
        double porcentaje = scanner.nextDouble();

        // Aumentar el salario de los empleados
        gestorEmpleados.aumentarSalario(porcentaje);

        // Mostrar la lista actualizada de empleados
        System.out.println(Constantes.MENSAJE_LISTA_EMPLEADOS);
        gestorEmpleados.mostrarListado();

        scanner.close();
    }
}
