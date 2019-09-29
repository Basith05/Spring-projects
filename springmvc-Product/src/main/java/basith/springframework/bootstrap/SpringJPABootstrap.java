/**
 * 
 */
package basith.springframework.bootstrap;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import basith.springframework.domain.Product;
import basith.springframework.services.ProductService;

/**
 * @author mbasithaa
 * Created on 29 Sep 2019
 * @Name Mohamed Basith
 */

@Component
public class SpringJPABootstrap implements ApplicationListener<ContextRefreshedEvent>{

	private ProductService productService;
	
	public ProductService getProductService() {
		return productService;
	}

	@Autowired
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {

		loadProducts();
		
	}

	public void loadProducts() {
		
		
		Product product1 = new Product();
		product1.setId(1);
		product1.setDesc("Product 1");
		product1.setPrice(new BigDecimal("12.99"));
		product1.setImageURL("http://example.com/product1");
		
		productService.saveOrUpdateProduct(product1);
		
		Product product2 = new Product();
		product2.setId(2);
		product2.setDesc("Product 2");
		product2.setPrice(new BigDecimal("14.99"));
		product2.setImageURL("http://example.com/product2");
		
		productService.saveOrUpdateProduct(product2);
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setDesc("Product 3");
		product3.setPrice(new BigDecimal("15"));
		product3.setImageURL("http://example.com/product3");
		
		productService.saveOrUpdateProduct(product3);
		
		Product product4 = new Product();
		product4.setId(4);
		product4.setDesc("Product 4");
		product4.setPrice(new BigDecimal("12.99"));
		product4.setImageURL("http://example.com/product4");
		
		productService.saveOrUpdateProduct(product4);
		
	}
}
