package com.demo.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Flight;
import com.demo.service.DeleteService;
@RestController
public class DeleteController {

	 
	
DeleteService del=new DeleteService();
@RequestMapping(value="/delete/{f_id}",method = RequestMethod.POST)
public void updateUser(HttpSession session,@PathVariable int f_id)throws SQLException,IOException, ServletException{ 
        Flight ff=new Flight();
       ff.setF_id(f_id); 
        
   

     del.deleteFlight(ff);

 }
}

