/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ana_fernandez_ejercicio1;

/**
 *
 * @author DAM112
 */
public class Terminal {

    private String nombreHost;
    private String direccion;
    private String mascaraRed;

    public Terminal() {
    }

    public Terminal(String nombreHost, String direccion, String mascaraRed) {
        this.nombreHost = nombreHost;
        this.direccion = direccion;
        this.mascaraRed = mascaraRed;
    }

    public boolean compruebaIP() {
        boolean formatoip = true;
        char letra;
        String campo = "";
        int primerOcteto = 0;
        int segundoOcteto = 0;
        int tercerOcteto = 0;
        int cuartoOcteto = 0;
        int contador = 0;
        for (int i = 0; i < direccion.length() && formatoip; i++) {
            letra = direccion.charAt(i);
            if (letra != '.') {
                campo = campo + letra;

            } else {
                if (contador == 0) {
                    primerOcteto = Integer.parseInt(campo);
                    System.out.println("primer octeto: " + primerOcteto);
                    if (primerOcteto < 0 || primerOcteto > 255) {
                        formatoip = false;
                    }

                    contador++;
                }
                if (contador == 1) {

                    segundoOcteto = Integer.parseInt(campo);
                    System.out.println("segundo octeto: " + segundoOcteto);
                    if (segundoOcteto < 0 || segundoOcteto > 255) {
                        formatoip = false;
                    }
                    contador++;
                } else if (contador == 2) {

                    tercerOcteto = Integer.parseInt(campo);
                    System.out.println("tercer octeto: " + tercerOcteto);
                    if (tercerOcteto < 0 || tercerOcteto > 250) {
                        formatoip = false;
                    }
                    contador++;

                }
                campo = "";
            }
        }
        if (formatoip) {

            cuartoOcteto = Integer.parseInt(campo);
            System.out.println("cuarto octeto: " + cuartoOcteto);
            if (cuartoOcteto < 0 || cuartoOcteto > 255) {
                formatoip = false;
            }
        }
        return formatoip;
    }

    public boolean mascaraRed() {
        boolean fmascara = true;

        char letra;
        String campo = "";
        int primerOcteto = 0;
        int segundoOcteto = 0;
        int tercerOcteto = 0;
        int cuartoOcteto = 0;
        int contador = 0;
        for (int i = 0; i < mascaraRed.length() && fmascara; i++) {
            letra = mascaraRed.charAt(i);
            if (letra != '.') {
                campo = campo + letra;

            } else {
                if (contador == 0) {
                    primerOcteto = Integer.parseInt(campo);
                    System.out.println("primer octeto: " + primerOcteto);
                    if (primerOcteto != 255) {
                        fmascara = false;
                    }

                    contador++;
                }
                if (contador == 1) {

                    segundoOcteto = Integer.parseInt(campo);
                    System.out.println("segundo octeto: " + segundoOcteto);
                    if (segundoOcteto != 255) {
                        fmascara = false;
                    }
                    contador++;
                } else if (contador == 2) {

                    tercerOcteto = Integer.parseInt(campo);
                    System.out.println("tercer octeto: " + tercerOcteto);
                    if (tercerOcteto != 255) {
                        fmascara = false;
                    }
                    contador++;

                }
                campo = "";
            }
        }
        if (fmascara) {

            cuartoOcteto = Integer.parseInt(campo);
            System.out.println("cuarto octeto: " + cuartoOcteto);
            if (cuartoOcteto != 0) {
                fmascara = false;
            }
        }

        return fmascara;
    }

    public String getNombreHost() {
        return nombreHost;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getMascaraRed() {
        return mascaraRed;
    }

    public void setNombreHost(String nombreHost) {
        this.nombreHost = nombreHost;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMascaraRed(String mascaraRed) {
        this.mascaraRed = mascaraRed;
    }

    @Override
    public String toString() {
        return "Terminal{" + "nombreHost=" + nombreHost + ", direccion=" + direccion + ", mascaraRed=" + mascaraRed + '}';
    }

}
