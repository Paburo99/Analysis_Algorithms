import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Primos
    int numero;
    boolean esPrimo = true;

    Scanner scanner = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    numero = scanner.nextInt();

    esPrimo = primoFinder(numero);
    if (esPrimo) {
      System.out.println("El número " + numero + " es primo.");
    } else {
      System.out.println("El número " + numero + " no es primo.");
    }

    // Ordenamiento
    int[] numeros = { 42, 7, 19, 3, 25 };
    int aux;

    for (int i = 0; i < numeros.length - 1; i++) {
      for (int j = i + 1; j < numeros.length; j++) {
        if (numeros[i] > numeros[j]) {
          aux = numeros[i];
          numeros[i] = numeros[j];
          numeros[j] = aux;
        }
      }
    }

    System.out.print("Números ordenados: ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }
  }

  // Funcion para encontrar primos (simple) :o
  public static boolean primoFinder(int numero) {
    if (numero <= 1) {
      return false; // Los números menores o iguales a 1 no son primos
    }
    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }
}