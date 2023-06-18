package use;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	public List<Pizza> itens;
	private double valorTotal;
	
	
	public CarrinhoDeCompras() {
		
		itens = new ArrayList<Pizza>();
	}
	
	public double RetornaValorTotal() {
		
		valorTotal = 0;
		
		for(Pizza pizza:itens) {
			valorTotal += pizza.getPreco();
		}
		
		return valorTotal;
	}
	
	
	public void AdicionarPizza(Pizza pizza) {
		if(!pizza.GetIngredientePizza().isEmpty()) {
			itens.add(pizza);
		}
	}
	
	
	
	
}
