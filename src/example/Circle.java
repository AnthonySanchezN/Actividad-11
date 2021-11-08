/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package example;

import java.util.Scanner;

/**
 *
 * @author Intel
 */
public class Circle implements Shape{
    Scanner sn = new Scanner(System.in);
    
    public static final double PI = 3.141592;
    private double radio;
    
    public Circle(double radio){
        this.radio = radio;
    }
    
    public Circle(){
        System.out.println("Ingrese el radio: ");
        radio = sn.nextDouble();
    }
    
    public void setRadio(double radio){
        this.radio = radio;
    }
    
    public double getRadio(){
        return radio;
    }
    
    public double getDiametro(){
        return radio * 2;
    }
    
    public double getArea(){
        return PI * radio * radio;
    }
    
    public double getPerimetro(){
        return PI * getDiametro();
    }
}
