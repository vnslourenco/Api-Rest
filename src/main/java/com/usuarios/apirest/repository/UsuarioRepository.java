package com.usuarios.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuarios.apirest.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Usuario findById(long id);
	Usuario findByNome(String nome);
	List<Usuario> findAllByNome (String nome);
	
	Usuario findByNomeAndEmail(String nome, String email);
	
	Usuario findByEmailAndEnderecosNomeRua(String email, String nomeRua);
}
