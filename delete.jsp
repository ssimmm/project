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
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">AirPath.com</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active">
      <a href="home.jsp">Home</a></li>
      <li><a href="index.jsp">Login</a></li>
  
      <li><a href="About.jsp">About us</a></li>
      
    </ul>

  </div>
</nav>





<font color="white">
Flight id:</font><input type="text" placeholder="Enter Flight_Id" ng-model="f_id" required><br><br>



<button ng-click="del()" >Delete</button>
<script>
var taskManagerModule = angular.module('taskManagerApp', []);
taskManagerModule.controller('taskManagerController', function ($scope,$http,$window) 
{
var urlBase="http://localhost:8080/RegisterDemo";
$http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded";

//add a new task
$scope.del = function del() 
 {
       alert("In function");
       /* if($scope.p_id=="" || $scope.p_address=="" || $scope.p_mobno == "" || $scope.p_gender == ""||$scope.p_age == ""
                     ||$scope.p_name == ""||$scope.f_id == ""||$scope.p_pwd == "")
             {
                 alert("Insufficient Data! Please provide values");
                }
       else
                */
   $http.post(urlBase + '/delete/'+$scope.f_id).success(function(data) {
                     
    alert("Deleted");
                        $window.location="DelSuccess.jsp";

    $scope.users = data; 
    $scope.f_id="";
  
 
      });
   alert("End of fn");

              }

}); 

</script>

</body>
</html>
