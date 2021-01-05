package com.usuarios.apirest.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuarios.apirest.models.Usuario;
import com.usuarios.apirest.repository.UsuarioRepository;


@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	@GetMapping("/usuarios")
	public List<Usuario> listaUsuario() {
		return usuarioRepository.findAll();
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuario listaUsuarioUnico(@PathVariable (value="id") long id) {
		return usuarioRepository.findById(id);
	}
	
	@GetMapping("/usuarios/{email}/enderecos/{nomeRua}")
	public Usuario listaUsuarioUnico(@PathVariable (value="email") String email,@PathVariable (value="nomeRua") String nomeRua ) {
		return usuarioRepository.findByEmailAndEnderecosNomeRua(email, nomeRua);
	}
	
	@PostMapping("/usuarios")
	public Usuario salvaUsuario(@RequestBody Usuario usuario) throws Exception {
	try {
		return usuarioRepository.save(usuario);
	} catch (Exception e) {
		throw new Exception("Erro!");
	}
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void deletaUsuario(@PathVariable (value="id") long id) {
		usuarioRepository.deleteById(id);
	}
		
	
}
