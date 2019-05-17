package pe.com.microservice.microservicebackend;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class UserController {

	@RequestMapping(value ="/service/user/list", 
			method = RequestMethod.GET, produces = { "application/json" })
	@ResponseBody
	public List<User> login() {
		
		List<User> response = new ArrayList<User>();			

		response.add(new User("admin","Jose Vega","jvega@gmail.com","985475648"));
		response.add(new User("mloza","Miguel Loza","mloza@gmail.com","985475684"));
		return response;
	}
	
	
}
