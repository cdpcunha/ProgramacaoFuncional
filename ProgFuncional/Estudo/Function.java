package Estudo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import Entidades.Produto;

public class Function {

	public static void main(String[] args) {
		List<Produto> listProd = new ArrayList<>();

		listProd.add(new Produto("Televisão", 900.00));
		listProd.add(new Produto("Mouse", 50.00));
		listProd.add(new Produto("Tablet", 400.00));
		listProd.add(new Produto("Celular", 590.90));
		listProd.add(new Produto("Bateria 110v", 88.50));
		
		List<String> listaAux = listProd.stream().map(p -> p.toString().toUpperCase()).collect(Collectors.toList());
		
		for(String p:listaAux) {
			System.out.println(p);
		}
		

	}

}
