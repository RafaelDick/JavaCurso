package aula02;

import java.util.Scanner;

public class Contato {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		
		System.out.print("Digite o seu Nome: ");
		String nome = sc.nextLine();
		System.out.print("Digite o seu Celular: ");
	    String celular = sc.nextLine();
		System.out.print("Digite o seu E-mail: ");
		String email = sc.nextLine();
				
		
		System.out.println(nome + ": " + celular + " - " + email);
		}

}
