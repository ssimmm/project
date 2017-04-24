<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="taskManagerApp">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.5/angular.min.js"></script>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<link rel="shortcut icon" href="">
</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Ixigo.com</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active">
      <a href="home.jsp">Home</a></li>
      <li><a href="login.jsp">Login</a></li>
      <li><a href="index.jsp">Book flights</a></li>
      <li><a href="About.jsp">About us</a></li>
      
    </ul>

  </div>
</nav>

<div>
<div  ng-controller="taskManagerController">

 <center><div class="container">
    <label><b>Arrival Date</b></label>
    <input type="text" placeholder="Enter Arrival date" ng-model="arr_date" required><br><br>
    
     <label><b>Departure date</b></label>
    <input type="text" placeholder="Enter Departure date" ng-model="dep_date" required><br><br>
    
     <label><b>Class</b></label>
    <input type="text" placeholder="Enter Class" ng-model="class_type" required><br><br>
    
 <label><b> Location</b></label>
  
      <select ng-model="from_loc"  value="Bangalore" required>
  <option value="Bangalore" ng-model="slocation">Bangalore</option>
  <option value="Kolkata" ng-model="slocation">Kolkata</option>
  <option value="Delhi" ng-model="slocation">Delhi</option>
   <option value="Bhubaneswar"  ng-model="slocation">Bhubaneswar</option>
  <option value="Pune" ng-model="slocation">Pune</option>
   <option value="Mumbai" ng-model="slocation">Mumbai</option>
</select>
    <br><br>

 <label><b>Destination</b></label>
  
     <select ng-model="to_loc"  required>
  <option value="Bangalore" ng-model="dlocation">Bangalore</option>
  <option value="Kolkata" ng-model="dlocation" selected>Kolkata</option>
  <option value="Delhi" ng-model="dlocation">Delhi</option>
   <option value="Bhubaneswar"  ng-model="dlocation">Bhubaneswar</option>
  <option value="Pune" ng-model="dlocation">Pune</option>
   <option value="Mumbai" ng-model="dlocation">Mumbai</option>
</select>
<br><br>

 <label><b> Airport</b></label>
  
    <select ng-model="air_code" value="1" required>
  <option value="1" ng-model="plocation">Bangalore</option>
  <option value="2"  ng-model="plocation">Kolkata</option>
  <option value="3"  ng-model="plocation">Bhubaneswar</option>
  <option value="4" ng-model="plocation">Pune</option>
   <option value="5" ng-model="plocation">Mumbai</option>
   <option value="6" ng-model="plocation">Delhi</option>
</select>
<br><br>


    <div class="clearfix">
     <button ng-click="clickButton()" class="btn-panel-big">Submit</button>
    </div>
  </div></center>



</div>
</div>

<script>

var taskManagerModule = angular.module('taskManagerApp', []);
taskManagerModule.controller('taskManagerController', function ($scope,$http,$window) 
{
 var urlBase="http://localhost:8080/RegisterDemo";
 //$http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded";
 
//add a new task
 $scope.clickButton = function clickButton()
 {
	 alert("In function" + urlBase);
/*	  if($scope.arr_date=="" || $scope.dep_date=="" || $scope.class_type == "" || $scope.from_loc == ""||$scope.to_loc == ""
			 ||$scope.air_code == "")
	      {
		   alert("Insufficient Data! Please provide values");
		  }
	 else
	*/	  
   $http.post(urlBase + '/book/' +$scope.arr_date+'/'+$scope.dep_date+'/'+$scope.class_type+'/'+$scope.from_loc+'/'+
		   $scope.to_loc+'/'+$scope.air_code).success(function(data) {
			
    alert("Details are:");
    
     $window.location="Details.jsp";
    $scope.users = data; 
    $scope.arr_date="";
    $scope.dep_date="";
    $scope.class_type="";
    $scope.from_loc="";
    $scope.to_loc="";
    $scope.air_code=""; 
  
      })
		 
	 alert("End of function");
 }
 
}); 

</script>

</body>
</html>