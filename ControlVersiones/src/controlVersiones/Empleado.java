package controlVersiones;
/**
 * 
 * @author Irkus
 * @version Version 1, 2021
 * @since 24/05/2021
 *
 */
public class Empleado {
	private String nombre;//nombre empleado
	private String apellidos;//apellidos del empleado
	private double salario; //salario del empleado

//constructor
public Empleado(String nombre, String apellido, double salario) {
	this.nombre = nombre;
	this.apellidos = apellido;
	this.salario = salario;
}



public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellidos() {
	return apellidos;
}
public void setApellidos(String apellidos) {
	this.apellidos = apellidos;
}
public double getSalario() {
	return salario;
}
public void setSalario(double salario) {
	this.salario = salario;
}
//le sube el salario al empleado le suma a su salario una cantidad determinada
public void subirsalario (double subida) {
	salario=salario+subida;
}


}
