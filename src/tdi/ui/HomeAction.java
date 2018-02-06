package tdi.ui;

import tdi.entity.Employee;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import tdi.dao.PropinsiRepo;
import tdi.entity.Propinsi;


@Controller
public class HomeAction {
    @Autowired
    private PropinsiRepo propinsiRepo;
    
	   @RequestMapping(path= "/greet/{name}",method=RequestMethod.GET)    
	    public String greet(@PathVariable String name, ModelMap model){
	        String greet =" Hello !!!" + name + " How are You?";
	        model.addAttribute("greet", greet);
	        System.out.println(greet);
	        
	        return "halo";
	    } 
            @RequestMapping(path= "/object",method=RequestMethod.GET)    
	    public String classTest(ModelMap model){
	        Employee emp1 = new Employee(1,"Gian");
	        model.addAttribute("em", emp1);
	        model.addAttribute("pr",propinsiRepo.cari(11));
                model.addAttribute("x",propinsiRepo.show());
	        return "ClassTest";
	    } 
            @RequestMapping(path= "/gian",method=RequestMethod.GET)    
	    public String greet1(HttpServletRequest request){
	        String cekNama = request.getParameter("tank");
                request.setAttribute("lala", cekNama);
	        //System.out.println(greet);
	        return "test";
	    } 
}

 
 