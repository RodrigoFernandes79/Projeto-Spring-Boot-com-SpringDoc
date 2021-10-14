package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import model.Cliente;
import service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<Object> buscarTodos(){
		return ResponseEntity.ok(clienteService.buscarTodos());
		
		
	}
	
	@PostMapping
	public ResponseEntity<Object> criarCliente(@RequestBody Cliente cliente){
		return ResponseEntity.ok().body(clienteService.criarCliente(cliente));
		
	}

}
