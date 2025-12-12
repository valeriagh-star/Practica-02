//importamos la clase Scanner para leer por consola
import java.util.Scanner;
//importamos la clase Usuario del paquete modulos
import modulos.Usuario;

public class Main {
	public static void main(String[] args) {
		// Crear un objeto Scanner para leer desde la entrada estándar (teclado)
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese Nombre
        System.out.println("Introduce Nombre: ");
        
        // Leer la línea completa ingresada por el usuario
        String nombre = scanner.nextLine();
        
        // Pedir al usuario que ingrese Correo
        System.out.println("Introduce Correo: ");
        
        // Leer la línea completa ingresada por el usuario
        String correo = scanner.nextLine();
        
        // Validar que el correo contenga "@" y termine con ".com"
        while(!correo.contains("@") || !correo.endsWith(".com")) {
			System.out.println("Correo inválido. Introduce un correo válido: ");
			correo = scanner.nextLine();
		}
        // Mostrar las opciones de rol
        System.out.println("Selecciona Rol:");
        System.out.println("1 - Administrador");
        System.out.println("2 - Empleado");

        String rol = scanner.nextLine();
        
        // Validar la opción ingresada
        while(!rol.equals("1") && !rol.equals("2")) {
        	System.out.println("Rol inválido. Selecciona 1 o 2: ");
			rol = scanner.nextLine();
        }	
        // Asignar el rol correspondiente con base a la opción ingresada
		if(rol.equals("1")) {
			rol = "Administrador";
		}else {
			rol = "Empleado";
		}
        // Cerrar el scanner
        scanner.close();
        
        //se crea usuario con los datos ingresados
        Usuario usuario = new Usuario(nombre, correo, rol);
        
        System.out.println("Usuario creado exitosamente:");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Correo: " + usuario.getCorreo());
        System.out.println("Rol: " + usuario.getRol());
        
	}
}