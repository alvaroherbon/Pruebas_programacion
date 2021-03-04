package Java;

import java.util.Scanner;

public class codificado_romano {

  public static final String abecedario = "abcdefghijklmnñopqrstuvwxyz";

  public static void main(String[] args) {
    System.out.println("Introduce la palabra a codificar");
    Scanner entrada = new Scanner(System.in);
    String palabra = entrada.nextLine();
    System.out.println("Introduce el valor de codificado");
    int valor = entrada.nextInt();
    codificar(palabra, valor);

  }

  public static void codificar(String entrada, int valor) {
    String respuesta = "";
    for (int i = 0; i < entrada.length(); i++) {
      char letra = (char) (entrada.charAt(i) + valor);
      respuesta = respuesta + letra;

    }
    System.out.println(respuesta);
  }
}
