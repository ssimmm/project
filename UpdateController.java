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
import com.demo.service.UpdateService;
import com.demo.service.ViewService;

@RestController
public class UpdateController {

	 UpdateService upd=new  UpdateService();
	
	 
	 @RequestMapping(value="/update/{f_id}/{arr_date}/{dep_date}/{class_type}/{from_loc}/{to_loc}",method = RequestMethod.POST)
     public void updateUser(HttpSession session,@PathVariable int f_id,@PathVariable String arr_date,@PathVariable String dep_date,@PathVariable String class_type,@PathVariable String from_loc,@PathVariable String to_loc)throws SQLException,IOException, ServletException{ 
             Flight ff=new Flight();
            ff.setF_id(f_id); 
             ff.setArr_date(arr_date);
            
            ff.setDep_date(dep_date);
            ff.setClass_type(class_type);
            ff.setFrom_loc(from_loc);
            ff.setTo_loc(to_loc);
            
           
            
        
     
          upd.updateFlight(ff);
     
      }


	 
	/*
	 @RequestMapping(value="/view/{f_id}/{arr_date}/{dep_time}/{dep_date}/{class_type}/{from_loc}/{to_loc}/{arr_time}/{air_code}/{route_no}/{f_name}/{f_amt}",method = RequestMethod.POST)
	 public void updateUser(HttpSession session,@PathVariable int f_id,@PathVariable String arr_date,@PathVariable String dep_time,@PathVariable String dep_date,@PathVariable String class_type,@PathVariable String from_loc,@PathVariable String to_loc,@PathVariable String arr_time,@PathVariable int air_code,@PathVariable int route_no,@PathVariable String f_name,@PathVariable String f_amt)throws SQLException,IOException, ServletException{ 
		 Flight ff=new Flight();
		  ff.setF_id(f_id);
		 ff.setArr_date(arr_date);
		 ff.setDep_time(dep_time);
		 ff.setDep_date(dep_date);
		 ff.setClass_type(class_type);
		 ff.setFrom_loc(from_loc);
		 ff.setTo_loc(to_loc);
		 ff.setArr_time(arr_time);
		 ff.setArr_time(arr_time);
		 ff.setAir_code(air_code);
		 ff.setRoute_no(route_no);
		 ff.setF_amt(f_amt);
	   
	
	      ResultSet app=ser.updateFlight(ff);
}*/
}
