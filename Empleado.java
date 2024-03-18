class Empleado {
    /** Nombres */
    private String nombre;
    private String cargo;
    private double salario;

    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * Obtiene el cargo
 * @return El cargo del empleado
 */
    public String getCargo() {
        return cargo;
    }
/**
 * Establece el cargo
 * @param cargo El nuevo cargo
 */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
/**
 * Establece el salario
 * @return
 */
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", cargo='" + cargo + '\'' +
                ", salario=" + salario +
                '}';
    }

    public void aumentarSalario(double porcentaje) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'aumentarSalario'");
    }

    public void mostrarListado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarListado'");
    }
}