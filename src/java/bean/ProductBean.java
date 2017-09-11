/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import dao.ProductDao;
import dao.ProductJpaDao;
import entidades.Product;
import java.util.List;

/**
 *
 * @author jcortes
 */
public class ProductBean {
    private ProductDao productDao;

    public ProductBean() {
        if(productDao == null){
            System.out.println("Dao Null");
            productDao = new ProductJpaDao();
        }
    }
    public List<Product> listarTodos(){
        return productDao.listarTodos();
    }
    public void crear(Product producto){
        productDao.crear(producto);
    }
}
