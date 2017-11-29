/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

/**
 *
 * @author Cliente
 */
public class Rectangulo extends Figura {
    private double largo;
    private double ancho;

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public double area(){
        return largo * ancho;
        
    }
    
    public double perimetro(){
        return Math.pow(largo, 2) + Math.pow(ancho, 2);
    }
}
