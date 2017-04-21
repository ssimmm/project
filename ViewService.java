package com.demo.service;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.DBUtil;
import com.demo.model.Flight;

public class ViewService {

	private static Connection connection;
	 private CallableStatement cst=null;
	 private PreparedStatement pst=null;
	 private ResultSet rs=null;
	HttpServletRequest request;
	 HttpServletResponse response;
	public ViewService(){
		
	connection=DBUtil.getMyConnection();
	if(connection !=null){
		System.out.println("connection done");}
		else
			System.out.println("connection not done");
	
	}
	
	
/*	public ResultSet updateFlight(Flight ff) {
		try{
			String s = "select * from flight_201277";
			PreparedStatement ps=connection.prepareStatement(s);
			ps.setString(1,ff.getArr_date());
			ps.setString(2, ff.getDep_time());
			ps.setString(3, ff.getDep_date());
			ps.setString(4, ff.getClass_type());
			ps.setString(5, ff.getFrom_loc());
			ps.setString(6, ff.getTo_loc());
			ps.setString(7, ff.getArr_time());
			ps.setString(8, ff.getF_name());
			ps.setString(9, ff.getF_amt());
			ps.setInt(10, ff.getF_id());
		    rs= ps.executeQuery();
				 
			
			
		}    
		catch(Exception e){
				e.printStackTrace();
			}
		
	return rs;
	}
*/

	public static List<Flight> getAllFlights() throws SQLException {
        List<Flight> bs=new ArrayList<Flight>();
        System.out.println("In service");
        String query="select * from flight190 order by f_id";
        Statement smt=connection.createStatement();
        System.out.println("Before execute query");
        ResultSet rs=smt.executeQuery(query);
        System.out.println("After execute query");
        if(rs!=null){
               System.out.println("found");
        }
        else{
               System.out.println("not found");
        }
        while(rs.next()){
               Flight bs1=new Flight();
               bs1.setF_id(rs.getInt("f_id"));
               bs1.setArr_date(rs.getString("arr_date"));
               
               bs1.setDep_date(rs.getString("dep_date"));
               bs1.setClass_type(rs.getString("class_type"));
               bs1.setFrom_loc(rs.getString("from_loc"));
               bs1.setTo_loc(rs.getString("to_loc"));
               
               bs1.setAir_code(rs.getInt("air_code"));
               bs1.setRoute_no(rs.getInt("route_no"));
               
              
              
      bs.add(bs1);
        }
        return bs;
        
 }

	}
	
	


