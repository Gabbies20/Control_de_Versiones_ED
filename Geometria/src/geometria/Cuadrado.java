/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *Clase donde se definen las propiedades y lo métodos que tendrán 
 * las partes  de nuestro cuadrado.
 * @author javier
 * @version 1.0
 * @since 14/12/2021
 * 
 */
public class Cuadrado implements FiguraGeometrica
{
    /*Atributo de tipo numerico que  el lado del cyuadrado*/
    private double lado;
    /*Atributo de tipo numerico que contiene el area del cuadrado*/
    private double areaCuadrado;
    /**
     * Método modificador del atributo lado.
     * @param lado 
     */
    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * Método consultor del atributo lado.
     * @return Lado del cuadrado.
     */
    public double getLado() 
    {
        return lado;
    }
    /**
     * Método modificador del atributo lado.
     * @param lado 
     */
    public void setLado(double lado) 
    {
        this.lado = lado;
    }
    /**
     * Método consultor del atributo areaCuadrado.
     * @return area del Cuadrado.
     */
    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }    
    /**
     * 
     */
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
    }    
}