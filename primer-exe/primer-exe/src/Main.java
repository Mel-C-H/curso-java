import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Desafios... :D!");
        int celcius = 29;
        double fahrenheith = (celcius*1.8) + 32;
        int temperatura = (int) fahrenheith;
        String texto = """
                La temperatura es de: %d°F
                Esto son %d°C""".formatted(temperatura, celcius);
        System.out.println(texto);
        // Desafio de temperaturas terminado

        Scanner keybrd = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int intentos = 0;
        int numeroUsuario = -1;

        while (numeroAleatorio != numeroUsuario) {
            System.out.println("Escribe un número entre 0 y 100");
            numeroUsuario = keybrd.nextInt();
            intentos++;

            if (numeroUsuario == numeroAleatorio) {
                System.out.println("CORRECTO. BIEN HECHO :D Lo hiciste en: " + intentos + " intentos.");
                break;
            } else if (numeroUsuario > numeroAleatorio) {
                System.out.println("El número es menor");
            } else {
                System.out.println("El número es mayor");
            }
        }
        keybrd.close();

    }

}
