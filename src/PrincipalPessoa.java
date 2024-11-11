import java.util.Scanner;

public class PrincipalPessoa {
    private static Pessoa pessoa;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Imprimir");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    cadastrar();
                    break;
                case 2:
                    imprimir();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nCadastrar:");
        System.out.println("1. Pessoa Física");
        System.out.println("2. Pessoa Jurídica");
        System.out.print("Escolha uma opção: ");
        int tipo = scanner.nextInt();
        scanner.nextLine();

        if (tipo == 1) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CPF: ");
            String cpf = scanner.nextLine();
            System.out.print("Data de Nascimento: ");
            String dataNascimento = scanner.nextLine();

            pessoa = new PessoaFisica(nome, cpf, dataNascimento);
            System.out.println("Pessoa Física cadastrada com sucesso!");

        } else if (tipo == 2) {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("CNPJ: ");
            String cnpj = scanner.nextLine();
            System.out.print("Inscrição Estadual: ");
            String inscricaoEstadual = scanner.nextLine();
            System.out.print("Nome Fantasia: ");
            String nomeFantasia = scanner.nextLine();
            System.out.print("Razão Social: ");
            String razaoSocial = scanner.nextLine();

            pessoa = new PessoaJuridica(nome, cnpj, inscricaoEstadual, nomeFantasia, razaoSocial);
            System.out.println("Pessoa Jurídica cadastrada com sucesso!");

        } else {
            System.out.println("Opção inválida!");
        }
    }

    public static void imprimir() {
        if (pessoa == null) {
            System.out.println("Erro: Nenhuma pessoa cadastrada.");
        } else {
            pessoa.imprimir();
        }
    }
}
