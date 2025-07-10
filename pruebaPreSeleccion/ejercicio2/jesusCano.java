/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sopadeletras;

import java.util.Scanner;

/**
 *
 * @author DANIEL
 */
public class SopaDeLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el tamanio de las fila");
        int fila = sc.nextInt();

        System.out.println("ingrese la columna");
        int columna = sc.nextInt();
        sc.nextLine();
        char[][] matriz = new char[fila][columna];
        System.out.println("fila " + fila + " colom" + columna);
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.println("ingrese una letra");
                char letra = sc.next().charAt(0);
                matriz[i][j] = letra;
            }

        }
        sc.nextLine();
        System.out.println("temino de llenar la sopa");
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < columna; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");
        }

        System.out.println("ingrese una palabra a buscar");
        String palabra = sc.nextLine();
        boolean encontro = false;
        int contador = 0;
        int tamanio = palabra.length();
        char[] array = new char[tamanio];
        for (int i = 0; i < palabra.length(); i++) {
            array[i] = palabra.charAt(i);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("hhhhh"+i);
        }

        // buscar por orizontal 
        for (int p = 0; p < array.length; p++) {
            int seguro = p;

            for (int i = 0; i < fila; i++) {
                for (int j = 0; j < columna; j++) {
                    System.out.println("i j"+i+" "+j+" "+p);
                    System.out.println(" kkkkk"+matriz[i][j]);
                    
                    if (array[p] == matriz[i][j]) {
                        contador += 1;
                        if (contador == tamanio) {
                            System.out.println("palabra encontrada horizontal ubicacion es x =" + i + " y =" + (1 + (j - tamanio)));
                            encontro = true;
                            return;
                        }
                        
                        p += 1;

                    } else {
                        p = seguro;
                        contador = 0;
                    }

                }
                contador =0;
            }
            break;
        }
        if (encontro == false) {
            System.out.println("no la encontro en la horizontal");
            contador = 0;
            //verticar
            for (int p = 0; p < palabra.length(); p++) {
                System.out.println("llego aca ");
                int seguro = p;

                for (int i = 0; i < fila ; i++) {
                    for (int j = 0; j < columna ; j++) {
                        if (array[p] == matriz[j][i]) {
                            contador += 1;
                            if (contador == tamanio) {
                                System.out.println("palabra encontrada vertical ubicacion es x =" + (1 + (j - tamanio)) + " y =" + i);
                                encontro = true;
                                return;
                            }

                            p += 1;

                        } else {
                            p = seguro;
                            contador = 0;
                        }

                    }

                }
                break;
            }
            if (encontro == false) {
                System.out.println("la palabra :" + palabra + " no ne encuntra en loa sopa de letra");
            }
        }

    }
}
