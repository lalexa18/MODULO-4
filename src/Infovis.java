import java.util.Scanner;

public class Infovis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean ndatos = true;

        while (ndatos) {

            System.out.print("\n         ¡Bienvenidos al edificio!\n");

            System.out.print("\nIngrese el nombre del visitante: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la cédula del visitante: ");
            String cedula = scanner.nextLine();

            System.out.print("Ingrese la edad del visitante: ");
            int edad = Integer.parseInt(scanner.nextLine());

            System.out.print("Hora de entrada al edificio (formato Hora:minutos): ");
            String horaEntrada = scanner.nextLine();

            System.out.print("Hora de salida del edificio (formato Hora:minutos): ");
            String horaSalida = scanner.nextLine();

            // Calcular tiempo en el edificio
            int horasEntrada = Integer.parseInt(horaEntrada.split(":")[0]);
            int minutosEntrada = Integer.parseInt(horaEntrada.split(":")[1]);
            int horasSalida = Integer.parseInt(horaSalida.split(":")[0]);
            int minutosSalida = Integer.parseInt(horaSalida.split(":")[1]);

            int tiempoTotalMinutos = (horasSalida * 60 + minutosSalida) - (horasEntrada * 60 + minutosEntrada);

            System.out.println("\n     Resumen de la visita:");
            System.out.println("Nombre: " + nombre);
            System.out.println("Cédula: " + cedula);
            System.out.println("Edad: " + edad);
            System.out.println("Tiempo en el edificio: " + tiempoTotalMinutos + " minutos");

            // Verificar si es mayor de edad
            if (edad >= 18) {
                System.out.println("El visitante es mayor de edad.");
            } else {
                System.out.println("El visitante es menor de edad.");
            }

            // Preguntar si desea ingresar nuevos datos
            System.out.print("\n¿Desea ingresar nuevos datos? (S/N): ");
            String respuesta = scanner.nextLine().toUpperCase();

            if (!respuesta.equals("S")) {
                ndatos = false;
                System.out.println("\n¡Hasta luego!");
            }
        }
    }
}