import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("Array de primitivos");
        int[] ints = {9, 6, 3};
        Arrays.sort(ints); // 3, 6, 9
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }

        System.out.println("Array de strings");
        String[] cores = {"Vermelho", "Verde", "Azul"};
        Arrays.sort(cores); // Azul, Verde, Vermelho
        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("Array com um tamanho inicial");
        int[] tamanho = new int[10]; // Array com index de 10
        for (int i = 0; i < tamanho.length; i++) {
            tamanho[i] = i * 100;
        }
        for (int valor : tamanho) {
            System.out.println(valor); // 0 100 200 300 400 500 600 700 800 900
        }

        System.out.println("Copiando um array");
        int[] copia = new int[5];
        // Arraycopy recebe cinco argumentos:
        // 1º - o array original
        // 2º - integer da posição que você quer começar a copiar
        // 3º - o array de destino que receberá a cópia
        // 4º - posição inicial de index do array cópia
        // 5º - quantidade de itens que você quer copiar
        System.arraycopy(tamanho, 5, copia, 0, 5);
        for (int valor : copia) {
            System.out.println(valor); // 500 600 700 800 900
        }

        // Array bidimensional
        String[][] estados = new String[3][2];
        estados[0][0] = "Santa Catarina";
        estados[0][1] = "Florianópolis";
        estados[1][0] = "Paraná";
        estados[1][1] = "Curitiba";
        estados[2][0] = "Rio Grande do Sul";
        estados[2][1] = "Porto Alegre";

        for (int i = 0; i < estados.length; i++) {
            System.out.println("A capital de " + estados[i][0] + " é " +
                    estados[i][1] + ".");
        }
    }
}