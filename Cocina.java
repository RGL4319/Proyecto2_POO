/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author 1047464
 */
public class Cocina {
// CLASE DIRECTOR.
    private PizzaBuilder builder;
 
    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) {
        builder = pizzaBuilder;
    }
    
    public Pizza getPizza() { 
        return builder.getPizza();
    }
 
    public void construirPizza() {
       builder.crearNuevaPizza();
       builder.buildMasa();
       builder.buildSalsa();
       builder.buildRelleno();
    }
}    
