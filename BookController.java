package com.demo.controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Flight;
import com.demo.service.Booking;

@RestController
public class BookController {

	@Autowired
	Booking booking=new Booking();
	
	@RequestMapping(value="/book/{arr_date}/{dep_date}/{class_type}/{from_loc}/{to_loc}/{air_code}",method = RequestMethod.POST)
 public void addUser(HttpSession session,@PathVariable String arr_date,@PathVariable String dep_date,@PathVariable String class_type,@PathVariable String from_loc,@PathVariable String to_loc,@PathVariable int air_code)throws SQLException,IOException, ServletException 
 { Flight flight=new Flight();
		System.out.println("in controller");
		 System.out.println(arr_date); 
		 flight.setArr_date(arr_date);;
		     flight.setDep_date(dep_date);
		     flight.setClass_type(class_type);
		     flight.setFrom_loc(from_loc);
		    flight.setTo_loc(to_loc);
		   flight.setAir_code(air_code);
	    ResultSet app=booking.addUser(flight);
	//   System.out.println(app.getString(1));
	    System.out.println("Before while");
	 
	    List<Flight> listFlights=new ArrayList<Flight>(); 
	    while(app.next()){
	    	System.out.println("inside while");
		   Flight f=new Flight();
		   f.setF_id(app.getInt(1));
		   f.setArr_date(app.getString(2));
		   
		   f.setDep_date(app.getString(3));
		   f.setClass_type(app.getString(4));
		   f.setFrom_loc(app.getString(5));
		   f.setTo_loc(app.getString(6));
		   
		  
		   
		   listFlights.add(f);
		   
		   
		   
	    }
	    session.setAttribute("resultSet", listFlights);

	
	 }
	 }
	
	
	
	
	
	
	/*@RequestMapping
	public ResultSet submit(Model model,HttpServletRequest request,
			HttpServletResponse response) throws SQLException, IOException, ParseException, ServletException {
		Flight flight=new Flight();
		String arr_date=request.getParameter("arr_date");
	String dep_date=request.getParameter("dep_date");
	String class_type=request.getParameter("class_type");
	String from_loc=request.getParameter("from_loc");
	String to_loc=request.getParameter("to_loc");
     Integer air_code=Integer.parseInt(request.getParameter("air_code"));
	
     Date dt=new SimpleDateFormat("yyyy-mm-dd").parse(dep_date);
     flight.setAir_code(air_code);
     
          SimpleDateFormat at=new SimpleDateFormat("yyyy-mm-dd");
			String a_date=request.getParameter("dep_date");
			java.util.Date arr_date=(java.util.Date) at.parse(a_date);
			Date at=new SimpleDateFormat("yyyy-mm-dd").parse(arr_date);
			 ResultSet app=form.addUser(flight);
   	      System.out.println(app);
   	      return app;*/
	
	
	
	