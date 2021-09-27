package proyecto.final1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class MainProyecto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner LS = new Scanner (System.in); 
	Scanner LI = new Scanner (System.in);
	Scanner LD = new Scanner (System.in);
	
		int op,i, op3, op4, op5;
		String op1, lr, ce, op2, ceb;
		String nb;
		boolean resultado;
		
	    String codigo;
		String nombre; 
	    String autor; 
	    String anioPublicacion; 
	    String editorial; 
	    int cantidadPaginas; 
	    double precio;
		String codigoA; 
		int tiempoLectura;
		
		Date date = new Date();
		LocalDate diaHoy = LocalDate.now();
		LocalDate diaEntrega = diaHoy.plusDays(5);
		diaHoy.plusDays(5);
		LocalDate fechaD = diaHoy.plusDays(10);
  	  diaHoy.plusDays(10);
  	    LocalDate diaPlazo = diaEntrega.plusDays(5);
	    diaEntrega.plusDays(5);
		
		LibroEstudiante libro; 
		
		LibroEstudiante libro1 = new LibroEstudiante(); 
		libro1.setCodigo("LIB-01");
		libro1.setNombre("Matematicas");
		libro1.setAutor("Jorge Lara");
		libro1.setAnio("2013");
		libro1.setEstado("Disponible");
		libro1.setFecha(diaHoy);
		
		LibroEstudiante libro2 = new LibroEstudiante(); 
		libro2.setCodigo("LIB-02");
		libro2.setNombre("Matematicas");
		libro2.setAutor("Cristian");
		libro2.setAnio("2015");
		libro2.setEstado("Disponible");
		libro2.setFecha(diaHoy);
		
		LibroEstudiante libro3 = new LibroEstudiante(); 
		libro3.setCodigo("LIB-03");
		libro3.setNombre("Matematicas");
		libro3.setAutor("Jorge Lara");
		libro3.setAnio("2017");
		libro3.setEstado("Disponible");
		libro3.setFecha(diaHoy);
		
		
		List < LibroEstudiante > biblioteca =  new  ArrayList < LibroEstudiante > ();
		biblioteca.add(libro1);
		biblioteca.add(libro2);
		biblioteca.add(libro3);
		
	do {	
	System.out.println("--------SISTEMA BIBLIOTECARIO--------");
	System.out.println("1.- Estudiantes.");
	System.out.println("2.- Bibilotecario.");
	System.out.println("3.- SALIR.");
	
	op = LI.nextInt();
	
	if(op == 1) {
		System.out.println("a. Consultar Libros.");
		System.out.println("b. Reservar Libro.");
		op1 = LS.nextLine();
		
       if(op1.equals("a")) { 
    	   System.out.println("Ingrese nombre del Libro: ");
    	   nb = LS.nextLine();
    	   
    	   for(i = 0; i < biblioteca.size(); i++) {
    		    libro = biblioteca.get(i);
       resultado = libro.getNombre().contains(nb);
     if (resultado == true) {
    	 
    	 System.out.println();
    	 System.out.println(biblioteca.get(i));
    	 System.out.println();
     }else {
    	 System.out.println("No se encuentra."); 
     
     }
 
    	   }
    	   }else if(op1.equals("b")) {
    		  System.out.println("Ingrese codigo del libro a reservar: ");
    		  lr = LS.nextLine();
    		  System.out.println("Ingrese cedula del Estudiante: "); 
    		  ce = LS.nextLine(); 
    		  
    		  for(i = 0; i < biblioteca.size(); i++) {
    			   libro = biblioteca.get(i);
    		       resultado = libro.getCodigo().contains(lr);
    		  if (resultado == true) {
            	 if(libro.getEstado().equals("Disponible")) {
    		    libro.setEstado("Reservado");
    		    libro.setFecha(diaEntrega);
    		    libro.setCedula(ce);
    System.out.println("El libro ha sido correctamente reservado, pase a la biblioteca por el. ");
    		    	 }
    		    	 
    		    }else {
    		System.out.println("Libro no Disponible.");
System.out.println("EL libro estará disponible el: " +fechaD.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    		     
    		     }     	 
    		     }
    	   }else {
    		   System.out.println("Opcion inexistente. ");
    	   }
    	   }else if(op == 2) {
    		   System.out.println("a. Ingresar un libro.");
    			System.out.println("b. Prestar un libro.");
    			System.out.println("c. Aplazar fecha de entrega.");
    		    op2 = LS.nextLine();
    	    
    		   if(op2.equals("a")) {
    		System.out.println("Ingrese Codigo: "); 
    		   codigo = LS.nextLine();
    		   System.out.println("Ingrese Nombre: "); 
    		   nombre = LS.nextLine();
    		   System.out.println("Ingrese Autor: "); 
    		   autor = LS.nextLine();
    		   System.out.println("Ingrese Año de publicacion: "); 
    		   anioPublicacion = LS.nextLine();
    		   System.out.println("Ingrese Editorial: "); 
    		   editorial = LS.nextLine();
    		   System.out.println("Ingrese Cantidad de paginas: "); 
    		   cantidadPaginas = LI.nextInt();
    		   System.out.println("Ingrese Precio: "); 
    		   precio = LD.nextDouble();
    		   System.out.println("1.- Libro de Trabajo. "); 
    		   System.out.println("2.- Libro lectura. "); 
    		   op3 = LI.nextInt();
    		   
    		   if(op3 == 1) {
    			   System.out.println("Ingrese Codigo de autorizacion: "); 
        		   codigoA = LS.nextLine();
        		   
        		   LibroTrabajo librot = new LibroTrabajo();
        		   librot.setCodigo(codigo);
        		   librot.setNombre(nombre);
        		   librot.setAutor(autor);
        		   librot.setAnioPublicacion(anioPublicacion);
        		   librot.setEditorial(editorial);
        		   librot.setCantidadPaginas(cantidadPaginas);
                   librot.setPrecio(precio);
                   librot.setCodigoAutorizacion(codigoA);
            
    		   }else if(op3 == 2){
    			   System.out.println("Tiempo aproximado de lectura (minutos): "); 
        		   tiempoLectura = LI.nextInt();
        		   LibroLectura librol = new LibroLectura();
        		   librol.setCodigo(codigo);
        		   librol.setNombre(nombre);
        		   librol.setAutor(autor);
        		   librol.setAnioPublicacion(anioPublicacion);
        		   librol.setEditorial(editorial);
        		   librol.setCantidadPaginas(cantidadPaginas);
                   librol.setPrecio(precio);
    		       librol.setTiempoLectura(tiempoLectura);
    		       
    		   }else {
    			   System.out.println("Opcion no existente. ");
    		   }
    	   }else if(op2.equals("b")) {
    		   System.out.println("Ingrese codigo del libro a reservar: ");
     		  lr = LS.nextLine();  
     		  for(i = 0; i <biblioteca.size(); i++) {
     			   libro = biblioteca.get(i);
     		       resultado = libro.getCodigo().contains(lr);
     		     if (resultado == true) {
     		    	 if(libro.getEstado().equals("Reservado")){
     		    	 System.out.println();
     		    	 System.out.println(biblioteca.get(i));
     		    	System.out.println();
     		    	 
     		        System.out.println("1.- Prestar. ");
         		    System.out.println("2.- No Prestar. ");
         		    op4 = LI.nextInt();
         		    if(op4 == 1) {
         		    	libro.setEstado("Prestado");
System.out.println("La fecha de entrega del libro es el: " +diaEntrega.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
             }else {
           	 System.out.println("No se le presto el libro. ");
             }
             }else {
           	 System.out.println("No esta Reservado. "); 	
             }
     		   }else {
     	  	 System.out.println("Libro no existente. ");
     		   }
    	   }
	}else if(op2.equals("c")) {
		System.out.println("Ingrese codigo del libro a reservar: ");
		  lr = LS.nextLine();  
		  System.out.println("Ingrese la cedula del Estudiante: ");
		  ce = LS.nextLine();
		  for(i = 0; i <biblioteca.size(); i++) {
			   libro = biblioteca.get(i);
		       resultado = libro.getCodigo().contains(lr);
		     if (resultado == true) {
		    	 System.out.println();
		    	 System.out.println(biblioteca.get(i));
		    	 System.out.println();
		    	 
		    	 System.out.println("1.- Aplazar. ");
      		    System.out.println("2.- No Aplazar. ");
      		    op5 = LI.nextInt();
		  if(op5 == 1 && libro.getCedula().equals(ce) && libro.getEstado().equals("Prestado")) {
System.out.println("La fecha de entrega del libro se aplazo hasta el: " +diaPlazo.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
		    }else if(op5 == 2){
		  	  System.out.println("No se le aplazó la fecha.");  
		     }
		     }else {
		   System.out.println("El libro no es encontrado. ");
		     }
		     
		  }
		  }else {
	  System.out.println("Opcion inexistente. ");
		  }
   	   
      }else {
  	   System.out.println("Opcion inexistente. "); 
       }
	}while(op != 3);
	System.out.println("Gracias por preferirnos.");
	}
}
	
