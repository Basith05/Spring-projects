/**
 * 
 */
package basith.springframework.services;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.management.RuntimeErrorException;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import basith.springframework.domain.Product;

/**
 * @author mbasithaa
 * Created on 28 Sep 2019
 * @Name Mohamed Basith
 */
@Service
@Profile("reqMap")
public class ProductServiceImpl implements ProductService{

	private Map<Integer, Product> products;
	
	public ProductServiceImpl() {
		loadProducts();
	}
	
	@Override
	public List<Product> listAllProducts() {
		// TODO Auto-generated method stub

		return new ArrayList<>(products.values());
	}
	
	private void loadProducts() {
		
		products = new HashMap<Integer, Product>();
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setDesc("Product 1");
		product1.setPrice(new BigDecimal("12.99"));
		product1.setImageURL("http://example.com/product1");
		
		products.put(1, product1);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setDesc("Product 2");
		product2.setPrice(new BigDecimal("14.99"));
		product2.setImageURL("http://example.com/product2");
		
		products.put(2, product2);
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setDesc("Product 3");
		product3.setPrice(new BigDecimal("15"));
		product3.setImageURL("http://example.com/product3");
		
		products.put(3, product3);
		
		Product product4 = new Product();
		product4.setId(4);
		product4.setDesc("Product 4");
		product4.setPrice(new BigDecimal("12.99"));
		product4.setImageURL("http://example.com/product4");
		
		products.put(4, product4);
	}

	@Override
	public Product getProductById(Integer id) {
		// TODO Auto-generated method stub
		return products.get(id);
	}

	@Override
	public Product createNewProduct(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Product saveOrUpdateProduct(Product product) {

		if(product != null) {
			if(product.getId() == null) {
				product.setId(getNextKey());
			}
			
			products.put(product.getId(), product);
			
			return product;
		}
		else {
			throw new RuntimeException("Product cant be null");
		}
	}
	
	private Integer getNextKey() {
		return Collections.max(products.keySet()) + 1;
	}

	@Override
	public void deleteById(Integer id) {
		
		products.remove(id);
		
		return;
	}
	

}
