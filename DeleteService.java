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

public class DeleteService {

	private static Connection connection;
	 private CallableStatement cst=null;
	 private PreparedStatement pst=null;
	 private ResultSet rs=null;
	HttpServletRequest request;
	 HttpServletResponse response;
	public DeleteService(){
		
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

    public void deleteFlight(Flight ff) throws SQLException {
        
        try 
            {
               cst = connection.prepareCall("{call DELETEflight(?)}");
               cst.setInt(1,ff.getF_id());
               cst.execute();
            }
            catch (SQLException e)
            {
                   e.printStackTrace();
            }

    }
}
	


