/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.figuras;

/**
 * Esta clase es la encargada de la informacion para crear los conos
 * @author Alisson Celeita
 */
public class Cono extends Figuras3D {
    /**
     * generatriz Contiene el valor de la generatriz del cono
     * altura Contiene el valor de la altura del cono
     * radio Contiene el valor del radio de la base del cono
     */
    private double generatriz;
    private double altura;
    private double radio;
    private double PI=3.1416;
    
    /**
     * El constructor recibe la informacion para crear los conos
     * @param generatriz Contiene el valor de la generatriz
     * @param altura Contiene el valor de la altura
     * @param radio Contiene el valor del radio de la base
     */
    
    public Cono(double generatriz, double altura, double radio) {
        this.generatriz = generatriz;
        this.altura = altura;
        this.radio = radio;
    }

    public double getGeneratriz() {
        return generatriz;
    }

    public void setGeneratriz(double generatriz) {
        this.generatriz = generatriz;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    /**
     * Este metodo calcula el volumen del cono
     * @return retorna el volumen del cono
     */
    
    @Override
    public double volumen() {
        return (PI*(Math.pow(radio,2)*altura))/3;
    }

    /**
     * Este metodo calcula el area del cono
     * @return retorna el area del cono
     */
    
    @Override
    public double area() {
        return PI*Math.pow(radio, 2)+(PI*radio*generatriz);
    }
    
    /**
     * Este metodo imprime la informacion del cono.
     */
    
    @Override
    public void imprimir() {
        System.out.println("CONO");
        System.out.println("Su area es "+area());
        System.out.println("Su volumen es "+volumen());
    }
}
