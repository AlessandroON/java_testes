package dominio;

class Contrato{
  private Proprietario idproprietario;
  private Imovel idimovel;
  private double valordoaluguel;
  private String vigencia;

  public Contrato(Proprietario idproprietario, Imovel idimovel, double valordoaluguel, String vigencia){
    this.idproprietario=idproprietario;
    this.idimovel=idimovel;
    this.valordoaluguel=valordoaluguel;
    this.vigencia=vigencia;
  }
  public Contrato(Proprietario idproprietario, Imovel idimovel, double valordoaluguel){
    this.idproprietario=idproprietario;
    this.idimovel=idimovel;
    this.valordoaluguel=valordoaluguel;
    this.vigencia="2 anos";
  }
  
  //gets
  public String getVigencia(){
    return this.vigencia;
  }
  public Proprietario getIdproprietario(){
    return this.idproprietario;
  }
  public Imovel getIdimovel(){
    return this.idimovel;
  }
  public double getValordoaluguel(){
    return this.valordoaluguel;
  }
  //sets
  public void setVigencia(String vigencia){
    this.vigencia=vigencia;
  }
  public void setIdproprietario(Proprietario idproprietario){
    this.idproprietario=idproprietario;
  }
  public void setIdimovel(Imovel idimovel){
    this.idimovel=idimovel;
  }
  public void setValordoaluguel(double valordoaluguel){
    this.valordoaluguel=valordoaluguel;
  }
  //consultas
   public String consultacontrato(){
     return "Proprietario: " + idproprietario.getNome() + ", Imovel: " + idimovel.toString() + ", Valor do aluguel: " + valordoaluguel + ", Vigencia: " + vigencia;
   }
}