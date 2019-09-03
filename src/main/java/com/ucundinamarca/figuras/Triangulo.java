/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.figuras;
/**
 * Esta clase es la encargada de la informacion del triangulo
 * @author Alisson Celeita
 */
public class Triangulo extends Figuras2D{
    /**
     * lado1= primer lado del triangulo
     * lado2= segundo lado del triangulo
     * lado3= tercer lado del triangulo.
     */
    
    private double lado1;
    private double lado2;
    private double lado3;

    /**
     * El constructor recibe la informacion para crear los triangulos.
     * @param lado1 primer lado del triangulo
     * @param lado2 segundo lado del triangulo
     * @param lado3 tercer lado del triangulo
     */
    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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

    public double getLado3() {
        return lado3;
    }

    public void setLado3(float lado3) {
        this.lado3 = lado3;
    }
    
    /**
     * Este metodo calcula el perimetro del triangulo
     * @return retorna el perimetro del triangulo
     */
    
    @Override
    public double perimetro() {
        return lado1+lado2+lado3;
    }

    /**
     * Este metodo calcula el area del triangulo
     * @return retorna el area del triangulo
     */
    
    @Override
    public double area() {
        double op1, op2;
        op1=Math.pow(lado1,2)+Math.pow(lado2,2)+Math.pow(lado3,2);
        op2=Math.pow(lado1,4)+Math.pow(lado2,4)+Math.pow(lado3,4);
        return (1/4)*Math.sqrt(Math.pow(op1,2)-2*op2);
    }
    
    /**
     * Este metodo imprime la informacion del triangulo.
     */
    
    @Override
    public void imprimir() {
        System.out.println("TRIANGULO");
        if(lado1==lado2&&lado1==lado3&&lado2==lado3){
            System.out.println("Es un triangulo equilatero");
        }else if(lado1==lado2||lado2==lado3||lado1==lado3){
            System.out.println("Es un triangulo isosceles");
        }else{
            System.out.println("Es un triangulo escaleno");
        }
        System.out.println("Su area es "+area());
        System.out.println("Su perimetro es "+perimetro());
    }
    
}
