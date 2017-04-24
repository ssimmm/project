<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="taskManagerApp" ng-controller="taskManagerController">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.5/angular.min.js"></script>

 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
 

</head>
<body background="http://cache.marriott.com/Images/Rewards/earn/airline_programs.jpg"></body> 
<body>


<div>

 <center><div class="container">
    <label><b>Id</b></label>
    <input type="number" placeholder="Enter Email" ng-model="p_id" required><br><br>
    
     <label><b>Address</b></label>
    <input type="text" placeholder="Enter Address" ng-model="p_address" required><br><br>
    
     <label><b>Mobile no</b></label>
    <input type="number" placeholder="Enter Mobile no" ng-model="p_mobno" required><br><br>
    
 <label><b>Gender</b></label>
    <input type="text" placeholder="Enter Gender" ng-model="p_gender" required><br><br>

 <label><b>Age</b></label>
    <input type="number" placeholder="Enter Age" ng-model="p_age" required><br><br>

 <label><b>Name</b></label>
    <input type="text" placeholder="Enter Name" ng-model="p_name" required><br><br>

 <label><b>Flight id</b></label>
    <input type="number" placeholder="Enter Flight Id" ng-model="f_id" required><br><br>


    <label><b>Password</b></label>
    <input type="password" placeholder="Enter Password" ng-model="p_pwd" required><br><br>

   
    <input type="checkbox" checked="checked"> Remember me
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <div class="clearfix">
     <button ng-click="addUser()" class="btn-panel-big">Register</button>
    </div>
  </div></center>



</div>
</div>

<script>
var taskManagerModule = angular.module('taskManagerApp', []);
taskManagerModule.controller('taskManagerController', function ($scope,$http,$window) 
{
 var urlBase="http://localhost:8080/RegisterDemo";
 $http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded";
 
//add a new task
 $scope.addUser = function addUser() 
 {
	 alert("In function");
	 /* if($scope.p_id=="" || $scope.p_address=="" || $scope.p_mobno == "" || $scope.p_gender == ""||$scope.p_age == ""
			 ||$scope.p_name == ""||$scope.f_id == ""||$scope.p_pwd == "")
	      {
		   alert("Insufficient Data! Please provide values");
		  }
	 else
		  */
   $http.post(urlBase + '/register/' +$scope.p_id+'/'+$scope.p_address+'/'+$scope.p_mobno+'/'+$scope.p_gender+'/'+
		   $scope.p_age+'/'+$scope.p_name+'/'+$scope.f_id+'/'+$scope.p_pwd).success(function(data) {
			
    alert("User added");
			   
    $window.location="Success.jsp";
    $scope.users = data; 
    $scope.p_id="";
    $scope.p_address="";
    $scope.p_mobno="";
    $scope.p_gender="";
    $scope.p_age="";
    $scope.p_name="";
    $scope.f_id="";
    $scope.p_pwd="";
      });
		 
	 alert("End of function");
		 };
 
}); 

</script>

</body>
</html>