package Practico5.ejercicio1;

public class Persona {
	//atributos o campos o variables de instancia
	private String nombre;
	private int edad;
	private boolean sexo;
	private String ci;
	private int edadMinima;
	
	//encapsulamiento (doy acceso con get y set)
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) throws Exception {
		if (edad < 0) {
			//System.out.println("La edad no puede ser negativa");
			throw new Exception("La edad no puede ser negativa");
		} else {
			this.edad = edad;
		}
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}
	
	public Persona(String unNombre, int unaEdad, boolean unSexo, String unaCi) {
		this.nombre = unNombre;
		this.edad = unaEdad;
		this.sexo = unSexo;
		this.ci = unaCi;
	}//fin del constructor Persona
	
	
	public static boolean validarCi(String unaCi) {
		//algoritmo de validar CI
		return true;
	}
	
	public void imprimirPersona() {
		/*********** DATOS DE Nombre Apellido *********************************
		sexo: hombre o mujer
		CI: xxxxxxx-x
		edad: #edad [menor de edad / mayor de edad]
		*****************************************************************************/
		
		System.out.println("************** DATOS DE " + this.nombre + " ****************");
		if (this.sexo == true) {
			System.out.println("Sexo: Femenino");
		} else {
			System.out.println("Sexo: Masculino");
		}
		System.out.println("CI: " + this.ci);
		System.out.print("edad: ");
		if (this.edad < 18) {
			System.out.println(this.edad + " [menor de edad]");
		} else {
			System.out.println(this.edad + " [mayor de edad]");
		}
		System.out.println("");
		System.out.println("**************************************************************");
				
	}
	

}