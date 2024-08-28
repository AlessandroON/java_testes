
package entrada;
import dominio.*;

public class Main {
    public static void main(String[] args) {
        EntradaDeDados entrada = new EntradaDeDadosConsole();
        Proprietario proprietario = entrada.cadastrarProprietario();
        Imovel imovel = entrada.cadastrarImovel();
        Contrato contrato = entrada.cadastrarContrato(proprietario, imovel);

        System.out.println(proprietario.consultaProprietario());
        System.out.println(imovel.consultaimovel());
        System.out.println(contrato.consultaContrato());
    }
}
