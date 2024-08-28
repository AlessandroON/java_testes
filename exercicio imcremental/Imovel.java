package dominio;

import java.util.ArrayList;

public abstract class Imovel {
  private Endereco endereco;
  private String tipo;
  private String utilizacao;
  private ArrayList<Historico> historico;

  public Imovel( String rua, String numero, String cep, String estado, String cidade, String tipo, String utilizacao) {
    this.endereco=new Endereco(rua, numero, cep, cidade, estado);
    this.tipo = tipo;
    this.utilizacao = utilizacao;
    this.historico = new ArrayList<Historico>();
  }
  public Imovel (String rua, String numero, String cep, String tipo, String utilizacao) {
    this.endereco=new Endereco(rua, numero, cep, "Salvador", "Bahia");
    this.tipo = tipo;
    this.utilizacao = utilizacao;
    this.historico = new ArrayList<Historico>();
  }

  //sets pra endereco
  public void atualizaEndereco(String rua, String numero, String cep, String cidade, String estado){
    this.endereco.setRua(rua);
    this.endereco.setNumero(numero);
    this.endereco.setCep(cep);
    if (cidade!=null){
      this.endereco.setCidade(cidade);
    }
    if (estado!=null){
      this.endereco.setEstado(estado);
    }
  }
  public void atualizaEndereco(String rua, String numero, String cep){
    atualizaEndereco(rua, numero, cep, null, null);
  }
  //consulta
  public String toString(){
    return endereco.toString() + ", Tipo: " + tipo + ", Utilização: " + utilizacao;
  }

  public void addHistorico(Historico historico){
  this.historico.add(historico);
  }
  
  // gets
  public Endereco getEndereco() {
    return this.endereco;
  }

  public String getTipo() {
    return this.tipo;
  }

  public String getUtilizacao() {
    return this.utilizacao;
  }
  
  // sets
  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setUtilizacao(String utilizacao) {
    this.utilizacao = utilizacao;
  }

}  