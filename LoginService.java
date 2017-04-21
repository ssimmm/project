package com.demo.service;
import com.demo.model.User;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import com.demo.dao.DBUtil;

@Service
public class LoginService {
	
	private static Connection connection;
	 private CallableStatement cst=null;
	 private PreparedStatement pst=null;
	 private ResultSet rst=null;
	HttpServletRequest request;
	 HttpServletResponse response;
	public LoginService(){
		
	connection=DBUtil.getMyConnection();
	if(connection !=null){
		System.out.println("connection done");}
		else
			System.out.println("connection not done");
	
	}
	

	                
      public String addUser(User user) throws ServletException, IOException{
    	
			  try 
			  {
			     cst = connection.prepareCall("{call INSERTpassenger(?,?,?,?,?,?,?,?)}");
			     cst.setInt(1,user. getP_id());
			     cst.setString(2,user.getP_address());
			     cst.setLong(3,user.getP_mobno());
			     cst.setString(4,user.getP_gender());
			     cst.setInt(5,user.getP_age());
			     cst.setString(6, user.getP_name());
			     cst.setInt(7,user.getF_id());
			     cst.setString(8,user.getP_pwd());
			    cst.execute();
			    
			  }
			  catch (SQLException e)
			  {
				 // RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
			    	
					//rd.forward(request, response);
			  }
			  String o=user.getP_name();
			  System.out.println("WELCOME "+o);
              return o;
              
		
		 }	   
	   
	   
}
				
				

