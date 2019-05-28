package br.com.blz.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.blz.entity.Produto;


@RepositoryRestResource
public interface ProdutoRepository extends CrudRepository<Produto, Integer>{

}
