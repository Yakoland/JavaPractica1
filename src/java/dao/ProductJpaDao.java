/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Product;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author jcortes
 */
public class ProductJpaDao implements ProductDao{

    private EntityManager em;
    private EntityManagerFactory emf;

    public ProductJpaDao() {
        emf = Persistence.createEntityManagerFactory("WebServACPU");
        em = emf.createEntityManager();
    }
    
    @Override
    public List<Product> listarTodos() {
        Query q = em.createQuery("Select p From Product p");
        List<Product> producto = q.getResultList();

        return producto;
    }
    @Override
    public void crear(Product producto) {
        em.getTransaction().begin();
        em.persist(producto);
        em.getTransaction().commit();
    }

// me invente esto mirar que hace
//    public void crear(Product producto) {
//        List<Product> x = em.createNamedQuery("Product.findAll")    .setParameter("custName", "Smith")
//    .getResultList();
//    }
    
}
