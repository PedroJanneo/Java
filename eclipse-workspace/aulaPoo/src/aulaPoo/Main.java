package aulaPoo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1 = 10; 
		float nota2 = 10;
		float nota3 = 10;
		float nota4 = 0;
		
		float media = (nota1 + nota2 + nota3 + nota4) /4;
		
		if (media <=5)  { 
		System.out.println("aluno reprovado");
		}
		else if (media >=6| media <=7) {
			System.out.println("aluno de recuperação");
		}
		else System.out.println("aluno aprovado");
			
		System.out.println(media);
	}

}
