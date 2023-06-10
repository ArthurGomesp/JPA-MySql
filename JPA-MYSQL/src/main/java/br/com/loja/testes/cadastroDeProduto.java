package br.com.loja.testes;

import br.com.loja.Model.Produto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class cadastroDeProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("xiomi 13");
        produto.setDescricao("bom");
        produto.setPreco(new BigDecimal("5000"));

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("loja");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        em.close();
    }
}
