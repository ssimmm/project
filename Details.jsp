<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="busDetails" ng-controller="detailController">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.2.5/angular.min.js"></script>
</head>
<body>
<table cellpadding="20" cellspacing="20">
<thead>
<tr>
      <th colspan="8">Flight Details</th>
</tr>
<tr>
      <th>Flight Id</th>
      <th>Arrival date</th>
      
      <th>Departure date</th>
      <th>Class type</th>
      <th>From location</th>
      <th>To location</th>
      
      <th>Airport code</th>
      <th>Route no</th>
      
      
      <th>Update</th>
</tr> 
</thead>
<tbody>
      <tr ng-repeat="flight in detail">
             <td>{{flight.f_id}}</td> 
              <td>{{flight.arr_date}}</td>
             
             <td>{{flight.dep_date}}</td>
             <td>{{flight.class_type}}</td>
             <td>{{flight.from_loc}}</td>
             <td>{{flight.to_loc}}</td>
              
              <td>{{flight.air_code}}</td>
               <td>{{flight.route_no}}</td>
                
                 
        
   </tr>
    
</tbody>
</table>

<script>
var detailModule=angular.module('busDetails',[]);
detailModule.controller('detailController',function ($scope,$http)
{
var urlBase="http://localhost:8080/RegisterDemo";
//$http.defaults.header.post["Content-Type"]="application/x-www-form-urlencoded";

$http.get(urlBase+'/view').success(function(data){
       $scope.detail=data;
       
}).error(function(data,status){
console.error('Reported error',status,data);
});

});


</script>

</body>
</html>