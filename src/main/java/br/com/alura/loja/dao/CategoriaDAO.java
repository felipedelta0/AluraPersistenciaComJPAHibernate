package br.com.alura.loja.dao;

import br.com.alura.loja.modelo.Categoria;
import jakarta.persistence.EntityManager;

public class CategoriaDAO {

    private final EntityManager em;

    public CategoriaDAO(EntityManager em) {
        this.em = em;
    }

    public void cadastrar(Categoria categoria) {
        this.em.persist(categoria);
    }

    public void atualizar(Categoria categoria) {
        this.em.merge(categoria);
    }

    public void remover(Categoria categoria) {
        this.em.remove(categoria);
    }
}
