package entrada;

import dominio.*;

public interface EntradaDeDados {
    Proprietario cadastrarProprietario();
    Imovel cadastrarImovel();
    Contrato cadastrarContrato(Proprietario proprietario, Imovel imovel);
}