/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometria;

/**
 *
 * @author javier
 */
public class Triangulo implements FiguraGeometrica
{
    /*Atributo de tipo numerico que contiene la base del triángulo*/
    private double base;
    /*Atributo de tipo numerico que contiene la altura del triángulo/
    private double altura;
    /*Atributo de tipo numerico que contiene el area del triangulo*/
    private double areaTriangulo;
    
/**
 * Constructor de la clase que recibe todos los parametros
 * @param base Base del triángulo
 * @param altura Altura del triángulo.
 */
    public Triangulo(double base, double altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }

    public double getareaTriangulo() 
    {
        return areaTriangulo;
    }

    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
    }    
    
}