<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="taskManagerApp" ng-controller="taskManagerController">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.5/angular.min.js"></script>

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
        <li><a href="Logout.jsp">Logout</a></li>
    </ul>

  </div>
</nav>
<center>


Flight id:<input type="text" placeholder="Enter Flight Id" ng-model="f_id" required><br><br>
Arrival date:<input type="text" placeholder="Enter Arrival Date" ng-model="arr_date" required><br><br>

Departure date:<input type="text" placeholder="Enter Departure date" ng-model="dep_date" required><br><br>
Class type:<input type="text" placeholder="Enter Class type" ng-model="class_type" required><br><br>
From :<input type="text" placeholder="Enter Location" ng-model="from_loc" required><br><br>
Destination:<input type="text" placeholder="Enter Destination" ng-model="to_loc" required><br><br>




<button ng-click="update()" >Update</button>
</center>
<script>
var taskManagerModule = angular.module('taskManagerApp', []);
taskManagerModule.controller('taskManagerController', function ($scope,$http,$window) 
{
var urlBase="http://localhost:8080/RegisterDemo";
$http.defaults.headers.post["Content-Type"] = "application/x-www-form-urlencoded";

//add a new task
$scope.update = function update() 
 {
       alert("In function");
       /* if($scope.p_id=="" || $scope.p_address=="" || $scope.p_mobno == "" || $scope.p_gender == ""||$scope.p_age == ""
                     ||$scope.p_name == ""||$scope.f_id == ""||$scope.p_pwd == "")
             {
                 alert("Insufficient Data! Please provide values");
                }
       else
                */
   $http.post(urlBase + '/update/'+$scope.f_id+'/'+$scope.arr_date+'/'+$scope.dep_date+'/'+$scope.class_type+'/'+$scope.from_loc+'/'+$scope.to_loc).success(function(data) {
                     
    alert("Updated");
                        
 
    $scope.users = data; 
    $scope.f_id="";
    $scope.arr_date="";
    
    $scope.dep_date="";
    $scope.class_type="";
    $scope.from_loc="";
    $scope.to_loc="";
  
    
    

      });
   alert("End of fn");

              }

}); 

</script>
<br><br><br><br><br>
<font color="white">
<link href="https://fortawesome.github.io/Font-Awesome/assets/font-awesome/css/font-awesome.css" rel="stylesheet">
<!--footer start from here-->
<footer>
  <div class="container">
    <div class="row">
      <div class="col-md-4 col-sm-6 footerleft ">
        <div class="logofooter"> Logo</div>
        <p>Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley.</p>
        <p><i class="fa fa-map-pin"></i> 210, Aggarwal Tower, Rohini sec 9, New Delhi - ???????110085, INDIA</p>
        <p><i class="fa fa-phone"></i> Phone (India) : +91 9999 878 398</p>
        <p><i class="fa fa-envelope"></i> E-mail : AirPath.com</p>
        
      </div>
      <div class="col-md-2 col-sm-6 paddingtop-bottom">
        <h6 class="heading7">GENERAL LINKS</h6>
        <ul class="footer-ul">
          <li><a href="Career.jsp"> Career</a></li>
          <li><a href="Privacy.jsp"> Privacy Policy</a></li>
          <li><a href="tnc.jsp"> Terms & Conditions</a></li>
          <li><a href="faq.jsp"> Frequently Ask Questions</a></li>
        </ul>
      </div>
      <div class="col-md-3 col-sm-6 paddingtop-bottom">
        <h6 class="heading7">LATEST POST</h6>
        <div class="post">
         <div class="col-md-6">
      <ul class="bottom_ul">
        <li><a href="#">AirPath.com</a></li>
        <li><a href="About.jsp">About us</a></li>

        <li><a href="contact.jsp">Contact us</a></li>
      </ul>
    </div>
        </div>
      </div>
      <div class="col-md-3 col-sm-6 paddingtop-bottom">
        <div class="fb-page" data-href="https://www.facebook.com/facebook" data-tabs="timeline" data-height="300" data-small-header="false" style="margin-bottom:15px;" data-adapt-container-width="true" data-hide-cover="false" data-show-facepile="true">
         
        </div>
      </div>
    </div>
  </div>
</footer>
<!--footer start from here-->

<div class="copyright">
  <div class="container">
    <div class="col-md-6">
      <p>© 2017 AirPath.com. All brands are trademarks of their respective owners.
      </p>
    </div>
   
  </div>
</div>
</font>
</body>
</html>



