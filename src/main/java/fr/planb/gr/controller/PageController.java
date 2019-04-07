package fr.planb.gr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

/** * 
 * @author LALIE
 * The annotation @Controller allows us to define our class as a controller
 * It will synchronize model and view : it retrieves user's events and generates actions.  * 
 */

@Controller
public class PageController {
	
	@GetMapping("/")
	//@ResponseBody
	//@GetMapping("/") : allows the browser to execute the methode home
	//but this also means : search for a view (in the MVC context) 
	//add : @ResponseBody : means to browser to take the content in priority and here we want to tell The browser to search 
	//the home template (in template/page/home)
	//i should to delete index.html in src/main/resources/static
	//so when we have a template : delete : @ResponseBody, then it will search for template
	public String home(@RequestParam(required=false, defaultValue="Aucune") String name, ModelMap modelMap) {
		
				modelMap.put("name", name);
				return "page/home";
	}

}
