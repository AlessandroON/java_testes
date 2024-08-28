package dominio;  

  import java.util.ArrayList;

  class ListadeContratos {
    private ArrayList<Contrato> contratos = new ArrayList<Contrato>();

    public void addContrato(Contrato contrato) {
      contratos.add(contrato);
    }

    public String procurarImoveis(Proprietario proprietario) {
      String resultado = "";
      int i=1;
      for (Contrato contrato : contratos) {
        if (contrato.getIdproprietario().equals(proprietario)) {
          resultado += " Imovel "+i+": " + contrato.getIdimovel().toString() + "\n";
          i+=1;
        }
      }
      if (resultado.isEmpty()) {
        return "Nenhum imovel encontrado";
      }
      return resultado;
    }
  }