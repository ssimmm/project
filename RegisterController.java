package com.demo.controller;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.LoginService;


@RestController
public class RegisterController {
    
	
	LoginService loginService=new LoginService();
	/*@RequestMapping(method=RequestMethod.GET)
	public String viewRegistration(Map<String, Object> model) {
        User userForm = new User();    
*/  


    @RequestMapping(value="/register/{p_id}/{p_address}/{p_mobno}/{p_gender}/{p_age}/{p_name}/{f_id}/{p_pwd}",method = RequestMethod.POST)
    	 public String addUser(@PathVariable int p_id,@PathVariable String p_address ,@PathVariable long p_mobno,@PathVariable String p_gender,
    			 @PathVariable int p_age,@PathVariable String p_name,@PathVariable int f_id,@PathVariable String p_pwd)throws SQLException,IOException, ServletException{ 
    		  User login=new User();
    		  login.setP_id(p_id);
    		  login.setP_address(p_address);
    		  login.setP_mobno((int) p_mobno);
    		  login.setP_gender(p_gender);
    		  login.setP_age(p_age);
    		  login.setP_name(p_name);
    		  login.setF_id(f_id);
    		  login.setP_pwd(p_pwd);
    	      String app=loginService.addUser(login);
    	      System.out.println(app);
    	      return app;
    	

    }
}
