/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import bean.ProductBean;
import entidades.Product;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author jcortes
 */
@WebService(serviceName = "ProductoWS")
public class ProductoWS {

 private ProductBean productBean;
 
    @WebMethod(operationName = "Saludo")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hola, " + txt + " !";
    }

    /**
     * Web service operation
     * @return 
     */
    @WebMethod(operationName = "ListarProductos")
    public List<Product> ListarProductos() {
        productBean = new ProductBean();
        return productBean.listarTodos();
    }

    /**
     * Web service operation
     * @param producto
     */
    @WebMethod(operationName = "CrearProducto")
    @Oneway
    public void CrearProducto(@WebParam(name = "producto") Product producto) {
        productBean = new ProductBean();
        productBean.crear(producto);
    }
}
