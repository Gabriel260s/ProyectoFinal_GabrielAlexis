/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectofinalp1;

/**
 *
 * @author gabri
 */
public class Banco {

    static String Nombre = "";
    int saldo_disponible = 1000, saldo_retirar, agregar_saldo;
  

    public Banco() {

    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSaldo_disponible() {
        

        return saldo_disponible;
    }

    public void setSaldo_disponible(int saldo_disponible) {
       
        this.saldo_disponible = saldo_disponible;
    }

    public int getSaldo_retirar() {
        return saldo_retirar;
    }

    public void setSaldo_Aretirar(int saldo_retirar) {
        if (saldo_retirar <= saldo_disponible) {
            saldo_disponible -= saldo_retirar;
        }

    }

    public void agregarSaldo(int agregar_saldo) {
        saldo_disponible += agregar_saldo;
    }

    @Override
    public String toString() {
        return Nombre + " tienes " + saldo_disponible + "en tu cuenta";
    }

}
