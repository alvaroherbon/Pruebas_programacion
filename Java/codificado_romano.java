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
            System.out.print(codificar(palabras[i], valor));
        }
        System.out.println("");
        System.out.println("introduce la oracion a descodificar");
        Scanner entrada2 = new Scanner(System.in);
        String respuesta = entrada2.nextLine();
        System.out.println("introduce el valor");
        int valor2 = entrada2.nextInt();
        String[] palabras_deco = respuesta.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            System.out.print(decodificar(palabras_deco[i], valor2));
        }

        entrada.close();
        entrada2.close();
    }

    public static String codificar(String entrada, int valor) {
        String respuesta = "";
        for (int i = 0; i < entrada.length(); i++) {
            int pos_letra = abecedario.lastIndexOf(entrada.charAt(i));
            char letra = abecedario.charAt((pos_letra + valor) % 27);
            respuesta = respuesta + letra;
            // char letra = (char) (entrada.charAt(i) + valor);
            // respuesta = respuesta + letra;

        }
        return (respuesta + " ");
        // System.out.print(respuesta + " ");
    }

    public static String decodificar(String entrada, int valor) {
        String respuesta = "";
        for (int i = 0; i < entrada.length(); i++) {
            int pos_letra = abecedario.lastIndexOf(entrada.charAt(i));
            char letra = abecedario.charAt((pos_letra - valor) % 27);
            respuesta = respuesta + letra;
            // char letra = (char) (entrada.charAt(i) + valor);
            // respuesta = respuesta + letra;

        }
        return (respuesta + " ");
    }
}
