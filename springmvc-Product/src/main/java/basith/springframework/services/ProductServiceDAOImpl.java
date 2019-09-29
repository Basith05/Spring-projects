/**
 * 
 */
package basith.springframework.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import basith.springframework.domain.Product;

/**
 * @author mbasithaa
 * Created on 29 Sep 2019
 * @Name Mohamed Basith
 */

@Service
@Profile("jpadao")
public class ProductServiceDAOImpl implements ProductService{

	
	private EntityManagerFactory emf;
	
	
	public EntityManagerFactory getEmf() {
		
		return emf;
	}

	@PersistenceUnit
	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}

	@Override
	public List<Product> listAllProducts() {

		EntityManager em = emf.createEntityManager();
		
		return em.createQuery("from Product", Product.class).getResultList();
	}

	@Override
	public Product getProductById(Integer id) {

		EntityManager em = emf.createEntityManager();
		return em.find(Product.class,id);
	}

	@Override
	public Product createNewProduct(Integer id) {
		
		EntityManager em = emf.createEntityManager();
		
		return em.find(Product.class, id);
	}

	@Override
	public Product saveOrUpdateProduct(Product product) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Product savedProduct = em.merge(product);
		em.getTransaction().commit();
		
		return savedProduct;
	}

	@Override
	public void deleteById(Integer id) {

		EntityManager em =  emf.createEntityManager();
		
		em.getTransaction().begin();
		em.remove(em.find(Product.class, id));
		em.getTransaction().commit();
	}

}
