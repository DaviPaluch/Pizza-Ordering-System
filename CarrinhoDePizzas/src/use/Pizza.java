package use;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Pizza {
	
	
	private double preco;
	private ArrayList<String> ingredientePizza;
	public static HashMap<String, Integer> ingredienteTodos = new HashMap<>();
	
	
	
	
	public Pizza(ArrayList<String> ingredientePizza) {
		

		this.ingredientePizza = new ArrayList<>();
		
		//i would do this, but the question request the example below
		//this.ingredientePizza.addAll(ingredientePizza);
		
		//example:
		for (String ingrediente : ingredientePizza) {
			
			AdicionaIngrediente(ingrediente);
			
		}
	}

	public void AdicionaIngrediente(String ingrediente) {
		
		if(ingredientePizza.contains(ingrediente)) {
			System.out.println("O ingrediente ja esta na pizza.");
		} else {
			ingredientePizza.add(ingrediente);
			ContabilizaIngrediente(ingrediente);
			System.out.println("O ingrediente foi adicionado.");
		}
	}
	private static void ContabilizaIngrediente(String ingrediente) {
		
		if(ingredienteTodos.containsKey(ingrediente)) {
			ingredienteTodos.put(ingrediente, (ingredienteTodos.get(ingrediente)+1));
		} else {
			ingredienteTodos.put(ingrediente, 1);				
		}
	}
	public static void ContabilizaIngrediente() {
		
		for(Entry<String, Integer> entry: ingredienteTodos.entrySet()) {
			
			String chave = entry.getKey();
			Integer valor = entry.getValue();
			
			System.out.println("Ingrediente: " + chave + ", Quantidade: " + valor);
			
		}
	}
	public double getPreco() {
		
		int tamanho = ingredientePizza.size();
		
		if(tamanho <= 2) {
			this.preco = 15;
			return this.preco;
		} else if ( tamanho >=3 && tamanho <= 5) {
			this.preco = 20;
			return this.preco;
		} else {
			this.preco = 23;
			return this.preco;
		}
		
	}
	
	
	
}
