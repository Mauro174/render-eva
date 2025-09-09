package pe.edu.upc.demoeva;

import java.util.Scanner;

public class DemoEvaApplication {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Bienvenido a EVA ===");
            System.out.println("Seleccione su tipo de usuario:");
            System.out.println("1. Persona Mayor");
            System.out.println("2. Familiar");
            System.out.println("3. Personal de Salud");
            System.out.println("0. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    menuPersonaMayor(scanner);
                    break;
                case 2:
                    menuFamiliar(scanner);
                    break;
                case 3:
                    menuPersonalSalud(scanner);
                    break;
                case 0:
                    System.out.println("Gracias por usar EVA. ¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 0);

        scanner.close();
    }

    private static void menuPersonaMayor(Scanner scanner) {
        System.out.println("--- Menú Persona Mayor ---");
        System.out.println("1. Iniciar charla con EVA");
        System.out.println("2. Ver rutina diaria");
        System.out.println("3. Mis temas favoritos");
        System.out.println("4. Mi perfil");
        System.out.println("0. Volver");
    }

    private static void menuFamiliar(Scanner scanner) {
        System.out.println("--- Menú Familiar ---");
        System.out.println("1. Ver estado actual del adulto mayor");
        System.out.println("2. Historial de conversaciones");
        System.out.println("3. Personalizar mensajes");
        System.out.println("4. Reportes");
        System.out.println("0. Volver");
    }

    private static void menuPersonalSalud(Scanner scanner) {
        System.out.println("--- Menú Personal de Salud ---");
        System.out.println("1. Panel de alertas emocionales");
        System.out.println("2. Informes semanales");
        System.out.println("3. Historial de interacciones");
        System.out.println("4. Ficha de residente");
        System.out.println("0. Volver");
    }
}
