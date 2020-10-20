/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cat.copernic.review;


import java.util.Scanner;

/**
 *
 * @author User
 */
public abstract class Barco implements EnCasoDeAbordajeInterface, EnCasoDeIncendioInterface{
    protected String nombre= "Mi barco";
    private Motor motor;
    private double eslora;
    private double manga;
    private int nudos;
    private int peso;

    public Barco(Motor motor, double eslora, double manga, int nudos, int peso) {
        this.motor = motor;
        this.eslora = eslora;
        this.manga = manga;
        this.nudos = nudos;
        this.peso = peso;
    }

    public Motor getMotor() {
        return motor;
    }

    public double getEslora() {
        return eslora;
    }

    public double getManga() {
        return manga;
    }

    public int getNudos() {
        return nudos;
    }

    public int getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "Barco{" + "motor=" + motor + ", eslora=" + eslora + ", manga=" + manga + ", nudos=" + nudos + ", peso=" + peso + '}';
    }
    abstract void arranca();
        
    
    abstract void atraca();
        
}
