package one.digitalinnovation.padroesProjetoJava.spring.service.impl;
import java.util.Optional;


import one.digitalinnovation.padroesProjetoJava.spring.model.Cliente;
import one.digitalinnovation.padroesProjetoJava.spring.model.ClienteRepository;
import one.digitalinnovation.padroesProjetoJava.spring.model.Endereco;
import one.digitalinnovation.padroesProjetoJava.spring.model.EnderecoRepository;
import one.digitalinnovation.padroesProjetoJava.spring.service.ClienteService;
import one.digitalinnovation.padroesProjetoJava.spring.service.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService; //Client http


    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);

        if (cliente.isPresent()) {
            return cliente.get();
        }else {
            return null;
        }
    }

    @Override
    public void inserir(Cliente cliente) {

        SalvarClienteComCep(cliente);

    }

       @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteBancoDados = clienteRepository.findById(id);
        if (clienteBancoDados.isPresent()){
         SalvarClienteComCep(cliente);
        }

    }

    @Override
    public void deletar(Long id) {
        clienteRepository.deleteById(id);

    }

    private void SalvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            //Caso o endereço não exista, o programa consome a api do viacep...
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        clienteRepository.save(cliente);
    }
}
