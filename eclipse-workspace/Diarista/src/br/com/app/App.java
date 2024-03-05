package br.com.app;

import br.com.classes.Diarista;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Diarista objeto = new Diarista(); 
			
	        Scanner campo = new Scanner(System.in);
	        
	        System.out.println("Digite o nome desta Diarista: ");
	        objeto.nome = campo.nextLine();
	        
			System.out.println("Digite o endereço: ");
			objeto.endereco = campo.nextLine();
			
			System.out.println("Digite seu telefone: ");
			objeto.telefone = campo.nextLine();
			
			
		
			System.out.println("Nome: " + objeto.nome);
			System.out.println("Meu endereço é: " + objeto.endereco);
			System.out.println("meu telefone é : " + objeto.telefone);
			objeto.job("Fernanda");
	}

}
