
public class Casa extends Imovel{
  private byte numeroDeQuartos;
  private double area;

  Casa(String rua, String numero, String cep, String estado, String cidade, String tipo, String utilizacao, byte numeroDeQuartos, double area){
    super(rua, numero, cep, estado, cidade, tipo, utilizacao);
    this.numeroDeQuartos=numeroDeQuartos;
    this.area=area;
  }
  @Override
  public String toString() {
    return super.toString() + "Número de Quartos: " + numeroDeQuartos + ", Área: " + area;
  }
  
}