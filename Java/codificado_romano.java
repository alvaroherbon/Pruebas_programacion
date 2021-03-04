package Java;

import java.util.Scanner;

public class codificado_romano {

  public static final String abecedario = "abcdefghijklmnñopqrstuvwxyz";

  public static void main(String[] args) {
    System.out.println("Introduce la frase a codificar");
    Scanner entrada = new Scanner(System.in);
    String oracion = entrada.nextLine();
    System.out.println("Introduce el valor de codificado");
    int valor = entrada.nextInt();
    String[] palabras = oracion.split(" ");
    for (int i = 0; i < palabras.length; i++) {
      codificar(palabras[i], valor);
    }
    entrada.close();
  }

  public static void codificar(String entrada, int valor) {
    String respuesta = "";
    for (int i = 0; i < entrada.length(); i++) {
      int pos_letra = abecedario.lastIndexOf(entrada.charAt(i));
      char letra = abecedario.charAt((pos_letra + valor) % 27);
      respuesta = respuesta + letra;
      // char letra = (char) (entrada.charAt(i) + valor);
      // respuesta = respuesta + letra;

    }
    System.out.print(respuesta + " ");
  }
}
