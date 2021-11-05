/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import Clases.*;
/**
 *
 * @author 1047464
 */
public class Principal {
    public static void main(String[] args) {
        //CLASE PRINCIPAL
        Cocina cocina = new Cocina();
        PizzaBuilder hawuaiPizzaBuilder = new HawuaiPizzaBuilder();
        PizzaBuilder picantePizzaBuilder = new PicantePizzaBuilder();
        cocina.setPizzaBuilder(hawuaiPizzaBuilder);
        cocina.construirPizza();
        Pizza pizza = cocina.getPizza();
    }
}
