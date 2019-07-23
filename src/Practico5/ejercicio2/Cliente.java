package Practico5.ejercicio2;

public class Cliente {
	private int id;
	private String nombre;
	private int edad;
	private boolean sexo;
	private String ci;

	private Cuenta[] arrCuentas;

	private int tope;

	public int getId() {
		return id;
	}//fin de get ID

	public String getNombre() {
		return nombre;
	}//fin de getNombre

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}//fin de setNombre

	public String getCi() {
		return ci;
	}//fin de getCi

	public void setCi(String ci) {
		this.ci = ci;
	}//fin de setCi

	public int getEdad() {
		return edad;
	}//fin de getEdad

	public void setEdad(int edad) {
		if (edad < 18) {
			throw new IllegalArgumentException("No puede hacer menores de edad como clientes");
		} else {
			this.edad = edad;
		}//fin del else

	}//fin de setEdad

	public Cuenta[] getArrCuentas() {
		return arrCuentas;
	}
	
	//constructor de la clase
	public Cliente(int id, String nombre, String ci, int edad, int cantCuentas){
		this.setNombre(nombre);
		this.id++;
		this.setEdad(edad);
		this.setCi(ci);
		this.arrCuentas = new Cuenta[cantCuentas];
		this.tope = 0;

	}

}//fin clase Cliente
