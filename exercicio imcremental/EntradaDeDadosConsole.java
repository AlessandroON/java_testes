package entrada;

import java.util.Scanner;
import dominio.*;

public class EntradaDeDadosConsole implements EntradaDeDados {
    private Scanner scanner = new Scanner(System.in);

    public Proprietario cadastrarProprietario() {
        System.out.println("Digite o nome do proprietário:");
        String nome = scanner.nextLine();
        System.out.println("Digite o CPF do proprietário:");
        String cpf = scanner.nextLine();
        System.out.println("Digite a identidade do proprietário:");
        String identidade = scanner.nextLine();
        System.out.println("Digite a rua do proprietário:");
        String rua = scanner.nextLine();
        System.out.println("Digite o número do proprietário:");
        String numero = scanner.nextLine();
        System.out.println("Digite o CEP do proprietário:");
        String cep = scanner.nextLine();
        System.out.println("Digite a cidade do proprietário:");
        String cidade = scanner.nextLine();
        System.out.println("Digite o estado do proprietário:");
        String estado = scanner.nextLine();
        System.out.println("Digite o telefone do proprietário:");
        String telefone = scanner.nextLine();
        System.out.println("Digite os dados de pagamento do proprietário:");
        String dadospg = scanner.nextLine();

        Endereco endereco = new Endereco(rua, numero, cep, cidade, estado);
        return new Proprietario(nome, cpf, identidade, endereco, telefone, dadospg);
    }

    public Imovel cadastrarImovel() {
        System.out.println("Digite o tipo de Imóvel a ser cadastrado: Casa ou Apartamento");
        String tipoImovel = scanner.nextLine();
        if (tipoImovel.equals("Casa")) {
            System.out.println("Digite a rua da casa:");
            String rua = scanner.nextLine();
            System.out.println("Digite o número da casa:");
            String numero = scanner.nextLine();
            System.out.println("Digite o CEP da casa:");
            String cep = scanner.nextLine();
            System.out.println("Digite a cidade da casa:");
            String cidade = scanner.nextLine();
            System.out.println("Digite o estado da casa:");
            String estado = scanner.nextLine();
            System.out.println("Digite a utilização da casa:");
            String utilizacao = scanner.nextLine();
            System.out.println("Digite o número de quartos da casa:");
            byte numeroDeQuartos = Byte.parseByte(scanner.nextLine());
            System.out.println("Digite a área da casa:");
            double area = Double.parseDouble(scanner.nextLine());
            return new Casa(rua, numero, cep, estado, cidade, tipoImovel, utilizacao, numeroDeQuartos, area);
        } else if (tipoImovel.equals("Apartamento")) {
            System.out.println("Digite a rua do apartamento:");
            String rua = scanner.nextLine();
            System.out.println("Digite o número do apartamento:");
            String numero = scanner.nextLine();
            System.out.println("Digite o CEP do apartamento:");
            String cep = scanner.nextLine();
            System.out.println("Digite a cidade do apartamento:");
            String cidade = scanner.nextLine();
            System.out.println("Digite o estado do apartamento:");
            String estado = scanner.nextLine();
            System.out.println("Digite a utilização do apartamento:");
            String utilizacao = scanner.nextLine();
            System.out.println("Digite o número de quartos do apartamento:");
            byte numeroDeQuartos = Byte.parseByte(scanner.nextLine());
            System.out.println("Digite o andar do apartamento:");
            short andar = Short.parseShort(scanner.nextLine());
            System.out.println("Digite o valor do condomínio do apartamento:");
            double valorDoCondominio = Double.parseDouble(scanner.nextLine());
            return new Apartamento(rua, numero, cep, estado, cidade, tipoImovel, utilizacao, numeroDeQuartos, andar, valorDoCondominio);
        } else {
            throw new IllegalArgumentException("Tipo de imóvel não reconhecido.");
        }
    }

    @Override
    public Contrato cadastrarContrato(Proprietario proprietario, Imovel imovel) {
        System.out.println("Digite o valor do aluguel:");
        double valorDoAluguel = Double.parseDouble(scanner.nextLine());
        System.out.println("Digite a vigência do contrato:");
        String vigencia = scanner.nextLine();
        return new Contrato(proprietario, imovel, valorDoAluguel, vigencia);
    }
}
