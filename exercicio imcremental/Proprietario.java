package dominio;


class Proprietario{
  private String nome;
  private String cpf;
  private String identidade;
  private Endereco endereco;
  private String telefone;
  private String dadospg;

  public Proprietario(String nome, String cpf, String identidade, String rua, String numero, String cep, String cidade, String estado, String telefone, String dadospg) {
      this.nome = nome;
      this.cpf = cpf;
      this.identidade = identidade;
      this.endereco = new Endereco(rua, numero, cep, cidade, estado);
      this.telefone = telefone;
      this.dadospg = dadospg;
  }

  public Proprietario(String nome, String cpf, String identidade, String rua, String numero, String cep, String telefone, String dadospg){
    this.nome=nome;
    this.cpf=cpf;
    this.identidade=identidade;
    this.telefone=telefone;
    this.dadospg=dadospg;
    this.endereco=new Endereco(rua, numero, cep, "Salvador", "Bahia");
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

  
//gets
  public String getNome(){
    return this.nome;
  }
  public String getCpf(){
    return this.cpf;
  }
  public String getIdentidade(){
    return this.identidade;
  }
  public String getTelefone(){
    return this.telefone;
  }
  public String getdadospg(){
    return this.dadospg;
  }
  public Endereco getEndereco(){
    return this.endereco;
  }
  //sets
  public void setNome(String nome){
    this.nome=nome;
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public void setIdentidade(String identidade){
    this.identidade = identidade;
  }
  public void setTelefone(String telefone){
    this.telefone = telefone;
  }
  public void setdadospg(String dadospg){
    this.dadospg = dadospg;
  }
  
//consultas
  public String consultaProprietario() {
      return "Nome: " + nome + ", CPF: " + cpf + ", Identidade: " + identidade + ", Rua: " + getEndereco().getRua() + ", Número: " + getEndereco().getNumero() +
             ", CEP: " + getEndereco().getCep() + ", Cidade: " + getEndereco().getCidade() + ", Estado: " + getEndereco().getEstado() + ", Telefone: " + telefone + ", Dados do pagamento: " + dadospg;
  }

  public String consultaSimplesProprietario(){
    return "Nome: " + nome + ", Identidade: " + identidade + ", Rua: " +  getEndereco().getRua() + ", Número: " + getEndereco().getNumero() +
         ", CEP: " + getEndereco().getCep() + ", Cidade: " + getEndereco().getCidade() + ", Estado: " + getEndereco().getEstado() + ", Telefone: " + telefone;
  }

  

  
}