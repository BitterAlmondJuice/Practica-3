import java.util.Scanner;

public class Sesion1 {

    public static int menu(Scanner entrada) {

        int resultado;
        System.out.print("Menú Práctica 3:\n\b1. Insertar persona.\n\b2. Listar Personas\n\b0. Finalizar personas\nIntroduzca una opción del menú: ");
        resultado = entrada.nextByte();
        return resultado;
    }

    public static Persona crearPersona(Scanner entrada) {

        Persona Persona1 = new Persona();
        System.out.println("Nombre: ");
        Persona1.setNombre(entrada.next());
        System.out.println("Edad: ");
        Persona1.setEdad(entrada.nextInt());
        System.out.println("Altura (m): ");
        Persona1.setAltura(entrada.nextDouble());
        System.out.println("Peso (kg): ");
        Persona1.setPeso(entrada.nextDouble());
        System.out.println("Género: ");
        Persona1.setGenero(entrada.next().charAt(0));
        return Persona1;
    }

    public static void main(String[] args) {

        int eleccion;
        Scanner entrada = new Scanner(System.in);
        eleccion = menu(entrada);
        if (eleccion == 1) {
            crearPersona(entrada);
        }
    }

}
