package Entidades;

import java.util.function.Function;

public class EntFunction implements Function<Produto,String >{

	@Override
	public String apply(Produto prod) {
		return prod.getNomeProd().toUpperCase();
	}

}
