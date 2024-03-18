import java.util.Scanner;

public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        Empleado[] empleados = new Empleado[3];
        empleados[0] = new Empleado("Juan", Constantes.CARGO_DESARROLLADOR, 50000);
        empleados[1] = new Empleado("María", Constantes.CARGO_DISEÑADOR, 45000);
        empleados[2] = new Empleado("Pedro", Constantes.CARGO_GERENTE, 60000);

        Empleados gestorEmpleados = new Empleados(empleados);

        Scanner scanner = new Scanner(System.in);
        System.out.print(Constantes.MENSAJE_AUMENTO_SALARIO);
        double porcentaje = scanner.nextDouble();

        gestorEmpleados.aumentarSalario(porcentaje);

        System.out.println(Constantes.MENSAJE_LISTA_EMPLEADOS);
        gestorEmpleados.mostrarListado();

        scanner.close();
    }
}

