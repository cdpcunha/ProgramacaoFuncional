package Estudo;

import java.util.ArrayList;
import java.util.List;

import Entidades.Produto;

public class Consumer {

	public static void main(String[] args) {
		List<Produto> listProd = new ArrayList<>();

		listProd.add(new Produto("Televisão", 900.00));
		listProd.add(new Produto("Mouse", 50.00));
		listProd.add(new Produto("Tablet", 400.00));
		listProd.add(new Produto("Celular", 590.90));
		listProd.add(new Produto("Bateria 110v", 88.50));
		
		listProd.forEach(p -> p.setPrecoProd(p.getPrecoProd()*1.1));
		
		for(Produto x:listProd) {
			System.out.println(x);
		}
	}

}
