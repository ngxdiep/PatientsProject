var app = angular.module('myApp');
app.controller('historyController', function(
        $scope, $interval, $location,$http , historyService) {
	
	
	
////==========Get All History=======================================
	$http.get("http://localhost:8080/history").then(function(response) {
		$scope.historys = response.data;
	});
	
	$scope.getHistory= function(){
		historyService.getHistory().then(getAllSuccess,getAllError)
	}
	var getAllSuccess = function(data) {
		$scope.historys = data;
	};
	var getAllError = function(error) {
	};

});