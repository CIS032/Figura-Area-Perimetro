/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figura;

import javax.swing.JOptionPane;

/**
 *
 * @author Cliente
 */
public class ProgramaFigura {
    public static void main(String[] args) {
        double base=10.5;
        double altura=6.7;
        
        Triangulo t = new Triangulo(10.5, 6.7);
        double areat = t.area();
        JOptionPane.showMessageDialog(null,"El area del triangulo es: \n" + areat);
       
        double radio=5.25;
        double radio2=7.38;
        double largo=13.27;
        double ancho=4.32;
        
        Rectangulo r = new Rectangulo(7.38,5.25);
        double area1 = r.area();
        JOptionPane.showMessageDialog(null,"Su area del Rectangulo es: \n" + area1);
        Circulo c = new Circulo(radio);
        double area2 = c.area();
        JOptionPane.showMessageDialog(null,"Su area del Circulo1 es:\n" + area2);
        Circulo cir=new Circulo(radio2);
        double area3=cir.area();
        JOptionPane.showMessageDialog(null,"Su area del Circulo2 es:\n" + area3);
        
        double sumaAreas = area1 + area2 + area3;
        JOptionPane.showMessageDialog(null, "La suma de las bases de la figura son: " + sumaAreas);
        
        double perimetro=t.perimetro();
        JOptionPane.showMessageDialog(null,"Su perimetro del Triangulo es:\n" + perimetro);
        
        double perimetro1=r.perimetro();
        JOptionPane.showMessageDialog(null,"Su perimetro del Rectangulo es:\n" + perimetro1);
        
        double perimetro2=c.perimetro();
        JOptionPane.showMessageDialog(null,"Su perimetro del Circulo es:\n" + perimetro2);
    }
}
