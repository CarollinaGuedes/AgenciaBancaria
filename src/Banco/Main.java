package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        DadosClientes[] clientesBancarios = new DadosClientes[5];

        int opcaomenu = 0;
        int clientesCadastrados = 0;

        while (opcaomenu != 4) {
            System.out.println("\n----- Escolha uma das opções -----");
            System.out.println("1. Cadastro pessoa física");
            System.out.println("2. Cadastro pessoa jurídica");
            System.out.println("3. Mostrar os dados do cliente");
            System.out.println("4. Opção Sair");
            System.out.print("Escolha uma das opções: ");

            opcaomenu = scanner.nextInt();
            scanner.nextLine();

            if (opcaomenu == 1) {
                if (clientesCadastrados < 5) {
                    System.out.println("\n--- Cadastro Pessoa Física ---");
                    System.out.print("Nome Completo: ");
                    String nome = scanner.nextLine();

                    System.out.print("Profissão: ");
                    String profissao = scanner.nextLine();

                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Email: ");
                    String email = scanner.nextLine();

                    System.out.print("Salário: ");
                    int salario = scanner.nextInt();
                    scanner.nextLine();

                    PessoaFisica pessoafisica = new PessoaFisica(nome, profissao, endereco, telefone, email, salario);
                    clientesBancarios[clientesCadastrados] = pessoafisica;
                    clientesCadastrados++;
                    System.out.println("Cliente cadastrado com sucesso!");
                } else {
                    System.out.println("Banco lotado!");
                }

            } else if (opcaomenu == 2) {
                if (clientesCadastrados < 5) {
                    System.out.println("\n--- Cadastro Pessoa Jurídica ---");
                    System.out.print("Nome da Empresa: ");
                    String nomeEmpresa = scanner.nextLine();

                    System.out.print("Endereço Corporativo: ");
                    String endereco = scanner.nextLine();

                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    System.out.print("Email de Contato: ");
                    String email = scanner.nextLine();

                    System.out.print("CNPJ: ");
                    String cnpj = scanner.nextLine();

                    System.out.print("Faturamento Anual: ");
                    int faturamento = scanner.nextInt();
                    scanner.nextLine();

                    PessoaJuridica pessoaJuridica = new PessoaJuridica(nomeEmpresa, endereco, telefone, email, cnpj, faturamento);
                    clientesBancarios[clientesCadastrados] = pessoaJuridica;
                    clientesCadastrados++;
                    System.out.println("Empresa cadastrada com sucesso!");
                } else {
                    System.out.println("Banco lotado!");
                }

            } else if (opcaomenu == 3) {
                if (clientesCadastrados == 0) {
                    System.out.println("Nenhum cliente cadastrado no momento.");
                } else {
                    for (int i = 0; i < clientesCadastrados; i++) {
                        System.out.println("\n----------------------------------");
                        System.out.print("Digite a senha para acessar a conta de " + clientesBancarios[i].nomeCompleto + ": ");
                        String senhaInformada = scanner.nextLine();

                        Autenticacao contaSegura = (Autenticacao) clientesBancarios[i];


                        if (contaSegura.autenticar(senhaInformada)) {
                            System.out.println("\n[ACESSO PERMITIDO]");
                            System.out.println("Nome do Titular: " + clientesBancarios[i].nomeCompleto);
                            clientesBancarios[i].creditoExtra();
                        } else {
                            System.out.println("\n[ERRO: ACESSO NEGADO] Senha inválida para este cliente.");
                        }
                    }
                }
            } else if (opcaomenu == 4) {
                System.out.println("Estamos finalizando nosso sistema... Missão cumprida!");
            } else {
                System.out.println("Opção inválida, tente novamente.");
            }
        }

        scanner.close();
    }
}
