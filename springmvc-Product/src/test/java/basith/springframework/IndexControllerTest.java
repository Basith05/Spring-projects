/**
 * 
 */
package basith.springframework;

//import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties.View;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import basith.springframework.controllers.IndexController;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.*;

/**
 * @author mbasithaa
 * Created on 29 Sep 2019
 * @Name Mohamed Basith
 */
public class IndexControllerTest {
	
	private MockMvc mocMVC;
	
	private IndexController indexController;
	
	@Before
	public void setUp() {
		
		indexController = new IndexController();
		mocMVC = MockMvcBuilders.standaloneSetup(indexController).build();
	}
	
	@Test
	public void indexTest() throws Exception {
		
		mocMVC.perform(MockMvcRequestBuilders.get("/")).andExpect(status().isOk()).andExpect(view().name("index"));
		
	}

}

