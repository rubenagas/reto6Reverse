import java.util.Scanner;

/* Reto Mouredev:
 * Reto #6
 * INVIRTIENDO CADENAS
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea un programa que invierta el orden de una cadena de texto sin usar funciones propias del lenguaje que lo hagan de forma automática.
 * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
 */
public class Main {
    public static void main(String[] args) {

        String pal1;

        //Solicitamos una cadena
        System.out.println("Escribe una cadena: ");
        Scanner scanner = new Scanner(System.in);
        pal1 = scanner.nextLine();

        for (int i = pal1.length() - 1;i >= 0; i--){
            System.out.print(pal1.charAt(i));
        }
    }
}