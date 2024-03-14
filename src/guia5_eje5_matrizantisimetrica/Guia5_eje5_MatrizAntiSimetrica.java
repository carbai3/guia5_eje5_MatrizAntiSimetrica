/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5_eje5_matrizantisimetrica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author carba
 */
public class Guia5_eje5_MatrizAntiSimetrica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[2][2];
        boolean esantisimetrica = false;
        Random aleatoreo = new Random();
        System.out.println("Matriz original");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int numero = aleatoreo.nextInt(9);
                matriz[i][j] = numero;

                System.out.print("M[" + i + "," + j + "] = " + numero + " ");
            }
            System.out.println("");
        }

        int[][] A = new int[2][2];
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("A[" + i + "," + j + "]= ");
                A[i][j] = leer.nextInt();
            }
        }
        System.out.println("Ingrese la matriz antisimetrica manualmente");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                if (matriz[i][j] == A[j][i] * -1) {
                    esantisimetrica = true;
                }
            }
        }
        if (esantisimetrica)System.out.println("La matriz es antisimetrica");
        else System.out.println("La matriz no es Antisimetrica");
    }
    }
