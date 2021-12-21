import java.util.Scanner;

public class Sesion2 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ListaPersonas listaPersonas = new ListaPersonas();
        Persona persona = null;
        int resultado = Sesion1.menu(entrada);
        while (resultado != 0){
            switch (resultado) {
                case 1:
                    persona = Sesion1.crearPersona(entrada);
                    listaPersonas.insertarPersona(persona);
                    break;
                case 2:
                    listaPersonas.mostrarListaPersonas();
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    System.out.println("ño");
                    break;
                case 0:
                    break;
            }
            resultado = Sesion1.menu(entrada);

            }
        }
    }


