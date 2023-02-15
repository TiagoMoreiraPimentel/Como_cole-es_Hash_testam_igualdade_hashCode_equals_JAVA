package App;

import java.util.HashSet;
import java.util.Set;

import entities.Product;

public class Main {

	public static void main(String[] args) {

		Set<Product> set = new HashSet<>();
		
		set.add(new Product("TV", 900.0));
		set.add(new Product("Notebook", 1200.0));
		set.add(new Product("Tablet", 400.0));
		
		Product prod = new Product("Notebook", 1200.0);
		
		// compara se os produtos são iguais usando o hashCode/equals dentro da classe product.
		System.out.println(set.contains(prod));

	}

}
