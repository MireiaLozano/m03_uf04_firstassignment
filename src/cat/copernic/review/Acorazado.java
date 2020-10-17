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
public class Acorazado extends BarcoDeGuerra{
        private int CargasProfundidad;

    public Acorazado(int CargasProfundidad, Motor motor, double eslora, double manga, int nudos, int peso, int cañones) {
        super(motor, eslora, manga, nudos, peso, cañones);
        this.CargasProfundidad = CargasProfundidad;
    }
    
}
