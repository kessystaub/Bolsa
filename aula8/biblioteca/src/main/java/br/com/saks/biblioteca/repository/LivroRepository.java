/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saks.biblioteca.repository;

import br.com.saks.biblioteca.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author 6962246
 */

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long>{
    
}
