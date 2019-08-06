package Estudo;

import java.util.ArrayList;
import java.util.List;

import Entidades.EntPredicate;
import Entidades.Produto;

public class Predicate {

	public static void main(String[] args) {
		List<Produto> listProd = new ArrayList<>();

		listProd.add(new Produto("Televisão", 900.00));
		listProd.add(new Produto("Mouse", 50.00));
		listProd.add(new Produto("Tablet", 400.00));
		listProd.add(new Produto("Celular", 590.90));
		listProd.add(new Produto("Bateria 110v", 88.50));

		listProd.sort((p1, p2) -> p1.getPrecoProd().compareTo(p2.getPrecoProd()));

		for (Produto x : listProd) {
			System.out.println(x);
		}
		
		listProd.removeIf(new EntPredicate());
		System.out.println("--------------------------------------------------");
		for (Produto x : listProd) {
			System.out.println(x);
		}
		
		listProd.removeIf(Produto::ProdutoPredicate);
		
		System.out.println("--------------------------------------------------");
		for (Produto x : listProd) {
			System.out.println(x);
		}
		
		
		/*System.out.println("--------------------------------------------------");

		listProd.removeIf(p -> p.getPrecoProd() >= 100);
		for (Produto x : listProd) {
			System.out.println(x);
		}
	*/}

}
