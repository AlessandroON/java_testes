package dominio;

class Historico{
  private byte dataInicial, dataFinal;
  private byte nota;
  private String inquilino;

  Historico(byte dataInicial, byte dataFinal, byte nota, String inquilino){
    this.dataFinal=dataFinal;
    this.dataInicial=dataInicial;
    this.nota=nota;
    this.inquilino=inquilino;
    
  }

public void setNota(byte nota){
  this.nota=nota;
}
}