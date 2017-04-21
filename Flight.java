package com.demo.model;


import java.sql.Timestamp;
import java.util.Date;

public class Flight {

	private int f_id;
	private String arr_date;
	private String dep_time;
	@Override
	public String toString() {
		return "Flight [f_id=" + f_id + ", arr_date=" + arr_date + ", dep_time=" + dep_time + ", dep_date=" + dep_date
				+ ", class_type=" + class_type + ", from_loc=" + from_loc + ", to_loc=" + to_loc + ", arr_time="
				+ arr_time + ", air_code=" + air_code + ", route_no=" + route_no + "]";
	}

	private String dep_date;
	private String class_type;
	private String from_loc;
	private String to_loc;
	private String arr_time;
	private int air_code;
	private int route_no;
	private String f_name;
	
	public String getF_name() {
		return f_name;
	}



	public void setF_name(String f_name) {
		this.f_name = f_name;
	}



	public Flight() {
		super();
	}

  

	public Flight(int f_id, String arr_date, String dep_time, String dep_date, String class_type, String from_loc,
			String to_loc, String arr_time, int air_code, int route_no) {
		super();
		this.f_id = f_id;
		this.arr_date = arr_date;
		this.dep_time = dep_time;
		this.dep_date = dep_date;
		this.class_type = class_type;
		this.from_loc = from_loc;
		this.to_loc = to_loc;
		this.arr_time = arr_time;
		this.air_code = air_code;
		this.route_no = route_no;
	}



	public String getDep_time() {
		return dep_time;
	}

	public void setDep_time(String dep_time) {
		this.dep_time = dep_time;
	}

	public String getDep_date() {
		return dep_date;
		  }
  public void setDep_date(String dep_date) {
		this.dep_date = dep_date;
	}

	public int getF_id() {
		return f_id;
	}

	public void setF_id(int f_id) {
		this.f_id = f_id;
	}

	public String getArr_date() {
	  return arr_date;
	}

	public void setArr_date(String arr_date) {
		this.arr_date = arr_date;
	}

	public String getClass_type() {
		return class_type;
	}

	public void setClass_type(String class_type) {
		this.class_type = class_type;
	}

	public String getFrom_loc() {
		return from_loc;
	}

	public void setFrom_loc(String from_loc) {
		this.from_loc = from_loc;
	}

	public String getTo_loc() {
		return to_loc;
	}

	public void setTo_loc(String to_loc) {
		this.to_loc = to_loc;
	}

	public String getArr_time() {
		return arr_time;
	}

	public void setArr_time(String arr_time) {
		this.arr_time = arr_time;
	}

	public int getAir_code() {
		return air_code;
	}

	public void setAir_code(int air_code) {
		this.air_code = air_code;
	}

	public int getRoute_no() {
		return route_no;
	}

	public void setRoute_no(int route_no) {
		this.route_no = route_no;
	}
	
	
	
}
