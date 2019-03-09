package com.app.mvc;


import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("/hai")
public class HelloController{
	


	//	@RequestMapping("/welcome")
//	public ModelAndView hello() {
//		ModelAndView modelview=new ModelAndView("Home");
//	 modelview.addObject("welcomemessage","Hiii user,welcome to the first spring mvc application");
//	return modelview;
//	}
//	@RequestMapping("/hello/{cityname}/{username}")
//	//public ModelAndView hello1(@PathVariable("username") String name,@PathVariable("cityname") String city) 
//	public ModelAndView hello2(@PathVariable Map<String,String> pathVars)
//	{
//		String name=pathVars.get("username");
//		String cityname=pathVars.get("cityname");
//		
//		ModelAndView modelview=new ModelAndView("Home");
//	 modelview.addObject("welcomemessage","Hello user "+name+ "I am from "+cityname);
//	return modelview;
//	}
	@RequestMapping(value="f",method=RequestMethod.GET)
	public ModelAndView getAdimission() {
		ModelAndView modelview=new ModelAndView("admission");
		return modelview;
	}
	
	@RequestMapping(value="f2",method=RequestMethod.POST)
	public ModelAndView submitAdimission(@RequestParam("StudentName") String name,@RequestParam("City") String city) {
		ModelAndView modelview=new ModelAndView("submit");
		 modelview.addObject("welcomemessage","Hello user " +name+ " from "+city);
		return modelview;
	}


//public class HelloController extends AbstractController{
//		
//	@Override
//	protected ModelAndView handleRequestInternal(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception {
//		ModelAndView modelview=new ModelAndView("Home");
//		modelview.addObject("welcomemessage","Hiii user,welcome to the first spring mvc application");
//		return modelview;
//	}

}