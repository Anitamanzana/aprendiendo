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
enum tipoConexion {
    cableada, inalambrica
}

public class Conexion {

    private tipoConexion conexion;
    private int distancia;
    private Terminal terminal1;
    private Terminal terminal2;

    public Conexion(tipoConexion conexion, int distancia, Terminal terminal1, Terminal terminal2) {
        this.conexion = conexion;
        this.distancia = distancia;
        this.terminal1 = terminal1;
        this.terminal2 = terminal2;
    }

    public boolean conexionSiNo() {
        boolean mismared=false;

        return mismared;
    }

    @Override
    public String toString() {
        return "Conexion{" + "conexion=" + conexion + ", distancia=" + distancia + ", terminal1=" + terminal1 + ", terminal2=" + terminal2 + '}';
    }

}
