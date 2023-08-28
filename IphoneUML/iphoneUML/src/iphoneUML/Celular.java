package iphoneUML;

import java.util.Scanner;

public class Celular {
	
	
	
	public void menu() {
		System.out.println("O que ");
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args) {
		Ipod ipod = new Ipod();
		Internet internet = new Internet();
		Phone phone = new Phone();
		
		System.out.println("_________Menu________");
		System.out.println("1. Ipod");
		System.out.println("2. Internet");
		System.out.println("3. Phone");
		
		Scanner sc = new Scanner(System.in);
		int opcao = sc.nextInt();
		
		switch(opcao) {
			case 1 :{
				System.out.println("_________Ipod________");
				System.out.println("1. Tocar Musica");
				System.out.println("2. Procurar Musica");
				System.out.println("3. Salvar Musica");
				
				int opcaoIpod = sc.nextInt();
				
				if (opcaoIpod == 1) {
					ipod.tocarMusica();
				} else if (opcaoIpod == 2) {
					ipod.procurarMusica();
				} else if (opcaoIpod == 3) {
					ipod.salvarMusica();
				}else {
					System.out.println( "Opcao Invalida");
				}
				break;
			}
			case 2 :{
				System.out.println("_________Internet________");
				System.out.println("1. Naveganr Internet");
				System.out.println("2. Adicionar Favorito");
				
				
				int opcaoInternet = sc.nextInt();
				
				if (opcaoInternet == 1) {
					internet.naveganrInternet();
				} else if (opcaoInternet == 2) {
					internet.adicionarFavorito();
				} else {
					System.out.println( "Opcao Invalida");
				}
				break;
			}
			case 3:{
				System.out.println("_________Phone________");
				System.out.println("1. AdicionarNumero");
				System.out.println("2. Guardar Numero");
				System.out.println("3. Ligar Numero");
				System.out.println("4. Remover Numero");
				
				
				int opcaoPhone = sc.nextInt();
				
				if (opcaoPhone == 1) {
					phone.adicionarNumero();;
				} else if (opcaoPhone == 2) {
					phone.guardarNumero();;
				} else if (opcaoPhone == 3) {
					phone.ligarNumero();;
				}else if (opcaoPhone == 4) {
					phone.removerNumero();;
				}else {
					System.out.println( "Opcao Invalida");
				}
				break;
			}
			default :{
				System.out.println("Opcao Invalida");
			}
		}
		sc.close();
		
	}
	
}
