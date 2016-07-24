package springmvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginControler {
	
	@RequestMapping("/views/doLogin")
	public ModelAndView  doLogin(String name, String pwd){
		ModelAndView mv = new ModelAndView();
		
		System.out.println(name + " : " + pwd);
		mv.setViewName("/views/hello");
		return mv;
	}
	
	//json²Ù×÷
	@RequestMapping("/views/jsonLogin")
	@ResponseBody
	public Map<String, Object> jsonLogin(String action){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("action", action);
		System.out.println(action);
		return map;
	}
	
	
	
}
