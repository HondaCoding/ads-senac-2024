package com.example.prova;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class FuncionarioService {
	
	   @Autowired
	    private FuncionarioRepositorio funcionarioRepository;

	    // CREATE
	    @PostMapping
	    public FuncionarioEntidade criarFuncionario(@RequestBody FuncionarioEntidade funcionario) {
	        return funcionarioRepository.save(funcionario);
	    }

	    // READ
	    @GetMapping
	    public List<FuncionarioEntidade> listarFuncionarios() {
	        return funcionarioRepository.findAll();
	    }

	    @GetMapping("/{id}")
	    public FuncionarioEntidade buscarFuncionarioPorId(@PathVariable Long id) {
	        return funcionarioRepository.findById(id).orElse(null);
	    }

	    // UPDATE
	    @PutMapping("/{id}")
	    public FuncionarioEntidade atualizarFuncionario(@PathVariable Long id, @RequestBody FuncionarioEntidade funcionario) {
	        funcionario.setId(id);
	        return funcionarioRepository.save(funcionario);
	    }

	    // DELETE
	    @DeleteMapping("/{id}")
	    public void deletarFuncionario(@PathVariable Long id) {
	        funcionarioRepository.deleteById(id);
	    }
	
}
