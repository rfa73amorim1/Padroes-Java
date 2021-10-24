package subsistema2.externo.cep;

import one.digitallinnovation.gof.singleton.SingletonEager;

public class ApiComCeps {

    private static ApiComCeps instancia  = new ApiComCeps();

    private ApiComCeps() {
        super();
    }

    public static ApiComCeps getInstancia()
    {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Sorocaba";
    }
    public String recuperarEstado(String cep){
        return "SP";
    }

}

