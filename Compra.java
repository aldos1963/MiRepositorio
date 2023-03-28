package Clase5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Compra {
	public static void main(String[] args) {
				
		String archivoCarrito = "compracarrito.txt";
		String[] compra = new String[4];
		int i = 0;
		
		//leo y guardo en el vector compra[] cada una de las lineas del carrito
		//compra[0] es la linea de titulos 
			try {
				for (String linea : Files.readAllLines(Paths.get(archivoCarrito))){
					if (i<=4) {
					    compra[i] = linea;
					    i=i+1;
					}
				}    
			    //En cada vector que es un producto guardo los datos de cada linea del carrito.
				//compra[0] no se toma en cuenta porque son los titulos.
			      	String[] itemProducto1 = compra[1].split(",");
					String[] itemProducto2 = compra[2].split(",");
					String[] itemProducto3 = compra[3].split(",");
					
					//instancio los tres productos con los datos traidos de los vectores anteriores.	
					Producto producto1 = new Producto(itemProducto1[1],itemProducto1[0],Float.parseFloat(itemProducto1[2]));
					Producto producto2 = new Producto(itemProducto2[1],itemProducto2[0],Float.parseFloat(itemProducto2[2]));
					Producto producto3 = new Producto(itemProducto3[1],itemProducto3[0],Float.parseFloat(itemProducto3[2]));
					
					Carrito carritoCompra = new Carrito(producto1,producto2,producto3,LocalDateTime.now());
					Persona Cliente = new Persona("Solomeo", "Paredes", LocalDate.parse("1963-12-05"),carritoCompra);
					Carrito CarritoFinal = Cliente.getCarrito();
					
					System.out.println("Cliente: " + Cliente.getNombre() + ' ' + Cliente.getApellido());
					System.out.println(producto1.getNombre() + ' ' + producto1.getPrecio());
					System.out.println(producto2.getNombre() + ' ' + producto2.getPrecio());
					System.out.println(producto3.getNombre() + ' ' + producto3.getPrecio());
					System.out.println("Total Final: " + CarritoFinal.CostoFinal());
				
			} catch (IOException e) {
				    e.printStackTrace();
			}
       }
       
	}
