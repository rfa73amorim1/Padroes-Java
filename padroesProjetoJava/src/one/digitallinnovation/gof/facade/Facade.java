package one.digitallinnovation.gof.facade;

import subsistema1.externo.crm.baseCrmService;
import subsistema2.externo.cep.ApiComCeps;


public class Facade {
    public void migrarCliente(String nome, String cep){

        String cidade = ApiComCeps.getInstancia().recuperarCidade(cep);
        String estado  = ApiComCeps.getInstancia().recuperarEstado(cep);

        baseCrmService.gravarCliente(nome,cep, cidade,estado);






    }
}
