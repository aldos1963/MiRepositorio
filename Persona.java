package Clase5;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Persona {

	// atribuitos
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	private Carrito carrito;
	
	//Construtor
	public Persona (String nombre, String apellido, LocalDate fechaDeNacimiento, Carrito carrito) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechaDeNacimiento = fechaDeNacimiento;
		
		this.carrito = carrito;

	}

	//Getters y Seters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String nombre) {
		this.apellido = nombre;
	}
	
	public LocalDate getfechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	
	public Carrito getCarrito() {
		 return carrito;
	}
	
	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}
	
	
	// devuelve la edad
	public int Edad() {
		LocalDateTime fechaHoy = LocalDateTime.now();
		int anioActual = fechaHoy.getYear();
		int edad = anioActual - this.fechaDeNacimiento.getYear();
		if (fechaHoy.getMonthValue() < this.fechaDeNacimiento.getMonthValue()) {
			edad = edad -1;
		} 
		else
		{
			 if (fechaHoy.getDayOfMonth() < fechaDeNacimiento.getDayOfMonth()) {
				 edad = edad -1;
			 }		
		}
		return edad;
		
	}
	
	
}
