package subsistema1.externo.crm;

public class baseCrmService {

    private baseCrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado){
        System.out.println("Cliente salvo no sistema externo de CRM:");
        System.out.println(nome);
        System.out.println(cep);
        System.out.println(cidade);
        System.out.println(estado);
    }
}
