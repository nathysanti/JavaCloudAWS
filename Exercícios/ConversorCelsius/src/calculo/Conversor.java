package calculo;

import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		System.out.println("Conversor de celsius para fahrenheit");
		System.out.println("Informe o valor a ser convertido: ");
		
		try (Scanner val = new Scanner(System.in)) {
			int valor = val.nextInt();

			
			System.out.println("Selecione para qual medida o valor selecionado será convertido");
			System.out.println("Menu");
			System.out.println("1 - Fahrenheit");
			System.out.println("2 - Kelvin");
			int op = val.nextInt();	
			
			if(op == 1) {
				double valorConvertido = valor * 1.8 + 32;
				System.out.println(" O valor informado em Fahrenheit é: " + valorConvertido);
			} else if(op == 2) {
				double valorConvertido = valor + 273;
				System.out.println(" O valor informado em Kelvin é: " + valorConvertido);
			}else {
				System.out.println("Opção Invalida!");
			}
			
		}
		
	}


}
