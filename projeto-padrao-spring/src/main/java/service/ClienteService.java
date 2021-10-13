package service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javassist.tools.rmi.ObjectNotFoundException;
import model.Cliente;
import model.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;
	


	public Object buscarTodos() {
		
		return clienteRepository.findAll();
	}

	
	
	
	public Object criarCliente(Cliente cliente) {
		
		return clienteRepository.save(cliente);
	}




	public Object buscarPorId(Long id) throws ObjectNotFoundException {
	Optional<Cliente> obj = clienteRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Não Foi encontrado nenhum cliente pelo id: " +id ));
	}










	
}