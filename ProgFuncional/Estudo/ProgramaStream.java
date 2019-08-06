package Estudo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ProgramaStream {

	public static void main(String[] args) {

		List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0);

		Stream<Integer> stream1 = lista.stream().map(x -> x * 20);
		System.out.println(Arrays.toString(stream1.toArray()));

		Stream<String> stream2 = Stream.of("João", "Juh", "Resto");
		System.out.println(Arrays.toString(stream2.toArray()));

		Stream<Integer> stream3 = Stream.iterate(0, x -> x + 2);
		System.out.println(Arrays.toString(stream3.limit(10).toArray()));

		Stream<Long> fibon = Stream.iterate(new Long[] { 0L, 1L }, x -> new Long[] { x[1], x[0] + x[1] })
				.map(x -> x[0]);
		System.out.println(Arrays.toString(fibon.limit(20).toArray()));

	}
}
