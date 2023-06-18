import org.example.Pizza;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPizzaValue {

    @Test
    public void TwoIngredients(){
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("calabresa");
        ingredients.add("milho");
        Pizza pizza = new Pizza(ingredients);
        assertEquals(15,pizza.getPreco());
        assertEquals(2,pizza.GetIngredientePizza().size());
    }
    @Test
    public void FiveIngredients(){
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("calabresa");
        ingredients.add("milho");
        ingredients.add("strogonoff");
        ingredients.add("portuguesa");
        ingredients.add("4queijos");

        Pizza pizza = new Pizza(ingredients);
        assertEquals(20,pizza.getPreco());
        assertEquals(5,pizza.GetIngredientePizza().size());
    }
    @Test
    public void MoreThanFiveIngredients(){
        ArrayList<String> ingredients = new ArrayList<>();
        ingredients.add("calabresa");
        ingredients.add("milho");
        ingredients.add("strogonoff");
        ingredients.add("portuguesa");
        ingredients.add("rucula");
        ingredients.add("camarao");
        ingredients.add("4queijos");
        Pizza pizza = new Pizza(ingredients);
        assertEquals(23,pizza.getPreco());
        assertEquals(7,pizza.GetIngredientePizza().size());
    }
    @AfterEach
    public void ClearIngredients(){
        Pizza.ZeraIngreditentes();
    }
}
