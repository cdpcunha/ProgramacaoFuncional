package Entidades;

import java.util.function.Predicate;

public class EntPredicate implements Predicate<Produto>{

	@Override
	public boolean test(Produto produto) {
		return produto.getPrecoProd() >= 500;
	}
}
