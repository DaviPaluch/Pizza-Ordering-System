import org.example.CarrinhoDeCompras;
import org.example.Pizza;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CartSumTotal {

    @Test
    public void CartSumTotal(){

        //Criando Itens do Carrinho
        ArrayList<String> ingredients1 = new ArrayList<>();
        ingredients1.add("calabresa");
        ingredients1.add("milho");
        Pizza pizza1 = new Pizza(ingredients1);

        ArrayList<String> ingredients2 = new ArrayList<>();
        ingredients2.add("calabresa");
        ingredients2.add("milho");
        ingredients2.add("strogonoff");
        ingredients2.add("portuguesa");
        ingredients2.add("4queijos");
        Pizza pizza2 = new Pizza(ingredients2);

        ArrayList<String> ingredients3 = new ArrayList<>();
        ingredients3.add("calabresa");
        ingredients3.add("milho");
        ingredients3.add("strogonoff");
        ingredients3.add("portuguesa");
        ingredients3.add("rucula");
        ingredients3.add("camarao");
        ingredients3.add("4queijos");
        Pizza pizza3 = new Pizza(ingredients3);

        //Sem ingredientes;
        ArrayList<String> ingredientsW = new ArrayList<>();
        Pizza pizza4 = new Pizza(ingredientsW);

        //Adding in Cart
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.AdicionarPizza(pizza1);
        carrinhoDeCompras.AdicionarPizza(pizza2);
        carrinhoDeCompras.AdicionarPizza(pizza3);
        carrinhoDeCompras.AdicionarPizza(pizza4);

        //Tests
         //Quantidade de itens
        assertEquals(3,carrinhoDeCompras.ResponseItemsQuantity());
         //Valor Total do Carrinho
        assertEquals(58,carrinhoDeCompras.RetornaValorTotal());







    }
}
