package Exercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import Exercicio2Entidades.Empregado;

public class Programa {
	public static void main(String[] args) {
		String path = "E:\\JavaTemp\\ExercicioStream\\Empregados.txt";
		List<Empregado> empList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o salário de base : ");
		double salarioBase = sc.nextDouble();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String linha = br.readLine();
			while (linha != null) {
				String[] aux = linha.split(",");
				empList.add(new Empregado(aux[0], aux[1], Double.parseDouble(aux[2])));
				linha = br.readLine();
			}
			Collections.sort(empList);

			System.out.println("Lista de empregados que recebem mais que R$ " + salarioBase);
			for (Empregado e : empList) {
				e.comparaSalario(salarioBase);
			}
			sc.nextLine();
			System.out.print("Somar salários com a Letra '?' ");
			String op = sc.nextLine();

			double soma = 0;
			for (Empregado x : empList) {
				soma += x.somaSalarioSe(op);
			}
			System.out.println("Somados com a letra " + op.charAt(0) + " : " + soma);
		} catch (IOException e) {
			e.getLocalizedMessage();
		}
		sc.close();
	}

}
