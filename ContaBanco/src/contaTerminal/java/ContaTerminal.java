package contaTerminal.java;

		import java.util.locale;
		import java.util.Scanner;

		public class ContaTerminal {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        System.out.println("Por favor, insira os respectivos dados:");
		        
		        System.out.print("Número de identificação do usuário: ");
		        int numeroIdentificacao = scanner.nextInt();
		        scanner.nextLine(); 

		        System.out.print("Agência do usuário: ");
		        String agencia = scanner.nextLine();

		        System.out.print("Nome do cliente: ");
		        String nomeCliente = scanner.nextLine();

		        System.out.print("Saldo da conta: ");
		        double saldoConta = scanner.nextDouble();

		        System.out.println("Olá" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é:" + agencia + "conta:" + numeroIdentificacao + "e seu saldo" + saldoConta + ", ja esta disponivel para saque.");

		        scanner.close();
		    }
		}

		
	}

}
