/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ucundinamarca.figuras;

import java.util.Scanner;

/**
 * Esta clase contiene la logica principal del programa.
 * @author Alisson Celeita
 */
public class Logica {
    /**
     * ingreso= Variable que captura lo que entre por teclado
     * figuras= Array que recibe todas las figuras que el usuario ingrese 
     */
    private Scanner ingreso = new Scanner(System.in);
    private Figuras[] figuras;
    
    /**
     *  En el constructor se solicita el numero de figuras que va a ingresar y se realiza el llamado de los otros metodos. 
     */
    
    public Logica(){
        int cont=0;
        System.out.println("¿Cuantas figuras desea ingresar?");
        int dato=ingreso.nextInt();
        figuras= new Figuras[dato];
        while(cont<dato){
            seleccion(menu(),cont);
            cont++;
        }
        impresion();
    }
    
    /**
     * Este metodo muestra el menu en pantalla, el usuario digita el numero de la figura que desee ingresar
     * @return figura= es el numero de la figura que se va a crear.
     */
    
    public int menu(){
        int figura;
        System.out.println("Escoja que figura quiere ingresar (Numero)");
        System.out.println("Figuras 2D");
        System.out.println("1. Circulo");
        System.out.println("2. Cuadrilatero");
        System.out.println("3. Triangulo");
        System.out.println("Figuras 3D");
        System.out.println("4. Esfera");
        System.out.println("5. Cubo");
        System.out.println("6. Cono");
        figura=ingreso.nextInt();
        return figura;
    }
    
    /**
     * Este metodo controla la creacion de las figuras
     * @param figura es el indicador de la figura que el usuario desea crear
     * @param cont es el contador, que controla la posicion del vector
     */
    
    public void seleccion(int figura,int cont){
        switch(figura){
            case 1:
                Circulo(cont);
                break;
            case 2:
                Cuadrilatero(cont);
                break;
            case 3:
                Triangulo(cont);
                break;
            case 4:
                Esfera(cont);
                break;
            case 5:
                Cubo(cont);
                break;
            case 6:
                Cono(cont);
                break;
            default: 
                System.out.println("Dato no valido");
        }
    }
    
    /**
     * Este metodo crea los circulos
     * @param cont controla la posicion del vector
     */
    
    public void Circulo(int cont){
        System.out.println("Ingrese el radio del circulo");
        figuras[cont]=new Circulo(ingreso.nextInt());
    }
    
    /**
     * Este metodo crea los cuadrilateros
     * @param cont controla la posicion del vector
     */
    
    public void Cuadrilatero(int cont){
        System.out.println("Ingrese el primer lado del cuadrilatero");
        double l1= ingreso.nextDouble();
        System.out.println("Ingrese el segundo lado del cuadrilatero");
        double l2= ingreso.nextDouble();
        figuras[cont]=new Cuadrilatero(l1,l2);
    }
    
    /**
     * Este metodo crea los triangulos
     * @param cont controla la posicion del vector
    */
    
    public void Triangulo(int cont){
        System.out.println("Ingrese el primer lado del triangulo");
        double l1= ingreso.nextDouble();
        System.out.println("Ingrese el segundo lado del triangulo");
        double l2= ingreso.nextDouble();
        System.out.println("Ingrese el tercer lado del triangulo");
        double l3= ingreso.nextDouble();
        figuras[cont]=new Triangulo(l1,l2,l3);
    }
    
    /**
     * Este metodo crea las esferas
     * @param cont controla la posicion del vector
     */
    
    public void Esfera(int cont){
        System.out.println("Ingrese el radio de la esfera");
        figuras[cont]=new Esfera(ingreso.nextInt());
    }
    
    /**
     * Este metodo crea los cubos
     * @param cont controla la posicion del vector
     */
    
    public void Cubo(int cont){
        System.out.println("Ingrese el lado del cubo");
        figuras[cont]=new Cubo(ingreso.nextDouble());
    }
    
    /**
     * Este metodo crea los conos
     * @param cont controla la posicion del vector
     */
    
    public void Cono(int cont){
        System.out.println("Ingrese la generatriz del cono");
        double generatriz= ingreso.nextDouble();
        System.out.println("Ingrese la altura del cono");
        double altura= ingreso.nextDouble();
        System.out.println("Ingrese el radio del cono");
        double radio= ingreso.nextDouble();
        figuras[cont]=new Cono(generatriz,altura,radio);
    }
    
    /**
     * Este metodo recorre todo el vector e imprime las figuras.
     */
    
    private void impresion() {
        for (Figuras figurita : figuras) {
            System.out.println();
            if(figurita instanceof Circulo)
                ((Circulo) figurita).imprimir();
            else if(figurita instanceof Cuadrilatero)
                ((Cuadrilatero) figurita).imprimir();
            else if(figurita instanceof Triangulo)
                ((Triangulo) figurita).imprimir();
            else if(figurita instanceof Esfera)
                ((Esfera)figurita).imprimir();
            else if(figurita instanceof Cubo)
                ((Cubo) figurita).imprimir();
            else if(figurita instanceof Cono)
                ((Cono) figurita).imprimir();                      
        }
    }
}
