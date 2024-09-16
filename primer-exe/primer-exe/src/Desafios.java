import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su nombre de usuario completo:");
        String nombreDeUsuario = teclado.nextLine();
        int saldoDisponible = 7000;

        String saludoUsuario = """
                *********************************************
                         Bienvenido(a): %s
                         Tipo de cuenta: Corriente.
                         Saldo disponible: $%d
                *********************************************
                """.formatted(nombreDeUsuario, saldoDisponible);
        System.out.println(saludoUsuario);

        String menuOpciones = """
                *********************************************
                    *Digite el número de la opcion deseada*
                
                1 - Consulte su saldo
                2 - Depositar
                3 - Retirar
                9 - Salir
                *********************************************
                """;
        int opciones = 0;

        while (opciones != 9) {
            System.out.println(menuOpciones);
            opciones = teclado.nextInt();

            switch (opciones) {
                case 1: {
                    System.out.printf("Su saldo disponible es: $%d.%n", saldoDisponible);
                }
                case 2: {

                    System.out.println("Ingrese el valor a depositar:");
                    int valorDepositado = teclado.nextInt();
                    if (valorDepositado > 0) {
                        saldoDisponible += valorDepositado;
                        System.out.printf("Usted ha depositado: $%d. Su saldo total disponible es: $%d.%n", valorDepositado, saldoDisponible);
                    } else {
                        System.out.println("Error: No puede depositar una cantidad negativa.");
                    }
                }
                case 3: {

                    System.out.println("Ingrese el valor a retirar:");
                    int valorRetirado = teclado.nextInt();
                    if (valorRetirado > 0 && valorRetirado <= saldoDisponible) {
                        saldoDisponible -= valorRetirado;
                        System.out.printf("Usted ha retirado: $%d. Su saldo total disponible es: $%d.%n", valorRetirado, saldoDisponible);
                    } else if (valorRetirado > saldoDisponible) {
                        System.out.println("Error: La cantidad a retirar excede su saldo disponible.");
                    } else {
                        System.out.println("Error: No se puede retirar una cantidad negativa.");
                    }
                }
                case 9: {

                    System.out.println("Finalizando el programa... Muchas gracias por utilizar nuestros servicios.");
                }
                default: {

                    System.out.println("Opción no válida. Por favor ingrese una de las opciones del menu.");
                }
            }
        }

        teclado.close();
    }
}
