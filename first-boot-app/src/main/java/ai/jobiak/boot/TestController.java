package ai.jobiak.boot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {
	
	@RequestMapping(path="/test",method=RequestMethod.GET)
	public String test(@RequestParam(name="loc",defaultValue="Boston",required=false)String loc,@RequestParam(name="address",defaultValue="1-67 square yard",required=false) String address,Model model)
	{
		model.addAttribute("com","jobiak");
		model.addAttribute("ho",loc);
		model.addAttribute("address",address);
		
		model.addAttribute("city","losangels");
		model.addAttribute("famous","MianiBeach");
		
		
	return "success";
	}
}