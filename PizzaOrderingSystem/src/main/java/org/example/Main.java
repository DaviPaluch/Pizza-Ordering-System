package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();



        ArrayList<String> sabor = new ArrayList<String>();

        sabor.add("calabresa");
        Pizza pizza1 = new Pizza(sabor);

        sabor.add("milho");
        sabor.add("strogonoff");
        Pizza pizza2 = new Pizza(sabor);

        sabor.add("tomate");
        sabor.add("frango");
        sabor.add("camarao");
        Pizza pizza3 = new Pizza(sabor);

        carrinhoDeCompras.AdicionarPizza(pizza1);
        carrinhoDeCompras.AdicionarPizza(pizza2);
        carrinhoDeCompras.AdicionarPizza(pizza3);

        // 15 + 20 + 23 = 58
        System.out.println("valor total do carrinho: R$" + carrinhoDeCompras.RetornaValorTotal());

        Pizza.ContabilizaIngrediente();


    }
}