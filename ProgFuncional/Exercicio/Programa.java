package Exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import ExercicioEntidades.Produto;

public class Programa {

	public static void main(String[] args) {
		String path = "E:\\JavaTemp\\ExercicioStream\\Produtos.txt";

		List<Produto> listaProd = new ArrayList<>();
		double media = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] aux = linha.split(",");
				listaProd.add(new Produto(aux[0], Double.parseDouble(aux[1])));
				media += Double.parseDouble(aux[1]);
				linha = br.readLine();
			}
			
			Collections.sort(listaProd);
			
			Double result = media / listaProd.size();
			System.out.println("Média = " + String.format("%.2f", result));
			System.out.println("--------------------------------------");
			System.out.println("Acima da média : ");

			for (Produto x : listaProd) {
				if (x.prodAcimaMedia(result)) {
					System.out.println(x);
				}
			}

			System.out.println("--------------------------------------");
			System.out.println("Abaixo da média : ");
			for (Produto y : listaProd) {
				if (y.prodAbaixoMedia(result)) {
					System.out.println(y);
				}
			}

		} catch (IOException e) {
			e.getLocalizedMessage();
		}

	}
}