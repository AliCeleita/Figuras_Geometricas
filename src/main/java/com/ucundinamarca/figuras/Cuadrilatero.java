/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.figuras;

/**
 * Esta clase es la encargada de manejar la informacion de los cuadrilateros
 * @author Alisson Celeita
 */
public class Cuadrilatero extends Figuras2D{
    
    /**
     * lado1= primer lado del cuadrilatero
     * lado2= segundo lado del cuadrilatero
     */
    
    private double lado1;
    private double lado2;
    
    /**
     * El constructor recibe la informacion para crear el cuadrilatero
     * @param lado1 primer lado del cuadrilatero
     * @param lado2 segundo lado del cuadrilatero
     */
    public Cuadrilatero(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
    
    /**
     * Este metodo calcula el perimetro del cuadrilatero
     * @return retorna el perimetro del cuadrilatero
     */
    
    @Override
    public double perimetro() {
        return lado1+lado1+lado2+lado2;
    }

    /**
     * Este metodo calcula el area del cuadrilatero
     * @return retorna el area del cuadrilatero
     */
    
    @Override
    public double area() {
        return lado1*lado2;
    }

    /**
     * Este metodo imprime la informacion del cuadrilatero.
     */
    
    @Override
    public void imprimir() {
        if(lado1==lado2){
            System.out.println("CUADRADO");
        }else{
            System.out.println("RECTANGULO");
        }
        System.out.println("Su area es " + area());
        System.out.println("Su perimetro es " + perimetro());
    }
    
}
