/**
 * 
 */
package basith.springframework.services;

import java.util.List;

import basith.springframework.domain.Product;

/**
 * @author mbasithaa
 * Created on 28 Sep 2019
 * @Name Mohamed Basith
 */
public interface ProductService {
	
	List<Product> listAllProducts();
	
	Product getProductById(Integer id);
	
	Product createNewProduct(Integer id);
	
	Product saveOrUpdateProduct(Product product);
	
	void deleteById(Integer id);

}
