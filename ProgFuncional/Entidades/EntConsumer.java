package Entidades;

import java.util.function.Consumer;

public class EntConsumer implements Consumer<Produto> {

	@Override
	public void accept(Produto prod) {
			prod.setPrecoProd(prod.getPrecoProd()*1.1);
	}

}
