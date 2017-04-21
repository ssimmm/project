package com.demo.service;

import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import javax.servlet.ServletException;

import org.springframework.stereotype.Service;

import com.demo.dao.DBUtil;
import com.demo.model.Flight;

@Service
public class Booking {
	ResultSet rs;
	private static Connection connection;
	PreparedStatement ps;
	 CallableStatement cst=null;
	 
	public Booking(){
		
		connection=DBUtil.getMyConnection();
		if(connection !=null){
			System.out.println("connection done");}
			else
				System.out.println("connection not done");
		
		}
	
           public ResultSet addUser(Flight flight) throws ServletException, IOException, SQLException{
    	try{
    		String query="select * from flight190 where arr_date=? and dep_date=? and class_type=? and from_loc=? and to_loc=? and air_code=?";
    		System.out.println("Before query");
    		ps=connection.prepareStatement(query);
    		System.out.println("After query");
    	/*	ps.setInt(1, flight.getF_id());
    		ps.setString(2, flight.getArr_date());
    		ps.setString(3, flight.getDep_time());
    		ps.setString(4,flight.getDep_date());
    		ps.setString(5,flight.getClass_type());
    		ps.setString(6,flight.getFrom_loc());
    		ps.setString(7,flight.getTo_loc());
    		ps.setString(8, flight.getArr_time());
    		ps.setInt(9,flight.getAir_code());
    		ps.setInt(10, flight.getRoute_no());*/
    		ps.setString(1, flight.getArr_date());
    		ps.setString(2,flight.getDep_date());
    		ps.setString(3,flight.getClass_type());
    		ps.setString(4,flight.getFrom_loc());
    		ps.setString(5,flight.getTo_loc());
    		ps.setInt(6,flight.getAir_code());
    		rs=ps.executeQuery();

    		System.out.println("In service");
    		//System.out.println(rs.getString(1));

    		//System.out.println(rs.getString(1));
    		
    	} catch (SQLException e)
		  {
			e.printStackTrace();
		  }
			/*  try 
			  {
			     cst = connection.prepareCall("{call SELECTflight(?,?,?,?,?,?,?,?,?,?)}");
			     cst.setInt(1,flight.getF_id());
			     cst.registerOutParameter(2,Types.VARCHAR);
			     //cst.setString(2, flight.getArr_date());
			     cst.setString(3, flight.getDep_time());
			     cst.registerOutParameter(4,Types.VARCHAR);
			     cst.registerOutParameter(5,Types.VARCHAR);
			     cst.registerOutParameter(6,Types.VARCHAR);
			     cst.registerOutParameter(7,Types.VARCHAR);
			     cst.setString(8,flight.getArr_time());
			     cst.registerOutParameter(9,Types.VARCHAR);
			     cst.setInt(10,flight.getRoute_no());
			   rs = cst.executeQuery();
			  }
			  catch (SQLException e)
			  {
				e.printStackTrace();
			  }
		*/
          /*  while(rs.next())
            {
            	
            	rs.getString(1);
            	rs.getString(2);
            	rs.getString(3);
            	rs.getString(4);
            	rs.getString(5);
            	rs.getString(6);
            }
			 */
	   return rs;
		
}
}
