package controlador;

import java.util.List;
import modelo.dao.ProductoDAO;
import modelo.dto.ProductoDTO;

/**
 *
 * @author Sebatian Piiñeros G
 */
public class Facade {
    
    public List<ProductoDTO> listarProductos(){
        List<ProductoDTO> lista = null;
        ProductoDAO dao = new ProductoDAO();
        lista = dao.readAll();
        return lista;
    }
    
    public boolean borrar(ProductoDTO elim) {
        ProductoDAO dao = new ProductoDAO();
        return dao.delete(elim);
        
    }
}
