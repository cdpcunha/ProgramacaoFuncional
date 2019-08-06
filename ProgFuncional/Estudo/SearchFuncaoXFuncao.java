package Estudo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Entidades.ProdSearch;
import Entidades.Produto;

public class SearchFuncaoXFuncao {

	public static void main(String[] args) {
		List<Produto> listProd = new ArrayList<>();
		ProdSearch ps = new ProdSearch();
		Scanner sc = new Scanner(System.in);

		listProd.add(new Produto("Televisão", 900.00));
		listProd.add(new Produto("Mouse", 50.00));
		listProd.add(new Produto("Tablet", 400.00));
		listProd.add(new Produto("Celular", 590.90));
		listProd.add(new Produto("Bateria 110v", 88.50));
		listProd.add(new Produto("Telefone Fixo", 130.00));
		listProd.add(new Produto("Antena", 32.50));
		
		
		System.out.print("Critério de Busca - Produto que começa com a letra ? ");
		
		String search = sc.nextLine();
		
		for(Produto x:listProd) {
			if(x.ProdutoPredicateSearch(search)) {
				System.out.println(x);
			};
			
		}
		System.out.println("-------------------------------------------------");
		ps.procuraProd(listProd, x -> x.getNomeProd().charAt(0) == search.charAt(0));
				
		sc.close();
	}

}
