
class Apartamento extends Imovel{
  private byte numeroDeQuartos;
  private short andar;
  private double valorDoCondominio;

  Apartamento(String rua, String numero, String cep, String estado, String cidade, String tipo, String utilizacao, byte numeroDeQuartos, short andar, double valorDoCondominio){
    super(rua, numero, cep, estado, cidade, tipo, utilizacao);
    this.numeroDeQuartos=numeroDeQuartos;
    this.andar=andar;
    this.valorDoCondominio=valorDoCondominio;
  }
  @Override
    public String toString() {
      return super.toString() + "Número de Quartos: " + numeroDeQuartos + ", Andar: " + andar + ", Valor do Condominio: " + valorDoCondominio;
    }
  
}
