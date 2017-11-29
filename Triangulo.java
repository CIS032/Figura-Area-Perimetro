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
public class Triangulo extends Figura {
    private double base;
    private double altura;
    private double lado1;
    private double lado2;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Triangulo(double base, double lado1, double lado2) {
        this.base = base;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    //@Override
    public double area(){
        /*Para poder utilizar losatributos de la superclase se debe llamar de la siguiente forma
        super.base; siempre y cuando se necesite especificar algun dato que se encuentre en la clase de donde se hedera*/
        return (base*altura)/2;
        
        
        /*Para usar un atributo que es netamente de la misma clase se la puede tambien llamar de la siguiente forma
        this.base, en caso que se utilicen tambien atributos de la super clase*/
    }
    
    public double perimetro(){
        return lado1 + lado2 + base;
    }
    
    /*Si se necesita un toString que se encuentre en la superclase y necesita ser utilizado en la subclase
    se puede llamar de la super clase en una sub clase siempre y cuando utilice super.toString
    * super(altura) llama a algun constructor que se encuentre y necesite en la subclase desde la superclase*/
}
