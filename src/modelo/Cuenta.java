/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Cuenta {
    private double saldo;
    private int numeroConsignaciones;
    private int numeroRetiros;
    private double tasaAnual;
    private double comisionMensual;

    public Cuenta() {
    }

    public Cuenta(double saldo, int numeroConsignaciones, int numeroRetiros, double tasaAnual, double comisionMensual) {
        this.saldo = saldo;
        this.numeroConsignaciones = numeroConsignaciones;
        this.numeroRetiros = numeroRetiros;
        this.tasaAnual = tasaAnual;
        this.comisionMensual = comisionMensual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumeroConsignaciones() {
        return numeroConsignaciones;
    }

    public void setNumeroConsignaciones(int numeroConsignaciones) {
        this.numeroConsignaciones = numeroConsignaciones;
    }

    public int getNumeroRetiros() {
        return numeroRetiros;
    }

    public void setNumeroRetiros(int numeroRetiros) {
        this.numeroRetiros = numeroRetiros;
    }

    public double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public double getComisionMensual() {
        return comisionMensual;
    }

    public void setComisionMensual(double comisionMensual) {
        this.comisionMensual = comisionMensual;
    }
    
    public void imprimir(){
        System.out.println("DATOS CUENTA BANCARIA\n"+
                "Saldo:"+getSaldo()+"\n"+
                "Número de Depositos:"+getNumeroConsignaciones()+"\n"+
                "Número de Retiros:"+getNumeroRetiros()+"\n"+
                "Tasa Anual Interes:"+getTasaAnual()+"\n"+
                "Comisión Banco:"+getComisionMensual());
    
    }
    public void deposito(double valorDepositar){
        setSaldo(getSaldo()+valorDepositar);
        setNumeroConsignaciones(getNumeroConsignaciones()+1);
    }
    public void retiro(double valorRetirar){
        if(valorRetirar>getSaldo()){
            System.out.println("No cuenta con los fondos suficientes"
                    + " para realizar el retiro");
        }else{        
            setSaldo(getSaldo()-valorRetirar);
            setNumeroRetiros(getNumeroRetiros()+1);
        }
    
    }
}
