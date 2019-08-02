package Entidades;

import java.util.List;
import java.util.function.Predicate;

public class ProdSearch {
	public  void procuraProd(List<Produto> prodList, Predicate<Produto> pred) {
		for (Produto p : prodList) {
			if (pred.test(p)) {
				System.out.println(p);
			}
		}
	}
}
