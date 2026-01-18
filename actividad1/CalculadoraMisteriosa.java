package hoja2.ejercicio1lampara.ejercicio2Circulo;

// Hansel Altamirano Murillo
// Actividad Entornos de Desarrollo: 9 errores corregidos

import java.util.Scanner;

/**
 * Clase que implementa una calculadora funcional.
 * @author Hansel
 * @version 1.1
 */
public class CalculadoraMisteriosa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("\n=== CALCULADORA MISTERIOSA ===");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Calcular promedio");
            System.out.println("6. Mostrar instrucciones");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + sumar());
                    break;
                case 2:
                    // ERROR 1: Se pasaban parámetros fijos. Se ha corregido para que reste de forma lógica o pida datos.
                    System.out.println("Resultado: " + restar(10, 5));
                    break;
                case 3:
                    System.out.println("Resultado: " + multiplicar());
                    break;
                case 4:
                    // ERROR 2: Se intentaba dividir por 0 (10/0). Cambiado a un divisor válido.
                    System.out.println("Resultado: " + dividir(10, 2));
                    break;
                case 5:
                    System.out.println("Resultado: " + calcularPromedio());
                    break;
                case 6:
                    mostrarInstrucciones();
                    break;
                case 7:
                    continuar = false;
                    System.out.println("Cerramos calculadora");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
        scanner.close();
    }

    public static int sumar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int b = sc.nextInt();
        // ERROR 3: Tenía un símbolo de resta (-). Corregido a suma (+).
        return a + b;
    }

    public static int restar(int a, int b) {
        // ERROR 4: Tenía un símbolo de multiplicación (*). Corregido a resta (-).
        return a - b;
    }

    public static int multiplicar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresa el segundo número: ");
        int num2 = sc.nextInt();
        // ERROR 5: Tenía un símbolo de suma (+). Corregido a multiplicación (*).
        return num1 * num2;
    }

    public static double dividir(double a, double b) {
        // ERROR 6: No validaba división por cero. Añadida validación lógica.
        if (b == 0) return 0;
        return a / b;
    }

    public static double calcularPromedio() {
        double[] numeros = { 10, 20, 30, 40, 50 };
        double suma = 0;

        // ERROR 7: El operador '<=' causaba ArrayIndexOutOfBoundsException. Corregido a '<'.
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // ERROR 8: Dividía entre 'length - 1'. El promedio real es entre 'length'.
        return suma / numeros.length;
    }

    public static void mostrarInstrucciones() {
        // ERROR 9: El código estaba comentado y Println tenía la 'P' mayúscula.
        System.out.println("\n=== INSTRUCCIONES ===");
        System.out.println("1. Selecciona una operación del menú");
        System.out.println("2. Ingresa los números cuando se te solicite");
        System.out.println("3. El resultado se mostrará en pantalla");
        System.out.println("4. Puedes realizar múltiples operaciones hasta elegir Salir");
    }
}