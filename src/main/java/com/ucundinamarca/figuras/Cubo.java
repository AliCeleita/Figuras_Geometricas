/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.figuras;

/**
 * Esta clase es la encargada de la informacion para crear los cubos
 * @author Alisson Celeita
 */
public class Cubo extends Figuras3D{
    /**
     * lado= Esta variable contiene el valor del lado del cubo perfecto
     */
    public double lado;
    
    /**
     * El constructor recibe la informacion para crear los cubos
     * @param lado es el lado del cubo perfecto.
     */
    
    public Cubo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    /**
     * Este metodo calcula el volumen del cubo
     * @return retorna el volumen del cubo
     */
    
    @Override
    public double volumen() {
        return Math.pow(lado, 3);
    }
    
    /**
     * Este metodo calcula el area del cubo
     * @return retorna el area del cubo
     */
    
    @Override
    public double area() {
        return 6*(Math.pow(lado,2));
    }
    
    /**
     * Este metodo imprime la informacion del cubo.
     */

    @Override
    public void imprimir() {
        System.out.println("CUBO");
        System.out.println("Su area es "+ area());
        System.out.println("Su volumen es "+volumen());
    }
    
}
