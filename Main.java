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
    int[] numeros = { 42, 7, 19, 3, 25, 6, 99, 1, 23};

    System.out.println("Seleccione el tipo de ordenamiento: ");
    System.out.println("1. Bubble Sort");
    System.out.println("2. Quick Sort");
    int opcion = scanner.nextInt();

    switch (opcion) {
      case 1:
        bubbleSort(numeros);
        break;
      case 2:
        quickSort(numeros, 0, numeros.length - 1);
        break;
      default:
        System.out.println("Opción no válida.");
    }

    System.out.print("Números ordenados: ");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i] + " ");
    }
  }

  // Funcion para encontrar primos (simple) :o
  public static boolean primoFinder(int numero) {
    if (numero == 1) {
      return false;
    }
    for (int i = 2; i < numero; i++) {
      if (numero % i == 0) {
        return false;
      }
    }
    return true;
  }

  // Bubble Sort
  public static void bubbleSort(int[] array) {
    int aux;

    for (int i = 0; i < array.length - 1; i++) {
      for (int j = i + 1; j < array.length; j++) {
        if (array[i] > array[j]) {
          aux = array[i];
          array[i] = array[j];
          array[j] = aux;
        }
      }
    }
  }

  // Quick Sort Algorithm
  public static void quickSort(int[] array, int left, int right) {
    if (left >= right)
      return;

    int pivot = right;
    int j = left - 1;
    int aux;
    for (int i = left; i < pivot; i++) {
      if (array[i] < array[pivot]) {
        j++;
        if (i != j) {
          aux = array[i];
          array[i] = array[j];
          array[j] = aux;
        }
      }
      if (i == pivot - 1) {
        j++;
        aux = array[pivot];
        array[pivot] = array[j];
        array[j] = aux;
        pivot = j;
      }
    }
    quickSort(array, left, pivot - 1);
    quickSort(array, pivot + 1, right);

  }
}