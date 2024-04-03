package contaTerminal.java;

		import java.util.locale;
		import java.util.Scanner;

		public class ContaTerminal {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Bem-vindo ao sistema de registro do banco.");

		        // Registro do cliente
		        System.out.println("Por favor, insira os seguintes dados do cliente:");

		        System.out.print("Número de identificação do usuário: ");
		        int numeroIdentificacao = scanner.nextInt();
		        scanner.nextLine(); // Limpar o buffer do scanner

		        System.out.print("Agência do usuário: ");
		        String agencia = scanner.nextLine();

		        System.out.print("Nome do cliente: ");
		        String nomeCliente = scanner.nextLine();

		        System.out.print("Saldo da conta: ");
		        double saldoConta = scanner.nextDouble();

		        // Mostrar informações do cliente
		        System.out.println("\nInformações do cliente registradas com sucesso:");
		        System.out.println("Número de identificação do usuário: " + numeroIdentificacao);
		        System.out.println("Agência do usuário: " + agencia);
		        System.out.println("Nome do cliente: " + nomeCliente);
		        System.out.println("Saldo da conta: " + saldoConta);

		        scanner.close();
		    }
		}

		
	}

}
