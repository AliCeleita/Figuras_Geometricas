/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.figuras;

/**
 * Esta clase es la encargada de manejar la informacion de los circulos
 * @author Alisson Celeita
 */
public class Circulo extends Figuras2D{
    /**
     * radio= Es la variable que contiene el radio del circulo
     * PI= Es la constante 3,1416.
     */
    
    private int radio;
    private double PI=3.1416;
    
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    /**
     * El constructor recibe el dato del radio del circulo.
     * @param radio Esta variable es el radio del circulo.
     */
    
    public Circulo(int radio){
        this.radio=radio;
    }
    
    /**
     * Este metodo calcula el area del circulo
     * @return retorna el area del circulo
     */
    
    @Override
    public double area() {
        return PI*(radio^2);  
    }
    
    /**
     * Este metodo calcula el perimetro del circulo
     * @return retorna el perimetro del circulo
     */
    
    @Override
    public double perimetro() {
        return (2*PI*radio);
    }
    
    /**
     * Este metodo imprime la informacion del circulo.
     */
    
    @Override
    public void imprimir() {
        System.out.println("CIRCULO");
        System.out.println("El radio del circulo es "+ radio);
        System.out.println("El area del circulo es " + area());
        System.out.println("El perimetro del circulo es " + perimetro());
    }
}
