package Main;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String numero;
		int agencia;
		String nomeCliente;
		double saldo;;
		
		System.out.print("Por favor, digite o seu nome: ");
		nomeCliente = sc.next();
		System.out.print("Por favor, digite o n�mero da sua conta: ");
		numero = sc.next();
		System.out.print("Por favor, digite o n�mero de sua ag�ncia: ");
		agencia = sc.nextInt();
		System.out.print("Por favor, digite o seu saldo: ");
		saldo = sc.nextDouble();
		
		System.out.println("Ol� " + nomeCliente
				+ ", obrigado por criar uma conta em nosso banco, sua ag�ncia � "+ agencia
				+ ", conta " + numero
				+ " e seu saldo R$" + saldo
				+ " j� est� dispon�vel para saque.");
		
		
		sc.close();
	}

}
