
package basith.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author mbasithaa
 * Created on 28 Sep 2019
 * @Name Mohamed Basith
 */

@Controller
public class IndexController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
}
