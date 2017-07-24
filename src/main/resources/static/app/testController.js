var myApp = angular.module('myApp',[]);

myApp.controller('Controller', ['$scope','$http', function($scope,$http) {
	$scope.data = [];
	this.aa = [];
	$scope.output = "first test <3";
	$scope.list = [
		{
			"name" : "mar1",
				"price" : 1001
		},
		{
			"name" : "mar2",
			"price" : 1002
		}
	];
	
	
	$scope.controllerFunction = function() { 
		
		var url = "/book/print/MAR";
		$http.get(url).success(function(response){
		$scope.data = response;
		this.aa = response;
		
		console.log($scope.data);
		
		});
	};
	
}]);
