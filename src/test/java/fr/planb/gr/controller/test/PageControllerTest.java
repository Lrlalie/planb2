package fr.planb.gr.controller.test;
import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.*;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@WebMvcTest
public class PageControllerTest {

	@Autowired
	private MockMvc mvc;
	
	//the method below explains that if i'll made a get request to the home page, i expect a status code : ok, so 200; and the
	//content will be "hello world"
	@Test
	public void home() throws Exception {
		this.mvc.perform(get("/")).andExpect(status().isOk())
				.andExpect(content().string(containsString("hello world")));
	
		this.mvc.perform(get("/?name=mercury")).andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello Mercury")));
		
		this.mvc.perform(get("/?name=")).andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello Aucune")));
		
		this.mvc.perform(get("/?name=Bowie")).andExpect(status().isOk())
		.andExpect(content().string(containsString("Hello Bowie")));
	}
}
