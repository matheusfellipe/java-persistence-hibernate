
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathe
 */
public class Aplication {
    
    public static void main(String[] args){
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("obras");
    
    EntityManager em = factory.createEntityManager();
    
    Produto produto = new Produto();
    produto.setDescricao("Iphone");
    produto.setMarca("Apple");
    produto.setVlrUnitario("5.000,00");
    produto.setQtdEstoque(5);
    
     Cliente cliente = new Cliente();
     cliente.setNome("Junior");
     cliente.setCpf("09984521325");
     cliente.setEndereco("av. Zulmira Canavarros, n. 56");
     cliente.setTelefone("65984565845");
     
     Loja loja = new Loja();
     loja.setNome_fantasia("Apple");
     loja.setRazao_social("Comercio de Eletronicos LTDA");
     loja.setCnpj("54.15454/000154");
     loja.setEmail("apple@contato.com");
    
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    em.persist(produto);
    em.persist(cliente);
    em.persist(loja);
    tx.commit();
    em.close();
   factory.close();
    
    }
}
