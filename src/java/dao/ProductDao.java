/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Product;
import java.util.List;

/**
 *
 * @author jcortes
 */
public interface ProductDao {
    
    List<Product> listarTodos();
    
    public void crear(Product producto);
}
