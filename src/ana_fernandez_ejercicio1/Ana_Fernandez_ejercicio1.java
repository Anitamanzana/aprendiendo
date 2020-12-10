/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ana_fernandez_ejercicio1;

import java.util.Scanner;

/**
 *
 * @author DAM112
 */
public class Ana_Fernandez_ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Terminal terminal1 = new Terminal();
        Terminal terminal2 = new Terminal();
        char opc;
        boolean repeat = false;

        do {
            System.out.println("Introduce el nombre del Host");
            String nombrehost = teclado.next();
            System.out.println("Introduce la dirección");
            String direccion = teclado.next();
            System.out.println("Introduce la máscara de red");
            String mascara = teclado.next();
            Terminal terminal = new Terminal(nombrehost, direccion, mascara);

            if (terminal.compruebaIP()) {
                System.out.println("El formato de la ip es correcto");
            } else {
                System.out.println("el formato de la ip es incorrecto: introduzca los datos de nuevo");
                repeat = true;
            }

            if (terminal.mascaraRed()) {
                System.out.println("El formato de la máscara es correcto");
            } else {
                System.out.println("El formato de la máscara es incorrecto.Introduzca los datos de nuevo");
            }

            System.out.println("Datos del terminal; " + terminal.toString());

            do {
                System.out.println("Deseas continuar(s/n): ");
                opc = teclado.next().charAt(0);
            } while ((opc != 's') && (opc != 'S') && (opc != 'n') && (opc != 'N'));
        } while ((opc == 's') || (opc == 'S') && (repeat = false));
        Conexion conexion = new Conexion(tipoConexion.inalambrica, 155, terminal1, terminal2);

        System.out.println("Los daos de la conexion son: " + conexion.toString());

    }

}
