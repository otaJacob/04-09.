package Modificadores;

import java.util.Scanner;

public class ObjetoPessoaAutomovel {

	public static void main(String[] args) {
		 
		Scanner ler = new Scanner(System.in);	
		
		//criar o objeto pessoa
		Pessoa pessoa = new Pessoa();
		
		int cor;
		String nome;
		int velocidade;
		
		String.out.println("Informe a cor do carro");
		cor = ler.nextInt();
		
		String.out.println("Informe a velocidade do carro");
		velocidade = ler.nextInt();
		
		//Utlizar o metodo compracarro
		pessoa.compracarro(cor, nome, velocidade);
		
		//ultilizado para mostrar o retorno do carro comprado
		Automovel carro = pessoa.getAutomovel()
				
		System.out).println("o carro comprado foi" + carro.getNome())+ "da cor"
		        +carro.getCor() + "que atinge a velocidade de " + carro.getVelocidade();
		ler.close();
		
		
	}	

}
