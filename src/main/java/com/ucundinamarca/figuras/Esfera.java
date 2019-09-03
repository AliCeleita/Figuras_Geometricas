/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.figuras;

/**
 *  Esta clase es la encargada de la informacion para crear las esferas
 * @author Alisson Celeita
 */
public class Esfera extends Figuras3D{
    /**
     * radio= Es la variable que contiene el radio de la esfera
     * PI= Es la constante 3,1416.
     */
    private int radio;
    private double PI=3.1416;

    /**
     * El constructor recibe la informacion para crear las esferas
     * @param radio es la variable que contiene el radio de la esfera
     */
    
    public Esfera(int radio) {
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }
    
    /**
     * Este metodo calcula el area de la esfera
     * @return retorna el area de la esfera
     */
    
    @Override
    public double area() {
        return 4*PI*(radio^2);
    }
    
    /**
     * Este metodo calcula el volumen de la esfera
     * @return retorna el volumen de la esfera
     */
    
    @Override
    public double volumen() {
        return (4/3)*PI*(radio^3);
    }
    
    /**
     * Este metodo imprime la informacion de la esfera.
     */
    
    @Override
    public void imprimir() {
        System.out.println("ESFERA");
        System.out.println("El radio de la esfera es "+radio);
        System.out.println("Su area es "+area());
        System.out.println("Su volumen es "+volumen());
    }

}
